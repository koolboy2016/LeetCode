package org.wanghao.onetoten;

import java.util.HashSet;

/**
 * 
 * @author wanghao
 * 
 */

/*
 * Wrong answer
 * 
 * Time Limited
 */
public class Solution1 {

	public static void main(String[] args) {
		String s = "bbbbb";
		System.out.println(lengthOfLongestSubstring(s));
	}

	public static int lengthOfLongestSubstring(String s) {

		int length = s.length();
		if (length == 0 || length == 1)
			return length;

		// init
		int FirstPoint = 0, LastPoint;
		int MaxLength = -1;

		// first point loop
		while (FirstPoint < length - 1) {

			LastPoint = FirstPoint + 1;
			int currentLength = 0;

			HashSet<String> hashset = new HashSet<String>();

			char firstChar = s.charAt(FirstPoint);
			hashset.add(String.valueOf(firstChar));
			currentLength += 1;

			// last point loop
			while (LastPoint <= length - 1) {

				String b = String.valueOf(s.charAt(LastPoint));

				if (hashset.contains(b)) {
					break;
				} else {
					hashset.add(b);
					currentLength += 1;
					LastPoint += 1;
				}
			}

			if (currentLength > MaxLength)
				MaxLength = currentLength;

			FirstPoint += 1;

		}

		return MaxLength;
	}

}

