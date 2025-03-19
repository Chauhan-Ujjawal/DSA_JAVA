class Solution {
    // Reverse LinkedList iteratively
    public static ListNode reverseLL(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev; // New head of reversed linked list
    }
    public int[] nextLargerNodes(ListNode head) {
        // Step 1: Reverse the LinkedList
        ListNode temp = reverseLL(head);
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        // Step 2: Traverse the reversed linked list using only ONE while loop
        while (temp != null) {
            // Maintain stack to find the next greater element
            while (!stack.isEmpty() && stack.peek() <= temp.val) {
                stack.pop();  // Remove smaller elements
            }
            // If stack is empty, no greater element exists
            int nge = stack.isEmpty() ? 0 : stack.peek();
            // Push current node value into stack
            stack.push(temp.val);
            // Store result
            list.add(nge);
            // Move to next node
            temp = temp.next;
        }
        // Step 3: Reverse the result list before returning
        Collections.reverse(list);
        // Convert ArrayList<Integer> to int[]
        return list.stream().mapToInt(i -> i).toArray();
    }
}
