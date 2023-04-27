package com.leetcode;

public class Leetcode_1351_try5_binarySearch {
	public static void main(String[] args) {
		// DOes not works
		// TRY THE 2ND CASE
		// going to try 2
		int[][] grid = { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 } };
//		int[][] grid = { { 3, 2 }, { 1, 0 } };
//		int[][] grid = { { 5,1,0 }, {-5,-5,-5 } };
		System.out.println(countNegatives(grid));
	}

	public static int countNegatives(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;

		int r = 0;
		int c = n - 1;
		
		//ans 
		int res = 0 ;
		
		while (c >=0 && r < m-1 ) {
			if ( grid [r] [c] >=0) {
				
				res += n -c +1;
			}
		};

	}

}
