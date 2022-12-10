package com.leetcode;

public class Leetcode_63_try2_practise {
	int[][] memo;

	public int uniquePathsWithObstacles(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		memo = new int[m][n];
		return dp(grid, m - 1, n - 1);

	}

	public int dp(int[][] grid, int i, int j) {
		int m = grid.length;
		int n = grid[0].length;

		if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 1) {
			return 0;
		}
		// the left top one
		if (i == 0 && j == 0) {
			return 1;
		}
		
		//skip the recalculate
		if (memo[i][j] > 0) {
			return memo[i][j];
		}
		// the  paths number are always the  (left)  one  + the (up) one ;
		int left = dp(grid, i, j - 1);
		int up = dp(grid, i - 1, j);
		
		memo[i][j]=left+up;
		
		return memo[i][j];
	}
}
