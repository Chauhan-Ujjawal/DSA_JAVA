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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
            size++;
        }
        temp=head;
        Collections.sort(list);
        int k=0;
        while(k!=size){
            temp.val=list.get(k);
            k++;
            temp=temp.next;
        }
        return head;
    }
}