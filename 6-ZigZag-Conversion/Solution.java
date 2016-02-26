// 数组的解法
	public static String solution1(String s, int numRows) {

		if (s == null || s.length() == 1 || numRows < 2)
			return s;

		// 初始化每行的数组 和 顺序的方向 1表示向下，-1表示向上
		String[] strings = new String[numRows];
		Arrays.fill(strings, "");
		int delta = 1;
		int row = 0;

		for (int i = 0; i < s.length(); i++) {

			strings[row] += s.charAt(i);
			row += delta;

			// 处理越界问题
			if (row >= numRows) {
				row = numRows - 2;
				delta = -1;
			}

			if (row < 0) {
				row = 1;
				delta = 1;
			}
		}

		// 统计结果
		String result = "";
		for (String string : strings) {
			System.out.println(string);
			result += string;
		}

		return result;

	}

	// 找规律的解法
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
