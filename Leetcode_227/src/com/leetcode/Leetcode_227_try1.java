package com.leetcode;

import java.util.Stack;
//Runtime
//39 ms
//Beats
//36.59%
//Memory
//44.8 MB
//Beats
//50.44%

public class Leetcode_227_try1 {
	public int calculate(String s) {
		Stack<Integer> stack = new Stack<>();
		// base case ;
		int num = 0;
		char sign = '+';
		int len = s.length();

		for (int i = 0; i < len; i++) {

			// v1.0 wrong
//			if ( Character.isDigit(s.charAt(i))) {
//				num = s.charAt(i)-'0';
//				while ( i<len-1 && Character.isDigit(s.charAt(i))) {
//					num = num*10 + s.charAt(i)-'0';
//					i++;
//				}
//			}

			if (Character.isDigit(s.charAt(i))) {
				num = num * 10 + s.charAt(i) - '0';

			}

			if (!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ' || i == len - 1) {
//				char c = s.charAt(i);
				if (sign == '+') {
					stack.add(num);
//					sign = 1;
				} else if (sign == '-') {
//					stack.add(num);//wrong 
					stack.add(-num);
//					sign = -1;
				} else if (sign == '*') {
					stack.add(stack.pop() * num);

				} else if (sign == '/') {
					stack.add(stack.pop() / num);

				}

				sign = s.charAt(i);
				num = 0;

			}

		}
		int res = 0;
		for (int i : stack) {
			res += i;
		}
		return res;
	}

}
