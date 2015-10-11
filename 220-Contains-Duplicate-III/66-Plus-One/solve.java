public class Solution {
    public int[] plusOne(int[] digits) {
if (digits.length == 0)
			return digits;

		int flag = 0;
		int index = digits.length - 1;
		digits[index] += 1;
		if (digits[index] >= 10) {
			flag = 1;
			digits[index] -= 10;
			index--;
		}

		while (flag == 1 && index >= 0) {

			digits[index] += 1;
			if (digits[index] >= 10) {
				flag = 1;
				digits[index] -= 10;
				index--;
			} else
				flag = 0;
		}

		if (flag == 1) {
			int[] result = new int[digits.length + 1];
			for (int i = digits.length - 1; i >= 0; i--) {

				result[i + 1] = digits[i];
			}
			result[0] = 1;
			return result;
		}

		return digits;
    }
}
