package com.leetcode;

public class Leetcode_2529_try1 {
	public static void main(String[] args) {
//		int[] nums = { -2, -1, -1, 1, 2, 3 };

		int[] nums = { -2, -1, -1, 0, 0, 0, 1, 2, 3 };

		System.out.println(lessThanZeroIdx(nums));

	}

//	public static int maximumCount(int[] nums) {
//
//		
//	}
	
	public static int lessThanZeroIdx (int [] nums) {
		int nLen = nums.length;
		int left = 0, right = nLen - 1;

		while (left < right) {
			int mid = left + (right - left) / 2;
			System.out.println(mid);
			System.out.println("left"  +left );
			System.out.println("r"  +right );

			if (nums[mid] > 0) {
				right = mid;
			} else {
				left = mid - 1;
			}

		}

		return left;

	}
}
