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
        
        if(head == null || head.next == null)
            return head;
        ListNode firstpoint = head;
        ListNode secondpoint = head.next;
        
        while(secondpoint != null){
            if(secondpoint.val == firstpoint.val){
                secondpoint = secondpoint.next;
                firstpoint.next = secondpoint;
            }
            else{
                firstpoint = secondpoint;
                secondpoint = secondpoint.next;
            }
        }
        return head;
    }
}