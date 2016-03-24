package org.wanghao.twentyonetothirty;

/**
 * 
 * @author wanghao
 * @date 3.24
 * 
 *       Implement strStr
 * 
 */
public class ImplementstrStr {

	public static void main(String[] args) {
		String haystack = "";
		String needle = "";
		System.out.println("The Index of the Result is : " + strStr(haystack, needle));
	}

	public static int strStr(String haystack, String needle) {

		if (haystack == null || needle == null)
			return -1;

		if (haystack.length() < needle.length())
			return -1;

		int haystackIndex = 0;
		int needleIndex = 0;
		while (haystack.length() - haystackIndex >= needle.length()) {
			needleIndex = 0;
			for (needleIndex = 0; needleIndex < needle.length(); needleIndex++) {
				if (needle.charAt(needleIndex) != haystack.charAt(haystackIndex + needleIndex)) {
					break;
				}
			}
			if (needleIndex == needle.length())
				return haystackIndex;
			haystackIndex++;
		}

		return -1;
	}

}

