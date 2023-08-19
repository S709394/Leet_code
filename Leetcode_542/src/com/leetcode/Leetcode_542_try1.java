package com.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Leetcode_542_try1 {
	public int[][] updateMatrix(int[][] mat) {
		int m = mat.length;

		int n = mat[0].length;

		int[][] memo = new int[m][n];

		/// fill them with -1
		for (int[] row : mat) {
			Arrays.fill(row, -1);
		}

		Queue<int[]> q = new LinkedList<>();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] == 0) {
					memo[i][j] = 0;
					q.offer(new int[]  {i,j});
				}

			}
		}
		
		// BFS  , nearby 
		
		int [ ] [] dirs = new int [] []   {   {0,1} , {1,0}  , {-1,0} , {0,-1}} ;
		
		while (!q.isEmpty()) {
			int [] cur = q.poll();
			
			int x = cur[0 ] , y = cur [1] ;
		}

	}
}
