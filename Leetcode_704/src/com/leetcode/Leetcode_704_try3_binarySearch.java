package com.leetcode;

public class Leetcode_704_try3_binarySearch {
	public static void main(String[] args) {
//		int[] nums = { -1, 0, 3, 5, 9, 12 };
		int[] nums = { 5 };
		int target = 5;
		System.out.println(search(nums, target));
	}

	public static int search(int[] nums, int target) {
		
		//try3 
		int resIdx = -1;

		int left = 0, right = nums.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				right = mid - 1;
			} else {// nums [mid] >target
				left = mid+1;
			}

		}

		return resIdx;
	}
}
