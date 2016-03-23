package org.wanghao.twentyonetothirty;

/**
 * 
 * @author wanghao
 * 
 * @date 3.12
 * 
 *       Merge two sorted linked lists and return it as a new list.
 */
public class MergeTwoSortedLists {

	public static void main(String[] args) {
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;

		ListNode resultHeadNode = new ListNode(-1);
		ListNode current = resultHeadNode;

		ListNode l1Index = l1;
		ListNode l2Index = l2;

		while (l1Index != null && l2Index != null) {

			if (l1Index.val <= l2Index.val) {
				current.next = l1Index;
				l1Index = l1Index.next;
				current = current.next;
			} else {
				current.next = l2Index;
				l2Index = l2Index.next;
				current = current.next;
			}
		}

		// l1 not empty
		while (l1Index != null) {
			current.next = l1Index;
			l1Index = l1Index.next;
			current = current.next;
		}

		// l2 not empty
		while (l1Index != null) {
			current.next = l2Index;
			l2Index = l2Index.next;
			current = current.next;
		}

		return resultHeadNode.next;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

}

