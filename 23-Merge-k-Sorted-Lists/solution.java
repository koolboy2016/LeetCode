package org.wanghao.twentyonetothirty;

/**
 * 
 * @author wanghao
 * @date 3.25
 * 
 *       Merger K Sorted Sorted List to One Sorted List
 */

public class MergeKSortedList {

	public static void main(String[] args) {
	}

	// time limited
	public ListNode mergeKLists(ListNode[] lists) {

		if (lists.length == 0)
			return null;

		ListNode resultIndex = new ListNode(-1);
		ListNode resultHead = resultIndex;
		int NullNodeCount = 0;
		int ListsNums = lists.length;
		int MinIndex = -1;

		while (true) {
			NullNodeCount = 0;
			int MinTemp = Integer.MAX_VALUE;
			for (int i = 0; i < ListsNums; i++) {
				if (lists[i] != null) {
					if (lists[i].val < MinTemp) {
						MinTemp = lists[i].val;
						MinIndex = i;
					}
				} else
					NullNodeCount++;
			}
			if (NullNodeCount == ListsNums)
				break;

			// add the min node to the result node list
			resultIndex.next = lists[MinIndex];
			lists[MinIndex] = lists[MinIndex].next;
		}
		return resultHead.next;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			this.val = x;
		}
	}
}

