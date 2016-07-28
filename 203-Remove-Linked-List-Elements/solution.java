/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
    
        if(head == null)
            return head;
        ListNode newhead = head;
        
        while(newhead.next != null){
            if(newhead.next.val == val)
                newhead.next = newhead.next.next;
            else
                newhead = newhead.next;
        }
        if(head.val == val)
            return head.next;
        else
            return head;
        
    }
}