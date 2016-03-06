/**
 *  @ author : wanghao
 *  @ date : 3.6
 *
*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
      
		ListNode headNode = new ListNode(-1);
		headNode.next = head;
	    ListNode firstNode = headNode;
		ListNode secondNode = firstNode;

		// 移动第二个节点到第一个节点的n个后面的位置
		int i = 0;
		while (i < n) {
			secondNode = secondNode.next;
			i++;
		}

		while ( secondNode.next != null) {
			firstNode = firstNode.next;
			secondNode = secondNode.next;
		}

		// 删除第N个节点
        firstNode.next = firstNode.next.next;

		return headNode.next;
        
    }
}
