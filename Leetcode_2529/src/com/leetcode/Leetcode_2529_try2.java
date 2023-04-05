package com.leetcode;

public class Leetcode_2529_try2 {
	public static void main(String[] args) {
//		int[] nums = { -2, -1, -1, 1, 2, 3 };

		int[] nums = { -2, -1, -1, 0, 0, 0, 1, 2, 3 };

		System.out.println(bisect_left(nums));

	}
	public static int bisect_left(int[] nums ,int target ) {
		int nLen = nums.length;
		int left = 0, right = nLen - 1;
		
		while (left < right ) {
			int mid = left + (right - left) / 2;
			if (nums[mid] <target) {
				
				left = mid;
			} else {
				right  =mid +1 ;
			}
		}
	}
	public int maximumCount(int[] nums) {
		
		
	}
}
