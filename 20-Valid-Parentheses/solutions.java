package org.ElventoTwenty;

import java.util.Stack;

/**
 * 
 * @author Hao
 * 
 * @date 3.11
 * 
 *       judge the parentheses valid
 */

public class ValidParentheses {

	public static void main(String[] args) {
		String string = "[][]";
		System.out.println("The Result is " + isValid(string));
		System.out.println("The Result is " + solutions(string));
		// test();
	}

	public static boolean isValid(String s) {

		if (s == null || s.length() == 0)
			return true;

		Stack<String> stack = new Stack<String>();

		int i = 0;
		while (i < s.length()) {

			String currentString = s.substring(i, i + 1);

			// if stack is empty
			if (stack.empty())
				stack.add(currentString);
			else {
				// if top string of stack can match current string
				String topString = stack.peek();
				if (currentString.equals(")")) {
					if (topString.equals("("))
						stack.pop();
					else
						return false;
				} else if (currentString.equals("}")) {
					if (topString.endsWith("{"))
						stack.pop();
					else
						return false;
				} else if (currentString.equals("]")) {
					if (topString.equals("["))
						stack.pop();
					else
						return false;
				} else {
					stack.add(currentString);
				}

			}
			i++;
		}
		if (stack.empty())
			return true;
		else
			return false;

	}

	public static boolean solutions(String s) {

		if (s == null || s.length() == 0)
			return true;

		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < s.length(); i++) {

			String currentString = String.valueOf(s.charAt(i));
			if (currentString.equals("(") || currentString.equals("[") || currentString.equals("{"))
				stack.add(currentString);
			else {
				if (stack.empty())
					return false;
				String topString = stack.pop();
				if ((currentString.equals(")") && !topString.equals("("))
						|| (currentString.equals("]") && !topString.equals("["))
						|| (currentString.equals("}") && !topString.equals("{")))
					return false;
			}
		}

		return stack.empty();
	}

	/*
	 * test for the java stack
	 */
	public static void test() {

		// test for stack
		Stack<String> stack = new Stack<String>();
		stack.add("1");
		stack.add("2");
		System.out.println(stack.peek());
		System.out.println(stack.toString());
		stack.pop();
		System.out.println(stack.toString());

		// test for string == and string.equal()

		String string = "]";
		System.out.println("The Result == is " + (string == "]"));
		System.out.println("The Result equal is " + (string.equals("]")));
	}

}
