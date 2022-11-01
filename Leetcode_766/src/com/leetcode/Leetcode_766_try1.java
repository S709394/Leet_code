//766. Toeplitz Matrix

package com.leetcode;

public class Leetcode_766_try1 {
	public boolean isToeplitzMatrix(int[][] matrix) {
//		int r = matrix .length;
		for ( int r = 0 ; r < matrix .length ; r++) {
			for ( int c = 0 ; c < matrix[0] .length ; c++) {
				if(c>0 && r> 0 && matrix [c-1] [r-1] !=  matrix [c] [r]  )
				{
					return false ;
				}
				
			}
		}
		
		return true ;

    }
}
