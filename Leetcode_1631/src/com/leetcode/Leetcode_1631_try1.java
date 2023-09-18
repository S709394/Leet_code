package com.leetcode;

import java.util.Arrays;

public class Leetcode_1631_try1 {
	public static void main(String[] args) {

	}

	public int minimumEffortPath(int[][] heights) {
		
		//does not works
		

		int row = heights[0].length;
		int col = heights.length;

		int[][] memo = new int[col][row];

		for (int[] c : memo) {
			Arrays.fill(c, Integer.MAX_VALUE);
		}

		memo[0][1] = Math.abs(heights[0][1] - heights[0][0]);
		memo[1][0] = Math.abs(heights[1][0] - heights[0][0]);
d
		
		
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				
				memo  [ i] [ j ] = helper ( heights , i , j , memo  ) ;
			}
		}

		return memo [ col-1] [row-1] ;
	}
	
	public static  int   helper (int[][] heights , int x , int y  ) {
		
		
	}	
	
	
}
