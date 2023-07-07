package com.leetcode;

public class Leetcode_209_try1 {
	public static void main(String[] args) {
		int[] nums = { 2, 3, 1, 2, 4, 3 };

		int s = 7;
		System.out.println(minSubArrayLen(s, nums));
	}

	public static  int minSubArrayLen(int s, int[] nums) {
		if (nums == null)
			return 0;

		int ans = Integer.MAX_VALUE;
		int sum = 0;
		int localAns = 0;

		for (int i = 0, j = 0; i < nums.length; i++) {
//			System.out.println("i : " + i + "  j : " + j);
			sum += nums[i];
			localAns++;
			while (sum >= s) {
				ans = Math.min(localAns, ans);
				localAns--;

				sum -= (nums[j]);
				j++;

			}
		}
		return (ans == Integer.MAX_VALUE ? 0 : ans);
	}

}
