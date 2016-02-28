package org.onetoten;

/**
 * 
 * @author Hao
 * @date 2.28
 * 
 *       判断一个数是不是回文数
 */

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 12344321;
		System.out.println("The Result is  :   " + isPalindrome(10));
	}

	// 从两边依次向中间递进
	public static boolean isPalindrome(int x) {

		if (x < 0)
			return false;
		if (x < 10)
			return true;

		int length = 0;
		int temp = x;
		while (temp != 0) {
			temp = temp / 10;
			length++;
		}
		int left = (int) Math.pow(10, length - 1);
		int right = 1;

		while (left >= right) {

			if ((x / left % 10) != (x / right % 10))
				return false;
			right *= 10;
			left /= 10;

		}

		return true;
	}
}
