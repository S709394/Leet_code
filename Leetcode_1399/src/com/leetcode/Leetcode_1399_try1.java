package com.leetcode;

public class Leetcode_1399_try1 {

	public static void main(String[] args) {
		int n = 13;

		System.out.println(countLargestGroup(n));
	}

	// from 0~10000 , so the max of sum should be 9+9 + 9 + 9 =36
	
//	/https://leetcode.cn/problems/count-largest-group/solution/suan-fa-shi-sui-zhao-shu-ju-zou-de-by-ch-yn64/
	public static int countLargestGroup(int n) {

		int maxSum = 0;
		int[] cnt = new int[37];
		for (int i = n; i > 0; i--) {
			int sum = getSum(i);
			cnt[sum]++; 
			maxSum = Math.max(maxSum, sum);
			; 
			System.out.println( "i :" + i);
			System.out.println( "maxSum :" + maxSum);
		}

		int res = 0;

		for (int i = 36; i > 0; i--) {
			if (cnt[i] == maxSum) {
				res++; 
			}
		}
		return res;
	}

	public static int getSum(int n) {
		int sum = 0;

		while (n >= 10) {
//			sum *= 10 ;
			sum += n % 10;

			n = n / 10;
		}
		sum += n;
//		System.out.println("sum: " + sum); // test
		return sum;
	}
}
