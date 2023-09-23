package com.leetcode;

public class Leetcode_1337_try3 {
	public static void main(String[] args) {

	}

	public static int[] kWeakestRows(int[][] mat, int k) { //  try3 does not works 
		// rpg
		int rows = mat.length;
		int cols = mat[0].length;

		int[] cnts = new int[rows];
		for (int i = 0; i < rows; i++) {
			int cnt = 0;
			for (int j = 0; j < cols; j++) {

				if (mat[i][j] == 1) {
					cnt++;
				}
			}
			
			cnts[i] = cnt ;
			
		}
		
		
		int  []  ans = new int [k] ; 
		for ( int i = 0 ; i < k ; i ++) {
//			if()
			int minCnt = Integer.MAX_VALUE ;
			for( int j = 0; j < rows ; j ++) {
				if( cnts [j] < minCnt) {
					minCnt = cnts [j];
					
					cnts [ j] = Integer.MAX_VALUE ;
				}
			}
			
			ans [i] = minCnt;
			
			
			
			
			
		}
		
		
		return ans ;
		
		
		
	}
}
