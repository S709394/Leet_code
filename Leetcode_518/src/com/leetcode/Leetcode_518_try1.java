package com.leetcode;

public class Leetcode_518_try1 {
	public int change(int amount, int[] coins) {

		int len = coins.length;
		int[][] dp = new int[len + 1][amount + 1];

		// base case
		for (int i = 0; i < len; i++) {
			dp[i][0] = 1;
		}

		for (int i = 1; i <= amount; i++) {
			for (int j = 1; j <= len; j++) {
				if(  j - coins[ i] >= 0) {
					
				}
			}
		}
	}
}
