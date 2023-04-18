package com.leetcode;

public class Leetcode_1351_try1_binarySearch {
	public static void main(String[] args) {
		//going to try 2 
		int[][] grid = { { 4, 3, 2, -1 }, 
				{ 3, 2, 1, -1 }, 
				{ 1, 1, -1, -2 }, 
				{ -1, -1, -2, -3 } };
		System.out.println(countNegatives(grid));
	}

	public static int countNegatives(int[][] grid) {
		//works //
		
		int res = 0;

		int m = grid.length;

		int n = grid[0].length;
		int i = 0;
		int j = n - 1;
		while (i < m&& j>=0) {
//		while (i < m) { // wrong 
			if (grid[i][j] < 0) {
				res += m - i;
				System.out.println("res" + res);
				j--;

			} else {
				i++;
			}
		}return res;
}}
