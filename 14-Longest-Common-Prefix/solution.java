package org.ElventoTwenty;

public class LongestCommonPrefix {

	public static void main(String[] args) {

		String[] strings = { "abc", "abcbc", "abccd" };
		System.out.println("The Result is: " + longestCommonPrefix(strings));
	}

	public static String longestCommonPrefix(String[] strs) {

		if (strs.length == 1)
			return strs[0];

		int index = 0;

		for (; index < strs[0].length(); index++) {
			for (int j = 1; j < strs.length; j++) {
				if (index >= strs[j].length()
						|| strs[j].charAt(index) != strs[0].charAt(index)) {
					break;
				}
			}
		}

		return strs[0].substring(0, index);
	}

	/**
	 * 测试string 的substring函数的取值范围
	 */
	public static void test() {

		String string = "01234";
		System.out.println(string.substring(0, 1));
	}
}
