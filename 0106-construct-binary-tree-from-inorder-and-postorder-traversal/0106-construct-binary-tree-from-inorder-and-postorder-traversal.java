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
    public TreeNode maketree(int[] postorder,int ps,int pe,int[] inorder,int is,int ie,Map<Integer,Integer> map){
        if(ps>pe || is>ie) return null;
        TreeNode root = new TreeNode(postorder[pe]);
        int i_root = map.get(root.val);
        int remain_left=i_root-is;
        root.left=maketree(postorder,ps,ps+remain_left-1,inorder,is,i_root-1,map);
        root.right=maketree(postorder,ps+remain_left,pe-1,inorder,i_root+1,ie,map);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null || postorder==null || inorder.length!=postorder.length) return null;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        TreeNode root = maketree(postorder,0,postorder.length-1,inorder,0,inorder.length-1,map);
        return root;
    }
}