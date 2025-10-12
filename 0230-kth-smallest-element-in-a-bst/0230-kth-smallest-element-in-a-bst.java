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
    public int kthSmallest(TreeNode root, int k) {
        if(root==null || k<0) return -1;
        ArrayList<Integer> list = new ArrayList<>();
        TreeNode current = root;
        while(current!=null){
            if(current.left==null){
                list.add(current.val);
                current=current.right;
            }
            else{
                TreeNode runner = current.left;
                while(runner.right!=null && runner.right!=current){
                    runner=runner.right;
                }
                if(runner.right==null){
                    runner.right=current;
                    current=current.left;           
                }
                else{
                    runner.right=null;
                    list.add(current.val);
                    current=current.right;
                }
            }
        }
        if(k > list.size() ) return -1;
        return list.get(k-1);
    }
}