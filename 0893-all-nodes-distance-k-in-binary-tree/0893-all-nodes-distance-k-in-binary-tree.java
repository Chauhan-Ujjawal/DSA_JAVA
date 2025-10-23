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
    //finding pointer to target node and parent of every node 
    public static void parentFinder(TreeNode root , TreeNode target , Map<TreeNode,TreeNode> findParent){
        Queue<TreeNode> q1 = new ArrayDeque<>();
        q1.offer(root);
        while(!q1.isEmpty()){
            TreeNode current = q1.poll();
            if(current.left!=null){
                findParent.put(current.left,current);
                q1.offer(current.left);
            }
            if(current.right!=null){
                findParent.put(current.right,current);
                q1.offer(current.right);
            }
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode> findParent = new HashMap<>();
        parentFinder(root,target,findParent);
        //making a visited hashmap to keep a record of visited nodes 
        Map<TreeNode,Boolean> visited = new HashMap<>();
        //making queue for traversal BFS
        Queue<TreeNode> q2= new ArrayDeque<>();
        //making level counter 
        int counter=0;
        //pushing our target node in queue and marking it as visited
        q2.offer(target);
        visited.put(target,true);
        while(!q2.isEmpty()){
            if(counter==k) break;
            counter++;
            int size = q2.size();
            for(int i=0;i<size;i++){
                TreeNode current = q2.poll();
                //if current left child is not visited and is not null
                //marking it as visited and pushing it in our q 
                if(current.left!=null && visited.get(current.left)==null){
                    visited.put(current.left,true);
                    q2.offer(current.left);
                }
                //similarly for right child
                if(current.right!=null && visited.get(current.right)==null){
                    visited.put(current.right,true);
                    q2.offer(current.right);
                }
                //checking if parent of current nodes are visited 
                //if not then marking them as visited and pushing them in our q
                if(findParent.get(current)!=null && visited.get(findParent.get(current))==null){
                    visited.put(findParent.get(current),true);
                    q2.offer(findParent.get(current));
                }
            }
        }
        //now converting the nodes of queue into an arrayList of integer
        List<Integer> result = new ArrayList<>();
        while(!q2.isEmpty()){
            TreeNode current = q2.poll();
            result.add(current.val);
        }
        return result;
        
    }
}