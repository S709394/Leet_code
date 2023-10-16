package com.leetcode;

public class Leetcode_746_try4_practise {
	public static void main(String[] args) {
		int[] cost = { 10, 15, 20 };
		System.out.println(minCostClimbingStairs(cost));
	}

	public static int minCostClimbingStairs(int[] cost) { 
		
		//try4 
		int len = cost.length;
		int[] dp = new int[len];
		dp[0] = 0;
		dp[1] = 0;
		for (int i = 2; i < len; i++) {
			dp[i] = Math.max(dp[i - 2] + cost[i - 2], dp[i - 1] + cost[i - 1]);

		}

		return Math.min(dp[len - 2] + cost[len - 2], dp[len - 1] + cost[len - 1]);
	}

}
