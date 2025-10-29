/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void helper(ArrayList<Integer> list , TreeNode root){
        if(root==null) return;
        helper(list,root.left);
        list.add(root.val);
        helper(list,root.right);
    }
    public boolean findTarget(TreeNode root, int k) {
        if(root==null) return false;
        ArrayList<Integer> list = new ArrayList<>();
        helper(list,root);
        int low=0;
        int high=list.size()-1;
        while(low<=high){
            if(low!=high && list.get(low)+list.get(high)==k) return true;
            else if(list.get(low)+list.get(high)<k){
                low++;
            }
            else{
                high--;
            } 
        }
        return false;
        
    }
}