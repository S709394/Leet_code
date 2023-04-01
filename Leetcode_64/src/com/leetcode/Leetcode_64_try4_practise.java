package com.leetcode;

import java.util.Arrays;

public class Leetcode_64_try4_practise {

	// static 2D array

	static int[][] memo;

// contagen2121_2022
	public static int minPathSum(int[][] grid) {
		//practise 4 unfinished
		int m = grid.length, n = grid[0].length;

		memo = new int[m][n];
		for (int[] row : memo) {
			Arrays.fill(row, -1);
		}

		return dp (grid , m-1 , n-1);

	}

	public static int dp(int[][] grid, int i, int j) {

		if (i < 0 || j < 0) {
			return Integer.MAX_VALUE;
		}

		if (memo[i][j] != -1) {
			return memo[i][j];
		}

		memo[i][j] = Math.min(dp(grid, i - 1, j), dp(grid, i, j - 1))   + grid[i][j];

		return memo[i][j];

	}
}
