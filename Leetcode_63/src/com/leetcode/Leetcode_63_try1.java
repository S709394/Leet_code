package com.leetcode;

public class Leetcode_63_try1 {

	int[][] memo;

	public int uniquePathsWithObstacles(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		memo = new int[m][n];

		return dp(grid, m - 1, n - 1);
	}

	public  int dp(int[][] grid, int i, int j) {
		int m = grid.length, n = grid[0].length;

		//rock or out of bound 
		if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 1) {
			return 0;
		}
		//the  most left top one
		if (i == 0 && j == 0) {
			return 1;
		}
		if (memo[i][j] > 0) {
			return grid[i][j];
		}
		int left =  dp(memo, m, n - 1); 
		int up =dp(memo, m - 1, n);
		memo[i][j] = left + up;
		return memo[i][j];

	}
}
