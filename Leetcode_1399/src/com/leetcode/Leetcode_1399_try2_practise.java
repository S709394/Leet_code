package com.leetcode;

public class Leetcode_1399_try2_practise {

	public static void main(String[] args) {
		int n = 13;

		System.out.println(countLargestGroup(n));
	}

	public static int countLargestGroup(int n) {

		// maxSum : the largest group 's cnt of digit

		int maxSum = 0;
		// 0~ 10000  :    9 +9 +9 +9 =36
		int[] cnt = new int[37];
		for (int i = n; i > 0; i--) {
			int sum = getSum(i);
			
			
			cnt[sum]++;
			maxSum = Math.max(cnt[sum], maxSum);
		}
		int res = 0;

		for (int i = 36; i > 0; i--) {
			if (cnt[i] == maxSum) {
				res++;
			}
		}
		return res;
	}

	// sum of digits
	public static int getSum(int n) {
		int sum = 0;

		while (n >= 10) {
			sum += n % 10;
			n = n / 10;

		}
		sum += n;
		return sum;
	}
}
