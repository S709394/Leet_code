package com.leetcode;

public class Leetcode_1351_try4_binarySearch {
	public static void main(String[] args) {
		
//		int[][] grid = { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 } };
//		int[][] grid = { { 3, 2 }, { 1, 0 } };
		int[][] grid = { { 5, 1, 0 }, { -5, -5, -5 } };
//		int[][] grid = { { 5, 1, 0 }, { -5, -5, -5 }, { -5, -5, -5 } };
		System.out.println(countNegatives(grid));
	}

	public static int countNegatives(int[][] grid) {
		//try4
		
//		https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/solutions/510249/java-python-3-2-similar-o-m-n-codes-w-brief-explanation-and-analysis/?orderBy=most_votes
		
		//edge 
		int m = grid.length;
		int n = grid[0].length;
		System.out.println( "m" + m  +  '/'  +  "n" +n   );

		//row : start   from top 
		int r = 0;
		
		// Column front right to left 
		int c = n - 1;
		
		int cnt = 0;

		while (c >= 0 && r < m) {
			System.out.println("r :" + r + "   c : " + c);
			if (grid[r][c] < 0) {
				c--;
				
				// count the  negatives num in this row
				cnt += m - r;
				System.out.println("cnt : " + cnt);
			}else {
				r++;
			}
		}
		
		return cnt ;

	}
}
