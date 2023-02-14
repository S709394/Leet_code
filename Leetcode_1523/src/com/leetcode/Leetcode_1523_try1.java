package com.leetcode;

public class Leetcode_1523_try1 {

	public static void main(String[] args) {
		int low = 3, high = 7;
//		int low = 8, high = 10;
		System.out.println(countOdds(low, high));

	}

	public static int countOdds(int low, int high) {
		
		//try1
		int start = -1;
		int end = Integer.MAX_VALUE;
		if (low % 2 == 1) {
			start = low - 1;

		} else {
			start = low;
		}

		if (high % 2 == 1) {
			end = high +1;

		} else {
			end = high;
		}
//System.out.println("s , e  :" + start + "  /" + end);
		return (end - start) / 2;
	}
}
