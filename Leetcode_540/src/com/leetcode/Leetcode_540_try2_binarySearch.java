package com.leetcode;

public class Leetcode_540_try2_binarySearch {
	public static void main(String[] args) {
		
		//wrong does not works so far 
		int[] nums = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
		System.out.println(singleNonDuplicate (nums));
	}

	public static int singleNonDuplicate(int[] nums) {
		int left = 0, right = nums.length - 1;
		while (left < right) {
			System.out.println("aaaa");
			int mid = left + (right - left) / 2;
			
			// Make sure the mid is a even nums
			if (mid % 2 == 1) {
				mid = mid++;
			}
			
			if (mid==right) return right ;
			
			if (nums[mid] != nums[mid + 1]) {
				right = mid ;
//				mid = left + (right - left) / 2;
				
//				left = mid ;
			} else {
				left = mid;
//				mid = left + (right - left) / 2;
			}
			System.out.println("mid :" + mid );
			System.out.println("right :" + right );

		}
		return right;
	}

}
