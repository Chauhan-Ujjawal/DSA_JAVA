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
    //pre_start : starting of prorder array 
    //pre_end : ending of preorder array 
    //in_start : starting of inorder array 
    //in_end : ending of inorder array 
    public TreeNode maketree(int[] preorder,int pre_start,int pre_end,int[] inorder,int in_start,int in_end, Map<Integer,Integer> map){
        if(pre_start > pre_end || in_start > in_end) return null;
        TreeNode root = new TreeNode(preorder[pre_start]);
        //finding root index in inorder array 
        int index_root_inorder=map.get(root.val);
        //finding ki kiite nodes leftsubtree me hain
        int remaining_left=index_root_inorder-in_start;
        root.left=maketree(preorder,pre_start+1,pre_start+remaining_left,inorder,in_start,index_root_inorder-1,map);
        root.right=maketree(preorder,pre_start+remaining_left+1,pre_end,inorder,index_root_inorder+1,in_end,map);
        return root;

    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //first of all 
        //storing all the elements of inorder array in a hashmap with index
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        //pointer to the root node of new tree
        TreeNode root = maketree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
        return root;
    }
}