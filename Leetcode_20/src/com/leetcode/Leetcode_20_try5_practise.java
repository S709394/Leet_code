package com.leetcode;

import java.util.Stack;

public class Leetcode_20_try5_practise {

	public static void main(String[] args) {
//			String s = "(){}";
//			String s = "})}";

		String s = "({()})";
//			String s1 = "({))";

		boolean b = isVaild(s);
		System.out.println(b);

		System.out.println("b1");
//			boolean b1 = isVaild (s1);
//			System.out.println(b1);

//			String s3 = "({))";
	}

	public static boolean isVaild(String s) {
		Stack<Character> stack = new Stack<>();

		for (char c : s.toCharArray()) {
			if (c == '(') {
				stack.add(')');
			} else if (c == '{') {
				stack.add('}');
			} else if (c == '[') {
				stack.add(']');
//				}else if ( !stack .isEmpty() && c!= stack.pop() ) {  //wrong 
				// left : " ]" "a" right "[}" "(a"
			} else if (stack.isEmpty() || c != stack.pop()) {
				return false;
			}
		}
		return stack.isEmpty();
	}
}
