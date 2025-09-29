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
    class Pair{
        int index;
        TreeNode node;
        Pair(int index,TreeNode node){
            this.index=index;
            this.node=node;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int ans = 0;
        Queue <Pair> q = new LinkedList <> ();
        q.offer(new Pair(0,root));
        while(!q.isEmpty()){
            int size = q.size();
            int min = q.peek().index; // storing minimum eindex of very level
            int first =0;
            int last=0;
            for(int i=0;i<size;i++){
                int current_index=q.peek().index-min; //subtraacting minimum index of that level from evry index
                TreeNode node = q.peek().node;
                q.poll();
                if(i==0) first=current_index;
                if(i==(size-1)) last=current_index;
                if(node.left!=null) q.offer(new Pair(current_index*2+1,node.left));
                if(node.right!=null) q.offer(new Pair(current_index*2+2,node.right));
            }
            ans = Math.max(ans,last-first+1);
        }
        return ans;
    }
}