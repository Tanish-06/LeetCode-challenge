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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode t = head;
        while(t!=null && t.next!=null){
            if(t.next.val==t.val){
                t.next=t.next.next;
             
            }
            if(t.next==null){
            return head;
            }
            if(t.next.val!=t.val){
                t=t.next;
            }
        }
        
         return head;
    }
}