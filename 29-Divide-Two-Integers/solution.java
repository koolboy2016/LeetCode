package org.twentytothirity;

/**
 * 
 * @author Hao
 * @date 3.30
 * 
 *       divide two integers
 */
public class DivideTwoIntegers {

	public static void main(String[] args) {
		System.out.println("The result is : " + divide(1, 1));
	}

	public static int divide(int dividend, int divisor) {

		if (divisor == 0)
			return Integer.MAX_VALUE;

		boolean isNeg = false;
		if ((dividend < 0 && divisor > 0) || (dividend > 0) && divisor < 0)
			isNeg = true;

		int res = 0;

		if (dividend == Integer.MIN_VALUE) {
			dividend += Math.abs(divisor);
			if (divisor == -1)
				return Integer.MAX_VALUE;
			res++;
		}

		if (divisor == Integer.MIN_VALUE) {
			return res;
		}

		dividend = Math.abs(dividend);
		divisor = Math.abs(divisor);
		int digit = 0;
		while (divisor <= (dividend >> 1)) {

			divisor <<= 1;
			digit++;
		}
		while (digit >= 0) {
			if (dividend > divisor) {
				res += 1 << digit;
				dividend -= divisor;
			}
			divisor >>= 1;
			digit--;
		}

		return isNeg ? -res : res;
	}

	/**
	 * test for the >> && << >> 1 is the num divide 2 << 1 is the num time 2
	 */
	public static void test() {
		int test1 = 7 >> 1;
		System.out.println("2 >> 1 result is : " + test1);
		int test2 = 7 << 1;
		System.out.println("2 << 1 result is : " + test2);
		int a = 7;
		System.out.println("Befor A is the " + a);
		int b = a >> 1;
		System.out.println("After A is the " + a);
	}
}
