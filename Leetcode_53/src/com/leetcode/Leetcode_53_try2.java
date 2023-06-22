package com.leetcode;

public class Leetcode_53_try2 {
	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(nums));

	}

	public static int maxSubArray(int[] nums) {
		int len = nums.length;
//		int[] MaxSumTill = new int[len];
		int MaxEndHere = nums[0];

		int MaxOfTheSumMax = nums[0];

		for (int i = 1; i < len; i++) {

			MaxEndHere = Math.max(nums[i], MaxOfTheSumMax + nums[i]);

			MaxOfTheSumMax = Math.max(MaxOfTheSumMax, MaxEndHere);
		}

		return MaxOfTheSumMax;
	}
}
