package com.leetcode;

public class Leetcode_2529_try4_binary_search {
	public static void main(String[] args) {

		// works well
//		int[] nums = { -2, -1, -1, 1, 2, 3 };

		int[] nums = { -2, -1, -1, 0, 0, 0, 1, 2, 3 };

		System.out.println(maximumCount(nums));
		// https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/solutions/3017003/c-java-python3-binary-search/?orderBy=most_votes
	}

	public static int maximumCount(int[] nums) {
		//try4 //works well 
		int res = Math.max(getIndex(nums, 0), nums.length - getIndex(nums, 1));
		return res;
	}

	//
	public static int getIndex(int[] nums, int target) {
		int nLen = nums.length;
		int left = 0, right = nLen - 1;

		while (left < right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] < target) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		return left;
	}

}
