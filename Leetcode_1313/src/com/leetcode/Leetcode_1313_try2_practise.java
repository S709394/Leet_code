package com.leetcode;

public class Leetcode_1313_try2_practise {
	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4 };
		System.out.println(decompressRLElist(nums));

//		for ( int num : decompressRLElist(nums)  ) {
//			System.out.println( num);
//		}
	}

	public static int[] decompressRLElist(int[] nums) {
		// totalLen

		int totalLen = 0;

		for (int i = 0; i < nums.length; i += 2) {

			totalLen += nums[i];
		}

		int[] res = new int[totalLen];

		int curIndex = 0;
		for (int i = 1; i < nums.length; i += 2) {
			int curLen = nums[i - 1];
			int curNum = nums[i];
			while (curLen > 0) {
				res[curIndex] = curNum;
				curIndex++;
				curLen--;
			}

		}
		return res;

	}
}
