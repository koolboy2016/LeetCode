package org.wanghao.onetoten;

import java.util.Hashtable;

/**
 * 
 * @author wanghao
 * @date 2.21
 */
public class Solution {

	public static void main(String[] args) {

		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
	}

	public static int lengthOfLongestSubstring(String s) {

		if (s == null)
			return 0;
		if (s.length() == 0 || s.length() == 1)
			return s.length();

		int maxLength = -1;
		int start = 0;
		int end = 1;
		Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>();
		hashtable.put(String.valueOf(s.charAt(start)), 0);
		int count = 1;

		while (end < s.length()) {
			System.out.println("end" + end);
			String current = String.valueOf(s.charAt(end));
			if (hashtable.containsKey(current)) {
				if (hashtable.get(current) >= start) {
					maxLength = (end - start > maxLength) ? (end - start) : maxLength;
					System.out.println(maxLength);
					start = hashtable.get(current) + 1;
				}
				hashtable.replace(current, end);

			} else {
				hashtable.put(current, end);
			}
			end++;
		}

		return maxLength;
	}

}

