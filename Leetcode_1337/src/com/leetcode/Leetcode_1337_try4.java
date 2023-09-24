package com.leetcode;

public class Leetcode_1337_try4 {
	public static void main(String[] args) {

	}

	public static int[] kWeakestRows(int[][] mat, int k) { // try4
		int rows = mat.length;
		int cols = mat[0].length;

//		int  [] []cntArr = new int [ rows ] [cols] ; 
		int[] cntArr = new int[rows];
		for (int i = 0; i < rows; i++) {
			int curCnt = 0;
			
			for (int j = 0; j < cols; j++) {
				if (mat[i][j] == 1) {
					curCnt++;
				}
			}
			cntArr[i] = curCnt;
			System.out.println( "curCnt :" + curCnt ); //test
		}
		
		int ans [] = new int [k] ;
		for ( int i = 0 ; i < k ; i ++) {
			int min =  Integer.MAX_VALUE;
			
			int minIdx = 0 ;
			
			for ( int j = 0 ; j < cntArr.length; j ++ ) {
				if(  cntArr[i] <   min){
					min = cntArr[i];
					
					minIdx = i ;
				}
			}			
			ans [i] = cntArr [minIdx];
			
			cntArr[minIdx] = Integer.MAX_VALUE;
			System.out.println( "cntArr[minIdx] :" + cntArr[minIdx] ); //test ;
		}
		 return ans ;
	}
}
