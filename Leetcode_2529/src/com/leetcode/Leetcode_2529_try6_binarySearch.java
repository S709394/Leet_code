package com.leetcode;

public class Leetcode_2529_try6_binarySearch {
public static void main(String[] args) {
		
		
//		int[] nums = { -2, -1, -1, 1, 2, 3 };

		int[] nums = { -2, -1, -1, 0, 0, 0, 1, 2, 3 };

		System.out.println(( maximumCount  (nums));
		// https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/solutions/3017003/c-java-python3-binary-search/?orderBy=most_votes
}

	public static int maximumCount(int[] nums) {
		int negtive = getIdx(nums, 0);
		int moreThanZero = nums.length - getIdx(nums, 1);

	}

	public static int getIdx(int[] nums, int target) {
		int left = 0;
		int right = nums.length;
		while (left < right) {

			int mid = left + (right - left) / 2;

			if (nums[mid] < target) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
	}
