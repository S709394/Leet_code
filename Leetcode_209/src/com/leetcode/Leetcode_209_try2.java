package com.leetcode;

public class Leetcode_209_try2 {
	public static void main(String[] args) {
		int[] nums = { 2, 3, 1, 2, 4, 3 };

		int s = 7;
		System.out.println(minSubArrayLen(s, nums));
	}

	public static int minSubArrayLen(int s, int[] nums) {
		int curSum = 0;

		int res = Integer.MAX_VALUE;

//		int len = 0;

		int localRes = 0;
		for (int i = 0, j = 0; i < nums.length; i++) {
			curSum += nums[i];

			localRes++;
			while (curSum >= s) {

				curSum -= nums[j];
				res = Math.min(localRes, res);
				j++;
				localRes--;
			}

		}
		return (res == Integer.MAX_VALUE) ? 0 : res;
		

	}
}
