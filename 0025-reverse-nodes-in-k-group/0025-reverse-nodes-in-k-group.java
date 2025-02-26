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
    public ListNode getKth(ListNode head,int k){
        k--;
        ListNode temp2=head;
        while(temp2!=null && k>0){
            k--;
            temp2=temp2.next;
        }
        return temp2;
    }
    public ListNode reverse(ListNode head){
        //recursive function to reverse linkedlist
        if(head==null || head.next==null) return head;
        ListNode newhead=reverse(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return newhead;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null || k==1) return head;
        ListNode temp=head;
        ListNode prev=null;
        ListNode next=null;
        while(temp!=null){
            ListNode kthnode=getKth(temp,k);
            if(kthnode==null){
                if(prev!=null){
                    prev.next=temp;
                    break;
                }
            }
            next=kthnode.next;
            kthnode.next=null;
            reverse(temp);
            if(temp==head){
                head=kthnode;
            }
            else{
                prev.next=kthnode;
            }
            prev=temp;
            temp=next;
        }
        return head;        
    }
}