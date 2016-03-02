package org.onetoten;

/**
 * 
 * @author Hao
 * @date 2.24
 *
 *       ��������������м���
 */
public class MedianOfTheSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 1, 3 };
		int[] nums2 = { 2 };
		System.out.println("The Result is :  "
				+ findMedianSortedArrays(nums1, nums2));

	}

	/**
	 * ͨ�����α����ҵ������м���Ǹ���
	 * 
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		if (nums1.length == 0 && nums2.length == 0)
			return 0;

		int LengthSum = nums1.length + nums2.length;

		// ��λ�����ڵ�λ��
		int k = LengthSum / 2;
		boolean even = false;

		if (LengthSum % 2 == 0) {
			even = true;
		}

		// ��������ı����±�
		int index1 = 0, index2 = 0;
		int result1 = 0, result2 = 0;
		int index = 0;
		while (index1 < nums1.length && index2 < nums2.length) {

			if (nums1[index1] >= nums2[index2]) {
				if (index == k - 1)
					result1 = nums2[index2];
				if (index == k) {
					result2 = nums2[index2];
					break;
				}
				index2++;
			} else {
				if (index == k - 1)
					result1 = nums1[index1];
				if (index == k) {
					result2 = nums1[index1];
					break;
				}
				index1++;
			}
			index++;
		}

		while (index1 < nums1.length && index2 >= nums2.length && index <= k) {
			if (index == k - 1)
				result1 = nums1[index1];
			if (index == k)
				result2 = nums1[index1];
			index1++;
			index++;
		}
		while (index2 < nums2.length && index1 >= nums1.length && index <= k) {
			if (index == k - 1)
				result1 = nums2[index2];
			if (index == k)
				result2 = nums2[index2];
			index2++;
			index++;
		}
		System.out.println(result1 + " " + result2);

		if (even)
			return (double) (result1 + result2) / 2;
		else
			return result2;

	}
}
