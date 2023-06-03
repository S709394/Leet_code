package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode_1091_try1 {
	public int shortestPathBinaryMatrix(int[][] grid) {
		int m = grid.length, n = grid[0].length;

		// top left and right bottom
		if (grid[0][0] == 1 || grid[m - 1][n - 1] == 1) {
			return -1;
		}

		Queue<int[]> q = new LinkedList<>();
		int[][] dirs = new int[][] { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 }, { 1, 1 }, { 1, -1 }, { -1, 1 },
				{ -1, -1 } };

		

		// make sure not walk as loop
		boolean[][] visited = new boolean[m][n];
		// init the Queue q
		q.offer(new int[] { 0, 0 });
		 visited[0][0] = true;

		int pathLen = 1;

		while (!q.isEmpty()) {
			int sz = q.size();
			for (int size = 0; size < sz; size++) {
				int[] cur = q.poll();

				int x = cur[0];
				int x = cur[1];
				
				if(x == m-1 &&y==n-1) {
					return pathLen;
				}
				for (int i = 0 ; i < 8 ; i ++) {
					if (nextX >= 0 && nextX < m && nextY >= 0 && nextY < n && grid[nextX][nextY] == 0
							&& visited[nextX][nextY] != true) {

					}
				}
				

			}
			pathLen++;
		}
		return pathLen;
	}
}
