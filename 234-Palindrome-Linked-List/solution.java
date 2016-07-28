/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null)
           return true;
        
        int length = 0;
        ListNode oldhead = head;
        while(oldhead != null){
            length ++ ;
            oldhead = oldhead.next;
        }
        
        ListNode midNode = head;
        for(int i = 0 ; i<(length-1)/2;i ++)
            midNode = midNode.next;
        
        ListNode newhead = reverseList(midNode.next);
        while(head != null && newhead != null){
            if(head.val != newhead.val)
                return false;
            head = head.next;
            newhead = newhead.next;
        } 
        return true;
        
    }
    
    public ListNode reverseList(ListNode head){
        
        if(head == null)
            return null;
        
        ListNode pre = null;
        ListNode cur = head;
        ListNode nex = cur.next;
        cur.next = pre;
        
        while(nex != null){
            pre = cur;
            cur = nex;
            nex = nex.next;
            cur.next = pre;
        }
        return cur;
    }
}