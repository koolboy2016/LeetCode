package org.onetwoten;

public class StringtoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 几个典型的测试实例
		String str = "   12345";
		String str1 = "   b1234";
		String str2 = "-123355";
		String str3 = "+ 1235";
		String str4 = " 123a";
		System.out.println("The Result is " + solution("010"));

	}

	public static int solution(String str) {

		if (str == null)
			return 0;

		// init

		long result = 0;
		int index = 0;

		// 符号标记，true表示整数，flase表示负数
		boolean flag = true;

		str = str.trim();
		System.out.println(str);

		while (index < str.length()) {

			char r = str.charAt(index);
			if (r >= '0' && r <= '9') {

				result = result * 10 + r - '0';
				if (flag && result > Integer.MAX_VALUE)
					return Integer.MAX_VALUE;
				if (!flag && -result < Integer.MIN_VALUE)
					return Integer.MIN_VALUE;

			} else {

				if (index == 0 && r == '-') {

					flag = false;
					index++;
					continue;
				}
				if (index == 0 && r == '+') {

					flag = true;
					index++;
					continue;
				}
				break;
			}
			index++;
		}

		// output:
		if (!flag)
			return -(int) result;

		return (int) result;
	}

	public static void test() {

		int i = 0 + '1' - '0';
		System.out.println(i);
	}
}
