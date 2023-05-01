package com.leetcode;

public class Leetcode_1451_try7_NotBS {
	public static void main(String[] args) {
//		works well
//			try5
//		int[][] grid = { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 } };
//			int[][] grid = { { 3, 2 }, { 1, 0 } };
			int[][] grid = { { 5,1,0 }, {-5,-5,-5 } };
		System.out.println(countNegatives(grid));
	}

	public static int countNegatives(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;

		int col = 0;
		int row = m - 1;
		int res = 0;

		while (col < n && row >= 0) {

			if (grid[row][col] < 0) {

				res += n - col;
				row--;
			} else {
				col++;
			}

		}
		return res;
	}

}
