/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //using slow and fast pointer and increementing fast pointer n times
        //and then advancing slow and fast pointers together one at a time.
        ListNode slow=head;
        ListNode fast=head;
        for(int i=0;i<n;i++) fast=fast.next;
        //if fast becomes null that means nth node from end is head
        if(fast==null) return head.next;
        //now increementing slow and fast until fast!=null
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;

        }
        //now slow pointer is one node behind of the node to be deleted
        ListNode deleteNth=slow.next;
        slow.next=slow.next.next;
        deleteNth=null;
        return  head;
    }
}