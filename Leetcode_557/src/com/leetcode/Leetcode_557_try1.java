package com.leetcode;
//Idea : stack   not fast enough 
//
//Runtime
//66 ms
//Beats
//30.26%
//Memory
//50.4 MB
//Beats
//52.25%
//

import java.util.Stack;

public class Leetcode_557_try1 {
	public static void main(String[] args) {
		String s = "let us  go";
		System.out.println(reverseWords(s));

	}

//	//wrong understand the question
//	public String reverseWords(String s) {
//		StringBuilder sb = new StringBuilder () ;
//		sb.append(s);
//		sb.reverse();
//		return new String (sb);
//	}

	public static String reverseWords(String s) {
		char[] cArr = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		int len = s.length();
		char[] new_cArr = new char[len];
		int index = 0;
		for (int i = 0; i < len; i++) {

			if (cArr[i] != ' ') {
				stack.add(cArr[i]);
			} else if (cArr[i]==' '){
				while (!stack.isEmpty()) {
					System.out.println (stack.peek());
					new_cArr[index++] = stack.pop();

				}
				new_cArr[index++] = ' ';

			}

		}
		while (!stack.isEmpty()) {
			new_cArr[index++] = stack.pop();
		}
		
		return new String (new_cArr) ;
	}

}
