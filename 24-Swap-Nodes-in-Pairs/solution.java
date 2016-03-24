package org.wanghao.twentyonetothirty;

/**
 * 
 * @author wanghao
 * @date 3.24
 * 
 *       Swap Nodes In Pairs
 */
public class SwapNodesInPairs {

	public static void main(String[] args) {

	}

	public ListNode swapPairs(ListNode head) {

		if (head == null || head.next == null)
			return head;

		ListNode topNode = new ListNode(-1);
		ListNode headNode = topNode;
		ListNode tempNode = new ListNode(-2);
		topNode.next = head;
		while (topNode.next != null && topNode.next.next != null) {
			tempNode = topNode.next;
			topNode.next = topNode.next.next;
			tempNode.next = topNode.next.next;
			topNode.next.next = tempNode;
			topNode = topNode.next.next;
		}

		return headNode.next;
	}

	public class ListNode {

		int val;
		ListNode next;

		public ListNode(int x) {
			this.val = x;
		}
	}
}

