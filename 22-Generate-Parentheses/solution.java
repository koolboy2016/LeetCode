package org.twentytothirity;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Hao
 * @date 3-23
 * 
 *       generate all the combinations of well-formed parentheses 
 *       {#backtracking},{# String builder}
 */

public class GenerateParentheses {

	public static void main(String[] args) {
		List<String> result = generateParenthesis(4);
		for (String s : result) {
			System.out.println(s);
		}
	}

	public static List<String> generateParenthesis(int n) {

		List<String> result = new ArrayList<String>();
		if (n <= 0)
			return result;

		diGui(result, "", n, n);
		return result;
	}

	public static void diGui(List<String> result, String builder, int left, int right) {

		if (left == 0 && right == 0) {
			result.add(builder);
			return;
		}

		if (left > 0)
			diGui(result, builder + "(", left - 1, right);

		if (right > 0 && left < right)
			diGui(result, builder + ")", left, right - 1);

	}

}
