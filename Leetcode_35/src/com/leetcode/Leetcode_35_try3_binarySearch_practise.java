package com.leetcode;

public class Leetcode_35_try3_binarySearch_practise {
//	/try3   practise 
	public static void main(String[] args) {
		int[] nums = { 2, 3, 5, 6 }; // demo 1

//		int[] nums = { 1, 2, 3,  6  ,11,13,15,17,19}; //demo 
		int target = 4;
		System.out.println("ans" + searchInsert(nums, target));

		
	}
	public static int searchInsert(int[] nums, int target) {
		
		int len = nums.length;
		//Store 3 diff index for binary search 
		
		int left = 0 , right  = len-1,  mid = (len)/2 ;
		
		//base 
		
		if (target>nums[right]) return len;
		
		while (left < right ) {
			if (nums[mid] == target) {
				return mid;
				
			}else if (nums[mid] < target) {
				left = mid+1;
				
				mid =  left +(right -left)/2;
				
			}else {
				
				// not  'mid -1'
				right = mid;
				mid = left +(right -left)/2;
			}
			
		}
		
		// will not reach here
		return left ;
	}
}
