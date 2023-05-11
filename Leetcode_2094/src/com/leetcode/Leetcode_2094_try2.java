package com.leetcode;

public class Leetcode_2094_try2 {
	public static void main(String[] args) {
		int nums[] = { 1, 3, 5, 2 };

		System.out.println(findEvenNumbers(nums));
	}

	public int[] findEvenNumbers(int[] digits) {
		int[] cnt = new int[10];

		for (int i : digits) {
			cnt[i]++;

		}

		for (int i = 100; i < 1000; i += 2) {

			int curCnt[] = new int[10];

			String numStr = i + "";

			for (int j = 0; j < 3; j++) {
				
				 cur [ j] =numStr.charAt(i ) -'0' ;
			}

		}

	}
}
