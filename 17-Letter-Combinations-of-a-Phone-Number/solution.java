package org.ElventoTwenty;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author Hao
 * @date 3.9
 * 
 *       电话号码对应字符串
 */

public class LetterCombinationsofaPhoneNumber {

	public static void main(String[] args) {

		System.out.println("The Result is : ");
		List<String> result = letterCombinations("2");
		for (String string : result)
			System.out.println(string);
	}

	public static List<String> letterCombinations(String digits) {

		List<String> result = new LinkedList<String>();

		if (digits == null || digits.length() == 0)
			return result;
		if (digits.contains("0") || digits.contains("1"))
			return result;

		// digth to string
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("2", "abc");
		hashMap.put("3", "def");
		hashMap.put("4", "ghi");
		hashMap.put("5", "jkl");
		hashMap.put("6", "mno");
		hashMap.put("7", "pqrs");
		hashMap.put("8", "tuv");
		hashMap.put("9", "wxyz");

		int digitsLength = digits.length();

		int[] digitsNumbers = new int[digitsLength];

		while (true) {

			String current = "";
			for (int i = 0; i < digitsLength; i++) {
				System.out.println(hashMap.get(digits.substring(i, i + 1)));
				current = current
						+ hashMap.get(digits.substring(i, i + 1)).charAt(
								digitsNumbers[i]);
			}
			// System.out.println(current);
			result.add(current);
			digitsNumbers[digitsLength - 1] = digitsNumbers[digitsLength - 1] + 1;

			// 判断回溯的条件
			for (int j = digitsLength - 1; j >= 0; j--) {
				if (digitsNumbers[j] >= hashMap.get(digits.substring(j, j + 1))
						.length()) {
					if (digitsNumbers[0] >= hashMap.get(digits.substring(0, 1))
							.length())
						return result;
					digitsNumbers[j] = 0;
					digitsNumbers[j - 1] = digitsNumbers[j - 1] + 1;
				} else {
					break;
				}
			}

		}

	}

	// 整数型数组初始化默认值
	public static void test() {

		int[] testArray = new int[10];
		for (int i : testArray)
			System.out.println(i);
	}
}
