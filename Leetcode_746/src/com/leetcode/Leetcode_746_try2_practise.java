package com.leetcode;

public class Leetcode_746_try2_practise {
	public static void main(String[] args) {
//		int nums[] = { 2, 2, 1, 1 };	
//		int cost[] = { 10, 15, 20 };
		int cost[] = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		System.out.println(minCostClimbingStairs(cost));
	}

	public static int minCostClimbingStairs(int[] cost) {
		// try2 practise d
		int len = cost.length;
		int dp[] = new int[len + 1];

		dp[0] = 0;
		dp[1] = 1;

		for (int i = 2; i <= len; i++) {
			dp[i] = Math.min(dp[i - 2] + cost[i - 2], dp[i - 1] + cost[i - 1]);
		}

		return Math.min(dp[len - 1] + cost[len - 1], dp[len - 2] + cost[len - 2]);
	}
}
