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
    int maxi = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        sum(root);
        return maxi;       
    }
    public int sum(TreeNode node){
        if(node==null) return 0;
        //visiting left and right part of node 
        int left=Math.max(0,sum(node.left));
        int right = Math.max(0,sum(node.right));
        //calculating maximum value for every path
        maxi = Math.max(maxi,node.val+left+right);

        return node.val+Math.max(left,right);

        

    }
}