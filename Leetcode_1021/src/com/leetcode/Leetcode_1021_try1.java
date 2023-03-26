package com.leetcode;

public class Leetcode_1021_try1 {
	public static void main(String[] args) {
		String  s = "(()())(())" ; 
		
		System.out.println( removeOuterParentheses  (s));
	}

	public static  String removeOuterParentheses(String s) {
		StringBuilder sb = new StringBuilder();
		int opened = 0;
		for (char c : s.toCharArray()) {
			if (c == '(') {
				if (opened > 0) {
					
					System.out.println( "1 ");
					sb.append(c);
					opened++;
				}
				// c == ')'
			} else {
				if (opened < 0) {
					System.out.println( "2");
					sb.append(c);
					opened--;
				}

			}
		}
		return sb.toString();
	}
}
