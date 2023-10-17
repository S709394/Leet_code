package com.leetcode;

import java.util.Arrays;

public class Leetcode_2500_try1 {
	public static void main(String[] args) {
		int[][] grid = { { 1, 2, 4 }, { 3, 3, 1 } };
		System.out.println(deleteGreatestValue(grid));
	}

	public static int deleteGreatestValue(int[][] grid) {
		
		//try1 
		int m = grid.length, n = grid[0].length;

		for (int i = 0; i < m; i++) {
			Arrays.sort(grid[i]);
		}

		int ans = 0;
		for (int j = 0; j < n; j++) {
//			System.out.println("i :" + j);
			int max = 0;

			for (int i = 0; i < m; i++) {
				max = Math.max(grid[i][j], max);
//				System.out.println(" max :" + max);
//				System.out.println(grid[i][j]);
			}
			ans += max;

		}
		return ans;
	}
}
