package com.leetcode;

public class Leetcode_540_try3_binarySearch_practise {
	public static void main(String[] args) {
//		int[] nums = { 1,   3, 3, 5,5,7,7, 8, 8 };
		int[] nums = { 1,1,   3, 3, 5,5,7, 8, 8 };
		System.out.println( singleNonDuplicate (nums));
	}

	public static int singleNonDuplicate(int[] nums) {
		//binary search 
		int left = 0, right = nums.length - 1;

		while (left < right) {
			int mid = left + (right - left) / 2;
			if (mid % 2 == 1) {
				mid--;
			}

			if (nums[mid] == nums[mid + 1]) {
				left = mid + 2;
//				System.out.println( "left" + left);
			} else {
				
				right = mid;  
//				System.out.println( "right" + right);
			}

		}
		return nums[left];
	}
}
