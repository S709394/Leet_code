package com.leetcode;

public class Leetcode_2529_try3_binary_search {
	public static void main(String[] args) {

		// works well
//		int[] nums = { -2, -1, -1, 1, 2, 3 };

		int[] nums = { -2, -1, -1, 0, 0, 0, 1, 2, 3 };

		System.out.println(maximumCount(nums));
		// https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/solutions/3017003/c-java-python3-binary-search/?orderBy=most_votes
	}

	public static int maximumCount(int[] nums) {

		// call the function the index of the 1st not negative is the count of the

		return Math.max(getIndex(nums, 0), nums.length - getIndex(nums, 1));
		// negative num
		// the "length - numbers bigger then zero if for the postive number

	}

//get index is the nums cnt on the left of the target
	public static int getIndex(int[] nums, int target) {
		int left = 0, right = nums.length - 1;

		while (left < right) {
			int mid = left + (right - left) / 2;

			if (nums [ mid ] <target) {
				left =mid +1 ;
			}else {
				right = mid ;
			}
			System.out.println("left:" +left);

		}
		
		return left;

	}

}
