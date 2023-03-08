package com.leetcode;

public class Leetcode_1283_try1 {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 5, 9 };
		int threshold = 6;
		System.out.println(smallestDivisor(nums, threshold));
	}

	public static int smallestDivisor(int[] nums, int threshold) {
		
		//(num+mid-1)/mid returns the smallest integer greater than or equal to the result of the division. This is accomplished by the behavior of integer division in Java, where any remainder is truncated toward zero. For example, 5 / 2 would return 2 instead of 2.5.

		int right = 1, left = 1;
		int res = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			right = Math.max(right, nums[i]);
		}
		int sum = 0;
		int mid = left + (right - left) / 2;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i] / mid;
			if (sum % mid != 0) {
				sum++;
			}

			System.out.println("sum :" + sum); // test
		}
		res = Math.min(sum, res);

		if (sum <= threshold) {
			left = mid;
		} else {
			right = mid + 1;
		}

		return res;

	}
}
