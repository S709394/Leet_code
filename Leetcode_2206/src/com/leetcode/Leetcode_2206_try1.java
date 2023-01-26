package com.leetcode;

public class Leetcode_2206_try1 {

	
	//Not　using HashMap 
	public boolean divideArray(int[] nums) {
		int[] cnt = new int[501];
		for (int i = 0; i < nums.length; i++) {
			cnt[nums[i]]++;
		}

		for (int i : cnt) {
			if (i % 2 == 1) {
				return false;
			}
		}

		return true;
	}
}
