package com.leetcode;

public class Leetcode_2190_try1 {
//	
//	Runtime
//	1 ms
//	Beats
//	100%
//	Memory
//	41.9 MB
//	Beats
//	98.74%
	public int mostFrequent(int[] nums, int key) {

		int[] res = new int[1001];

		for (int i = 0; i < nums.length - 1; i++) {
			if ( nums[i] == key) {
				res[  nums [i+1]]++;
			}
		}

		int max = 0;
		int fNum = -1;
		for (int i = 1; i < 1001; i++) {

			if (res[i] > max) {
				max = res[i];
				fNum = i;
			}

		}
		return fNum;

	}

}
