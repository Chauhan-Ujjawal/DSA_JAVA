/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root == q) return root;
        TreeNode left1=lowestCommonAncestor(root.left, p, q);
        TreeNode right1=lowestCommonAncestor(root.right, p, q);
        if(left1==null){
            return right1;
        }
        else if(right1==null){
            return left1;
        }
        return root;
        
    }
}