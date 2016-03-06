// ����Ľⷨ
	public static String solution1(String s, int numRows) {

		if (s == null || s.length() == 1 || numRows < 2)
			return s;

		// ��ʼ��ÿ�е����� �� ˳��ķ��� 1��ʾ���£�-1��ʾ����
		String[] strings = new String[numRows];
		Arrays.fill(strings, "");
		int delta = 1;
		int row = 0;

		for (int i = 0; i < s.length(); i++) {

			strings[row] += s.charAt(i);
			row += delta;

			// ����Խ������
			if (row >= numRows) {
				row = numRows - 2;
				delta = -1;
			}

			if (row < 0) {
				row = 1;
				delta = 1;
			}
		}

		// ͳ�ƽ��
		String result = "";
		for (String string : strings) {
			System.out.println(string);
			result += string;
		}

		return result;

	}

	// �ҹ��ɵĽⷨ
	public static String solution2(String s, int numRows) {

		if (s == null || s.length() == 1 || numRows < 2)
			return s;

		String resultString = "";
		for (int i = 0; i < numRows; i++)
			for (int index = i; index < s.length(); index += 2 * numRows - 2) {
				resultString += s.charAt(index);
				if (i > 0 && i < numRows - 1) {
					if (index + 2 * numRows - 2 - 2 * i < s.length()) {
						resultString += s.charAt(index + 2 * numRows - 2 - 2
								* i);
					}
				}
			}

		return resultString;
	}
