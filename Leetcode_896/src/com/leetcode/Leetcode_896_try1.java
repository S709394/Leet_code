package com.leetcode;

public class Leetcode_896_try1 {
	public static void main(String[] args) {
		int nums[] = { 1, 2, 2, 3 };
		System.out.println(isMonotonic(nums));
	}

	public static boolean isMonotonic(int[] nums) {

		// try1
		int len = nums.length;

		int left = 0;
//			int	right = len - 1;

		while (nums[left] == nums[left + 1] && left < len - 1) {
			left++;
		}

		if (nums[left] < nums[left + 1]) {
//			boolean ans = true;
			for (int i = 1; i < len - 1; i++) {
//				System.out.println(i);
				if (nums[i] > nums[i + 1]) {
					return false;
				}

			}

		} else {
			for (int i = 1; i < len - 1; i++) {
				if (nums[i] < nums[i + 1]) {
					return false;
				}
			}
		}
		return true;
	}
}
