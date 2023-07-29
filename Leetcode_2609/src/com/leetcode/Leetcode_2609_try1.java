package com.leetcode;

public class Leetcode_2609_try1 {
	public static void main(String[] args) {
		String s = "01000111";

		System.out.println(findTheLongestBalancedSubstring(s));
	}

	public static int findTheLongestBalancedSubstring(String s) {

		int n = s.length();
		int res = 0, numberOfZero = 0, numberOfOne = 0;

		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '0') {

				// reset when meet an 0 because As rule states all 1s after 0, this means that a
				// 0 will "reset" the previous known number of 1.
				if (numberOfOne > 0) {
					numberOfZero = 0;
					numberOfOne = 0;

				}
				numberOfZero++;

			} else {
				numberOfOne++;
			}
			
			res = Math.max(res, Math.min(numberOfZero, numberOfOne )*2 ) ;
			}
		return res ;
	}
}
