package me.gaegle.programmers.올바른_괄호;

import java.util.Stack;

class Solution {
	boolean solution(String s) {
		return isNotEmpty(s) && matchedBracket(s) && notSameCountBrackets(s);
	}

	private static boolean notSameCountBrackets(String s) {
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (c == '(') {
				stack.push(c);
				continue;
			}
			if (c == ')' && !stack.isEmpty()) {
				stack.pop();
			}
		}
		return stack.isEmpty();
	}

	private static boolean matchedBracket(String s) {
		return !s.startsWith(")") && !s.endsWith("(");
	}

	private static boolean isNotEmpty(String s) {
		return s != null && !"".equals(s);
	}
}
