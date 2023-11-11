package com.leetcode;

public class Leetcode_1795_try3_practise {
	public static void main(String[] args) {
		
		// try3
		System.out.println(countHomogenous("101"));
	}

	public static int countHomogenous(String s) {

		int res = 0, cur = 0, count = 0, mod = 1_000_000_007;

		for (int i = 0; i < s.length(); i++) {

			count = cur == s.charAt(i) ? count + 1 : 1;
			cur = s.charAt(i);

			res = (res + count) % mod;

		}
		return res ;
	}
}
