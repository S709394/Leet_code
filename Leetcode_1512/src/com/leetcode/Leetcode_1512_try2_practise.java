package com.leetcode;

public class Leetcode_1512_try2_practise {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1, 1, 3 };
		System.out.println(numIdenticalPairs(nums));
	}

	public static int numIdenticalPairs(int[] nums) {
		// try2 practise  works well
		int left = 0, right = nums.length - 1;

		int cnt = 0;
		for (int i = left; i < right ; i++) {
//			System.out.println( "iAAA :" + i ) ; //test;
			for (int j = i + 1; j <=right; j++) {
//				System.out.println( "j :" + j ) ;
				if (nums[i] == nums[j]) {
					cnt++;
				}
			}
		}
		
		
		return cnt;

	}
}
