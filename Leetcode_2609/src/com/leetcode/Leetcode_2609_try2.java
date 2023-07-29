package com.leetcode;

public class Leetcode_2609_try2 {
	public static void main(String[] args) {
		String s = "01000111";

		System.out.println(findTheLongestBalancedSubstring(s));
	}

	public static int findTheLongestBalancedSubstring(String s) {
		int res = 0;

		int n = s.length();
		int zeroCnt = 0;
		int oneCnt = 0;

//		int res = 0 ;

		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '0') {

				// reset
				if (oneCnt != 0) {

					oneCnt = 0;
					zeroCnt = 0;
				}

				zeroCnt++;

			} else {
				oneCnt++;
			}

			res = Math.max(res, Math.min(oneCnt, zeroCnt) * 2);

//					Math.min(oneCnt, zeroCnt) *2 
		}

		return res;
	}

}
