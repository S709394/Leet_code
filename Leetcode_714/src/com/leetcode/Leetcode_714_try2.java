package com.leetcode;

public class Leetcode_714_try2 {
	public static void main(String[] args) {

		int[] prices = { 1, 3, 2, 8, 4, 9 };

		int fee = 2;

		System.out.println(maxProfit(prices, fee));
	}

	public static int maxProfit(int[] prices, int fee) {

		// try2
		int len = prices.length;
		int[][] dp = new int[len][2];
		dp[0][0] = 0;
		dp[0][1] = -prices[0] - fee;

		for (int i = 1; i < len; i++) {

			dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
			dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i] - fee);
		}

		return dp[len - 1][0];
	}
}
