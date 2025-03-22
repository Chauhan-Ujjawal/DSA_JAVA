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
    public ListNode reversell(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode newhead=reversell(head.next);
        ListNode front = head.next;
        head.next=null;
        front.next=head;
        return newhead; 
    }
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second = reversell(slow.next);
        slow.next=null;
        ListNode first=head;
        while(second!=null){
            ListNode temp1=first.next;//creating pointer to next node of first node
            ListNode temp2=second.next;//creating pointer to the next node of middle node
            first.next=second; // Link first node to second
            second.next=temp1; // Link second node to the next of first
            first=temp1; // Move first pointer forward
            second=temp2; // Move second pointer forward
        } 
    }
}