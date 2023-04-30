package com.leetcode;

public class Leetcode_1351_try5_binarySearch {
	public static void main(String[] args) {
//	works well
//		try5
		int[][] grid = { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 } };
//		int[][] grid = { { 3, 2 }, { 1, 0 } };
//		int[][] grid = { { 5,1,0 }, {-5,-5,-5 } };
		System.out.println(countNegatives(grid));
	}

	public static int countNegatives(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		
		System.out.println( "m" + m  +  '/'  +  "n" +n   ); // test 

		int r = 0;
		int c = n - 1;
		
		//ans 
		int res = 0 ;
		
		while (c >=0 && r < m ) {
			System.out.println("r :" + r + "   c : " + c);//test
			System.out.println (grid[r][c]) ;
			if ( grid [r] [c] >=0) {
				
				r ++ ;
			}else {
				// the most right col has the negative num   
				res +=  m-r;  
				System.out.println("res : " + res);
				
				c-- ;
			}
			
		};
		return res ;
	}

}
