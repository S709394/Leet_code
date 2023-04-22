package com.leetcode;

public class Leetcode_1351_try2_binarysearch {
	public static void main(String[] args) {
		//DOes not works 
		//  TRY THE 2ND CASE
		// going to try 2
		int[][] grid = { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 } };
//		int[][] grid = { { 3, 2 }, { 1, 0 } };
//		int[][] grid = { { 5,1,0 }, {-5,-5,-5 } };
		System.out.println(countNegatives(grid));
	}

	public static int countNegatives(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		System.out.println( "m: " + m + "n : " + n );
		// i , j

		int i = 0;
		int j = n - 1;

		int res = 0;

		while (j >= 0 && i < m) {

			System.out.println("i :" + i + "  /n j : " + j);
			if (grid[i][j] >= 0) {
				res += n - j-1 ;
				System.out.println("res : " + res);
				i++;
//				System.out.println(" j-- ");
			} else {
				j--;
			}
		}
		if (grid[m-1][0] < 0) {
			res += n;
		}

		return res;
	}

}
