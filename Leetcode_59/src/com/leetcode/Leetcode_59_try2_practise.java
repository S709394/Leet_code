package com.leetcode;

public class Leetcode_59_try2_practise {
	public int[][] generateMatrix(int n) {
		int down_bound = n - 1, up_bound = 0;
		int left_bound = 0, right_bound = n - 1;

		int num = 1;
		int[][] res = new int[n][n];

		while (num <= n * n) {
			if (up_bound <= down_bound) {
				for (int i = left_bound; i <= right_bound; i++) {

					res[up_bound][i] = num++;
				}
				up_bound++;
			}
			if (left_bound <= right_bound) {
				for (int i = up_bound; i <= down_bound; i++) {
					res[i][right_bound] = num++;
				}
				right_bound--;
			}
			if (up_bound <= down_bound) {
				for (int i = right_bound; i >= left_bound; i--) {
					res[down_bound][i] = num++;
					System.out.println("num:" + num ); //test
				}
				down_bound--; 
				
			}
			if (left_bound <= right_bound) {
				for (int i = down_bound; i >= up_bound; i--) {
					res[i][left_bound] = num++;
				}
				left_bound++;
			}

		}
		return res ;
	}
}
