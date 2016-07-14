/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;
        ListNode firstnode = head;
        ListNode secondnode = head;
        while(firstnode.next != null && secondnode.next != null && secondnode.next.next != null){
            if(firstnode.next == secondnode.next.next)
                return true;
            else{
                firstnode = firstnode.next;
                secondnode = secondnode.next.next;
            }
        }
        return false;
    }
}