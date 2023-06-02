package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode_1091_try1 {
	public int shortestPathBinaryMatrix(int[][] grid) {
		int m = grid.length, n = grid[0].length;

		
		// make sure not walk as loop
		boolean[][] visited = new boolean[m][n];

		// top left and right bottom
		if (grid[0][0] == 1 || grid[m - 1][n - 1] == 1) {
			return -1;
		}

		int[][] dirs = new int[][] { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 }, { 1, 1 }, { 1, -1 }, { -1, 1 },
				{ -1, -1 } };

		Queue<int[]> q = new LinkedList<>();

		// init the Queue q
		q.offer(new int[] { 0, 0 });
		
		while (!  q.isEmpty()) {
			 int size =  q.size();
			 for (int  size = 0 ; size<)
		}

	}
}
