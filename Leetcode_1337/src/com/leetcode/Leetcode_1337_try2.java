package com.leetcode;

public class Leetcode_1337_try2 {
	public static void main(String[] args) {
		
	}
	public static int[] kWeakestRows(int[][] mat, int k) 
	{ // try2  looks good  // not good so far 
		int rows = mat.length;
		int cols = mat[0].length;
		
		int []  arr = new int [ rows] ;
		
		for (int i = 0 ; i < rows; i ++) {
			int count1 = 0 ; 
			for ( int j = 0  ;j < cols ; j ++ ) {
				if ( mat [ i] [j] == 1) {
					count1++;
				}
				
			}
			arr[i] = count1 ;
			
		}
		
		int ans [] = new int [ k] ;
		
		
		
		for ( int i = 0 ;i < k ; i ++) {
			int min = Integer.MAX_VALUE;
			int minIdx =  0;
			
			for ( int j = 0 ; j < arr.length ; j ++) {
				if ( arr[j] < min) {
					min = arr[j ] ;
					minIdx = j ;
				}
			}
			
			ans [ i ] = minIdx ;
			
			arr [ minIdx ]= Integer.MAX_VALUE;
		}
		return ans;
		
	}
	
}	
