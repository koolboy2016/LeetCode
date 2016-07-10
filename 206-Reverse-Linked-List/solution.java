/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null)
			return head;

		ListNode firstpoint = head;
		ListNode secondpoint = head.next;
		ListNode threepoint;
		firstpoint.next = null;

		while (secondpoint != null) {
			threepoint = secondpoint.next;
			secondpoint.next = firstpoint;
			firstpoint = secondpoint;
			secondpoint = threepoint;
		}

		return firstpoint;
    }
}
