package com.leetcode;

public class Leetcode_1337_try5 {
	public static void main(String[] args) {
		int[][] mat = { { 1, 1, 0, 0, 0 }, { 1, 1, 1, 1, 0 }, { 1, 0, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 1, 1, 1, 1, 1 } };
	}

	public static int[] kWeakestRows(int[][] mat, int k) {
		// try5
		
		int rows = mat.length;
		
		int cols = mat[0] .length;
		
		int [] cntArr = new int [rows] ;
		
		for ( int i = 0 ; i < rows ; i ++) {
			
			int curCnt = 0 ;
			
			for ( int j = 0 ; j < cols ; j ++) {
				if ( mat [ i] [ j] == 1 ) {
					curCnt  ++;
				}
				
			}
			cntArr [ i] = curCnt ;
		}
		 
	}
}
