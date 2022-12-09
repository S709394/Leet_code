package com.leetcode;

public class Leetcode_62_try1 {
	public int uniquePaths(int m, int n) {
//		 memo is a two-dimensional array that is used 
		// to store the results of the dp
		int[][] memo = new int[m][n];
		return dp(m - 1, n - 1, memo);

	}

	public static int dp(int x, int y, int[][] memo) {
		// base case // and there are no paths at that position.
		if (x < 0 || y < 0) {
			return 0;
		}

		// Only 1 path
		if (x == 0 && x == 0) {
			return 1;
		}

		// return the stored result to avoid recalculating it.

		if (memo[x][y] != 0) {
			return memo[x][y];
		}
		
		// sum the 2 together - >  memo [x] [y];
		memo[x][y] = dp(x - 1, y, memo) + dp(x, y - 1, memo);
		
		return memo[x][y];

	}
}
