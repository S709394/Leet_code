package com.leetcode;

public class Leetcode_1399_try1 {

	// from 0~10000 , so the max of sum should be 9+9 + 9 + 9 =36
	public int countLargestGroup(int n) {

	}

	public int getSum(int n) {
		int sum = 0;

		while (n > 10) {
//			sum *= 10 ;
			sum += n % 10;

			n = n / 10;
		}
		sum += n;

		return sum;
	}
}
