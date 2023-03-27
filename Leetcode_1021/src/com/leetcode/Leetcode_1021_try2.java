package com.leetcode;

public class Leetcode_1021_try2 {
	public static void main(String[] args) {
		String s = "(()())(())";

		System.out.println(removeOuterParentheses(s));
	}

	public static String removeOuterParentheses(String s) {
		int opened = 0;
		StringBuilder sb = new StringBuilder();

		for (char c : s.toCharArray()) {
			if (c == '(') {
				if (opened > 0) {
					sb.append(c);
				}
				opened++;
			} else if (c == ')') { // c == ")"
				if (opened > 1) {
					sb.append(c);
				}
				opened--;
			}

		}
		return sb.toString();
	}
}
