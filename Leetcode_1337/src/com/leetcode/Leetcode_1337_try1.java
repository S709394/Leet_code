package com.leetcode;

import java.util.Arrays;

public class Leetcode_1337_try1 {

	public int[] kWeakestRows(int[][] mat, int k) {
		
		//not good 

		int m = mat[0].length;
		int n = mat.length;
		int[] cntArr = new int[n];

		for (int i = 0; i < m; i++) {
			int curCnt = 0;

			for (int j = 0; j < n; j++) {
				if (mat[i][j] == 1) {
					curCnt++;
				}
			}
			cntArr  [ i] = curCnt ;
		}
		Arrays.sort(cntArr);
		
		int [] res = new int [ k] ;
		for ( int i = 0  ;i < k ; i ++) {
			res [i] = cntArr [i] ; 
			System.out.println(  " res [i]  : " +res [i]  );
		}
		return res ;
	}
}
