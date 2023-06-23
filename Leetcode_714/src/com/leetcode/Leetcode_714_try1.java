package com.leetcode;

public class Leetcode_714_try1 {
	public static void main(String[] args) {

	}

	public static int maxProfit(int[] prices, int fee) {
		int len = prices.length;
		int[][] dp = new int[len][2];

		for (int i = 0; i < len; i++) {
			// base case
			if (i == 0) {
				dp[i][0] = 0;
				// 
				dp [ i] [1] = - prices [i] - fee ;
				continue ;
			}
			dp [ i] [ 0 ] 
		}
	}
}
