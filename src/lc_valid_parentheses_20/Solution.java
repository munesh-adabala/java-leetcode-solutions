package lc_valid_parentheses_20;

import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		System.out.println(isValid("()[{]}"));
	}

	public static boolean isValid(String s) {
		if (s.length() % 2 != 0) {
			return false;
		}
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else {
				if (stack.isEmpty() || !isMatched(stack.peek(), c)) {
					return false;
				}
				stack.pop();
			}
		}
		return stack.isEmpty();
	}

	private static boolean isMatched(char c1, char c2) {
		if (c1 == '(' && c2 == ')' || c1 == '{' && c2 == '}' || c1 == '[' && c2 == ']') {
			return true;
		}
		return false;
	}

}
