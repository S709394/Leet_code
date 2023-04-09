package com.leetcode;

public class Leetcode_2529_try5_binarySearch {
	public static void main(String[] args) {

		// works well
//		int[] nums = { -2, -1, -1, 1, 2, 3 };

		int[] nums = { -2, -1, -1, 0, 0, 0, 1, 2, 3 };

		System.out.println(maximumCount(nums, 0));
		// https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/solutions/3017003/c-java-python3-binary-search/?orderBy=most_votes

	}

	public static int maximumCount(int[] nums) {
		// call the function the index of the 1st not negative is the count of the
		return Math.max(getIdx(nums, 0), nums.length - getIdx(nums, -1));
	}

	public static int getIdx(int[] nums, int target) {
		int nLen = nums.length;

		int left = 0;
		int right = nLen - 1;

		while (left < right) {
			int mid = left + (right - left) / 2;

			if (nums[mid]>=target) {

				right = mid;
				
			} else {
				left = mid + 1;

			}
		}

		return left;
	}
}
