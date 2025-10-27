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
    TreeNode first = null, middle = null, last = null, prev = null;

    public void inorder(TreeNode root){

        if(root==null) return;
        inorder(root.left);
        
        if((prev!=null) && (root.val<prev.val)){
            //if it's first violation then first node pointer will be null
            if(first==null){
                first = prev;
                middle=root;
            }
            //if first node pointer is not null that means first violation has bee found
            else{
                last=root;
            }
        }
        //if no violation then keep movinf prev pointer
        prev=root;
        inorder(root.right);

    }
    public void recoverTree(TreeNode root) {
        inorder(root);
        if(last==null){
            int temp=first.val;
            first.val=middle.val;
            middle.val=temp;
        }
        else{
            int temp=first.val;
            first.val=last.val;
            last.val=temp;
        }

        
    }
}