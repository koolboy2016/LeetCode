/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
            
        ListNode currentA = headA;
        ListNode currentB = headB;
        
        int lengthA = 0 ; 
        int lengthB = 0 ;
        
        while(currentA.next != null){
            
            currentA = currentA.next;
            lengthA += 1;
        }
        lengthA ++;
        while(currentB.next != null){
            currentB = currentB.next;
            lengthB += 1;
        }
        lengthB ++;
        
        if(currentA != currentB)
            return null;
        
        currentA = headA;
        currentB = headB;
        
        if(lengthA > lengthB){
            for(int i = 0 ;i < lengthA - lengthB; i ++)
                currentA = currentA.next;        
        }  
        if(lengthB > lengthA){
            for(int i = 0 ; i< lengthB - lengthA; i ++)
                currentB = currentB.next;
        }
        
        while(currentA != currentB){
            currentA = currentA.next;
            currentB = currentB.next;
        }
        
        return currentA;
        
        
    }
}