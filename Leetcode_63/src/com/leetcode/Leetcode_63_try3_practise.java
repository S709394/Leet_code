package com.leetcode;

public class Leetcode_63_try3_practise {
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
		
		if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 1) {
			return 0;
		}
		if (i == 0 && j == 0) {
			return 1;
		}
		if (memo[i][j] > 0) {
			return memo[i][j];
		}
		int up = dp(grid, i - 1, j);
		int left = dp(grid, i, j - 1);
		int res = up + left;
		memo[i][j] = res;
		return memo[i][j];
	}
}
