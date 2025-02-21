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
    public ListNode removeZeroSumSublists(ListNode head) {
        HashMap<Integer,ListNode> rec = new HashMap<>();
        ListNode dummy = new ListNode(0,head);
        ListNode temp = dummy ;
        int psum=0;
        while(temp!=null){
            psum+=temp.val;
            rec.put(psum,temp);
            temp=temp.next;
        }
        temp=dummy;
        psum=0;
        while(temp!=null){
            psum+=temp.val;
            temp.next=rec.get(psum).next;
            temp=temp.next;
        }
        return dummy.next;

        
    }
}