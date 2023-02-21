package com.leetcode;

public class Leetcode_35_try2_binarySearch {
	public static void main(String[] args) {
		int[] nums = { 2, 3, 5, 6 }; // demo 1

//		int[] nums = { 1, 2, 3,  6  ,11,13,15,17,19}; //demo 
		int target = 4;
		System.out.println("ans" + searchInsert(nums, target));

	}

	public static int searchInsert(int[] nums, int target) {
		//practise 2

		//
		int len = nums.length;

		int left = 0;
		int mid = len / 2;
		int right = len - 1;
		if (target > nums[right]) {
			return len;
		}

		while (left < right) {
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				left = mid + 1;
				mid = (right - left) / 2 + left;
			} else 
				
//				
//				if (nums[mid] > target) {
			{
				right = mid;
				mid = (right - left) / 2 + left;
			}
		}
		//  not going to reach here 
		return left;
	}
}
