package com.leetcode;

import java.util.Arrays;

public class Leetcode_64_try2 {

	static int[][] memo;

	public static int minPathSum(int[][] grid) {

		int m = grid.length;
		int n = grid[0].length;

		memo = new int[m][n];

		for (int[] row : memo) {
			Arrays.fill(row, -1);
		}

	}
	// public static int dp

	public static int dp(int[][] grid, int i, int j) {
		// left top
		if (i == 0 && j == 0) {
			return grid[0][0];
		}

		if (i < 0 || j < 0)
			return Integer.MAX_VALUE;
			
		///??? 
		
		if (memo [i][j]!= -1) {
			 return memo [i] [j] ;
			 
		}
		
		memo[ i][j] =Math.min( dp
				);

	}
}
