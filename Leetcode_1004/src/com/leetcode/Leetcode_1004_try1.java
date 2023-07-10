package com.leetcode;

public class Leetcode_1004_try1 {
	public int longestOnes(int[] nums, int k) {

		int zeroCnt = 0, start = 0, res = 0;

		for (int end = 0; end < nums.length; end++) {
			if (nums[end] == 0) {
				zeroCnt++;
			}
			while (zeroCnt > k) {
				if (nums[start] == 0) {
					zeroCnt--;
				}
				start++;
			}
			
			res = Math .max(res,end -start +1 );
		}
		return res ;
	}
}
