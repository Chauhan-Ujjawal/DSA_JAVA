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
    public ListNode deleteMiddle(ListNode head) {
        //computing length of linked list
        ListNode temp = head;
        int n=0; //creating a temporary pointer
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        int k=n/2;
        if (head == null || head.next == null) return null;
        temp=head;
        for(int i=0;i<k-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}