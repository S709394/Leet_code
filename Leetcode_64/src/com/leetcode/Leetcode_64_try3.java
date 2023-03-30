package com.leetcode;

import java.util.Arrays;

public class Leetcode_64_try3 {

	// a static int [] [] memo to store the result

	static int[][] memo;

	public static int minPathSum(int[][] grid) {
		// m , n

		int m = grid.length, n = grid[0].length;

		// fill the defaule value as - 1
		memo = new int[m][n];

		for (int[] row : grid) {
			Arrays.fill(row, -1);
		}

	}

	public static int dp(int[][] grid, int i, int j) {

		// dp []

		// 1 .left top

		if (i == 0 && j == 0) {
			return grid[0][0];
		}
		// 2. the edge

		if (i < 0 || j < 0)

		{
			return Integer.MAX_VALUE;
		}
		// 3. when memo [i] [j] != -1 ;
		
		if ( memo [i] [j]!= -1) 
		{
			return memo[i] [j];
		}

	}

}
