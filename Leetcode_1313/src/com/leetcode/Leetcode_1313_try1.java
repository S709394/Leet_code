package com.leetcode;

public class Leetcode_1313_try1 {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4 };
		System.out.println(decompressRLElist(nums));

//		for ( int num : decompressRLElist(nums)  ) {
//			System.out.println( num);
//		}
	}

	public static int[] decompressRLElist(int[] nums) {
		int totalLen = 0;

		int curIndex = 0;
		for (int i = 0; i < nums.length; i += 2) {
//			System.out.println("i a:" + i);
			totalLen += nums[i];

		}
		int res[] = new int[totalLen];

		/// B

		for (int i = 1; i < nums.length; i += 2) {
//			System.out.println("i b:" + i);
			int curNum = nums[i];

			int curLen = nums[i -1];
			
//			System.out.println("curLen:" + curLen);

//			while (curLen > 0 ) {
			while (curLen > 0 && curIndex < res.length ) {

//				System.out.println("curIndex:" + i);
				res[curIndex] = curNum;
//
				curIndex++;
				curLen--;
//				System.out.println("curLen:" + curLen);
			}

		}
		return res;
	}
}
