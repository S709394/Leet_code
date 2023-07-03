package com.leetcode;

public class Leetcode_908_try2 {
	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 1000 };
		int k = 3;
		System.out.println(smallestRangeI(nums, k));
	}

	public static int smallestRangeI(int[] arr, int k) {
		//try2 practise 
		int min = arr[0], max = arr[0];
		int len = arr.length;
		for (int i = 1; i < len; i++) {
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);

		}
		int res = (max - k) - (min + k);
//      min =Math.max(max, arr[i]);
		
		 // if ( res < 0   ) retutn 0   // or return res ;
		return res < 0 ? 0 : res;
	}
}
