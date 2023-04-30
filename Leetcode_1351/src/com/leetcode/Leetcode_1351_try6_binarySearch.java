package com.leetcode;

public class Leetcode_1351_try6_binarySearch {
	public static void main(String[] args) {
//	
//			try6
//		int[][] grid = { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 } };
//			int[][] grid = { { 3, 2 }, { 1, 0 } };
			int[][] grid = { { 5,1,0 }, {-5,-5,-5 } };
		System.out.println(countNegatives(grid));
	}

	public static int countNegatives(int[][] grid) { 
		
		int m = grid.length;
		int n = grid [0].length;
		
		int  row  =  m-1;
		
		int col =0;
		
		int res = 0 ;
		
		while  (col <n &&row >=0)  {
//			System.out.println("r :" + row + "   c : " + col);//test
//			System.out.println (grid[row][col]) ;
			if (grid [row] [col] >=0) {
				
				
				
				col++;
			}else {
				
				res += n -col ;
//				System.out.println("res : " + res);
				row --;
			}
			
			
		}
		return res ;
	}
}
