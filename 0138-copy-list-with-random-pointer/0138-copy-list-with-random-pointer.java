/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;        
        // 1. Create copy nodes and insert them between original nodes
        Node temp = head;
        while (temp != null) {
            Node copy = new Node(temp.val);
            copy.next = temp.next;
            temp.next = copy;
            temp = copy.next;
        }        
        // 2. Replicating random pointers
        temp = head;
        while (temp != null) {
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }        
        // 3. Separating copy nodes from original nodes
        Node dummy = new Node(-1);
        Node res = dummy, copyTemp;
        temp = head;
        while (temp != null) {
            copyTemp = temp.next;
            res.next = copyTemp;
            temp.next = copyTemp.next;
            temp = temp.next;
            res = res.next;
        }       
        return dummy.next;
    }
}
