package com.leetcode;

import java.util.Arrays;

public class Leetcode_961_try2 {

	// try2

	public static void main(String[] args) {
		int[] nums = { 9, 5, 3, 3 };
		System.out.println(repeatedNTimes(nums));
	}

	public static int repeatedNTimes(int[] nums) { 
		
		Arrays.sort(nums);
		int len = nums.length;
		
		if(nums[len /2 ] >nums[0] && nums[len/2] == nums[len-1] ) {
			return nums[len/2];
		}else {
			return nums [len/2-1];
		}
		
	}
}
