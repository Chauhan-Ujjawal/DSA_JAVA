import java.util.Stack;

class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        
        // Step 1: Push nodes in stack while ensuring a decreasing order
        while (temp != null) {
            while (!stack.isEmpty() && stack.peek().val < temp.val) {
                stack.pop();
            }
            stack.push(temp);
            temp = temp.next;
        }
        
        // Step 2: Reconstruct the list from stack
        ListNode newHead = null;
        while (!stack.isEmpty()) {
            ListNode node = stack.pop();
            node.next = newHead;
            newHead = node;
        }
        
        return newHead;
    }
}
