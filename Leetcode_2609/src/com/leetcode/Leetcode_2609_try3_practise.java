package com.leetcode;

public class Leetcode_2609_try3_practise {
	public static void main(String[] args) {
		String s = "01000111";

		System.out.println(findTheLongestBalancedSubstring(s));
	}

	public static int findTheLongestBalancedSubstring(String s) {
		
		//try3
		int res = 0, zeroCnt = 0, oneCnt = 0;

		int n = s.length();

		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '0') {

				// reset
				if (oneCnt != 0) {
					zeroCnt = 0;
					oneCnt = 0;

				}

				zeroCnt++;

			} else {

				oneCnt++;
			}

			res = Math.max(res, Math.min(zeroCnt, oneCnt) * 2);
		}
		return res;
	}
}
