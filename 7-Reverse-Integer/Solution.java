public static int solution(int x) {

		long result = 0;

		// �𲽴�x�ĸ�λ����ȡ��������
		while (x != 0) {

			result = result * 10 + (x % 10);
			if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
				result = 0;
				break;
			}
			x = x / 10;
		}

		return (int) result;
	}