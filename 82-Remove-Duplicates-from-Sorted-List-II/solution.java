/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode dumpy = new ListNode(0);
        dumpy.next = head;
        head = dumpy;
        
        while(head.next != null && head.next.next != null ){
            if(head.next.val == head.next.next.val){
                int val = head.next.val;
                while(head.next != null && head.next.val == val)
                    head.next = head.next.next;
            }
            else{
                head = head.next;
            }
        }
     
       return dumpy.next;
        
        
    }
}
