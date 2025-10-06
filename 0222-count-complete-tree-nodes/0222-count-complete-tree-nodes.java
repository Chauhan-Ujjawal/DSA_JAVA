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
    public static int leftd(TreeNode root){
        int dep=0;
        while(root!=null){
            root=root.left;
            dep++;
        }
        return dep;
    }
    public static int rightd(TreeNode root){
        int dep2=0;
        while(root!=null){
            root=root.right;
            dep2++;
        }
        return dep2;
    }
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int left=leftd(root);
        int right = rightd(root);
        if(left==right){
            return (int) Math.pow(2,left)-1;
        }
        else{
            return 1+countNodes(root.left)+countNodes(root.right);
        } 
    }
}