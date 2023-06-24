package com.leetcode;

public class Leetcode_714_try1 {
	public static void main(String[] args) {

	}

	public static int maxProfit(int[] prices, int fee) {
		
		//try1 
		int len = prices.length;
		int[][] dp = new int[len][2];

		for (int i = 0; i < len; i++) {
			// base case
			if (i == 0) {
				dp[i][0] = 0;
				//
				dp[i][1] = -prices[i] - fee;
				continue;
			}
			dp[i][0] = Math.max(dp[i][0], dp[i - 1][0]) + prices[i];
			dp[i][1] = Math.max(dp[i][1], dp[i - 1][0]) - prices[i] - fee;
		}
		return dp[len - 1][0];
	}
}
