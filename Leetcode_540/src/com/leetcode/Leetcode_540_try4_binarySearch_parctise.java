package com.leetcode;

public class Leetcode_540_try4_binarySearch_parctise {
	public static void main(String[] args) {
		int[] nums = { 1, 3, 3, 5, 5, 7, 7, 8, 8 };
//		int[] nums = { 1,1,   3, 3, 5,5,7, 8, 8 };
		System.out.println(singleNonDuplicate(nums));
	}

	public static int singleNonDuplicate(int[] nums) {
		int left = 0, right = nums.length - 1;

		while (left < right) {
			int mid = left + (right - left) / 2;

			if (mid % 2 == 1) {
				mid--;
			}

			if (nums[mid] != nums[mid + 1]) {
				right = mid;
				
			} else {
				left = mid + 2;
				
			}

		}
		return nums[left];

	}

}
