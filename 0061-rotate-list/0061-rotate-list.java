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
    public ListNode rotateRight(ListNode head, int k) {
        //calculating the length of the linked list
        if(head==null || head.next==null|| k==0) return head;
        ListNode temp = head;
        int length=1;
        while(temp.next!=null){
            length++;
            temp=temp.next;
        }
        if(k%length==0) return head;
        temp.next=head;
        //connecting lastNode with the head of the linked list
        k = k%length;
        int last=length-k;
        while(last!=0){
            last--;
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}