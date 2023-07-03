package com.leetcode;

public class Leetcode_908_try1 {
	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 1000 };
		int k = 3;
		System.out.println(smallestRangeI(nums, k));
	}

	public static int smallestRangeI(int[] arr, int k) {
		int numLen = arr.length;
		if (numLen == 1)
			return 0;
		int min = arr[0];
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}
		min = (max - k) - (min + k);
		return min < 0 ? 0 : min;
//        return 0 ;
	}
}
