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
    public ListNode removeElements(ListNode head, int val) {
        ListNode t = new ListNode(8999);
       t.next = head;
       
       ListNode temp = t;
       while(temp.next!=null){
        if(temp.next.val==val){
            temp.next=temp.next.next;
        }else  temp=temp.next;
       }
       return t.next;
        
    }
}