package com.leetcode;

import java.util.Arrays;

public class Leetcode_287_sort_try3 {
	
	public static void main(String[] args) {
		int[]  nums = {1,3,4,2,2}; 
		System.out.println( findDuplicate (nums));
		
	}
	
	public static  int findDuplicate(int[] nums) {
		
		///sort 
		 Arrays.sort(nums);
		int n  = nums.length;
		for (int i = 1 ; i < n; i ++) {
			if( nums[i] == nums[i-1 ]) {
				return nums [i];
			}
		}
		return -1;
	}
}
