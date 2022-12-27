package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

//practise  , same as try 1 
public class Leetcode_994_try3_practise {
	
//	Runtime
//	1 ms
//	Beats
//	100%
//	Memory
//	41.4 MB
//	Beats
//	99.63%
	public int orangesRotting(int[][] grid) {
		int M = grid.length;
		int N = grid[0].length;
		Queue<int[]> queue = new LinkedList<>();

		int count = 0;

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (grid[i][j] == 1) {
					count++;
				}
				if (grid[i][j] == 2) {
					queue.add(new int[] { i, j });
				}
			}
		}
//		System.out.println( "count" + count ); //test 
		int round = 0;
		while (count > 0 && !queue.isEmpty()) {
			round++;
			int n = queue.size();
			for (int i = 0; i < n; i++) {

				int[] orange = queue.poll();
				int r = orange[0], c = orange[1];

				if (c + 1 < N && grid[r][c + 1] == 1) {
					grid[r][c + 1] = 2;
					queue.add(new int[] { r, c + 1 });
					count--;
				}
				if (c - 1 >= 0 && grid[r][c - 1] == 1) {
					grid[r][c - 1] = 2;
					queue.add(new int[] { r, c - 1 });
					count--;
				}
				if (r + 1 < M && grid[r + 1][c] == 1) {
					grid[r + 1][c] = 2;
					queue.add(new int[] { r + 1, c });
					count--;
				}

				if (r - 1 >= 0 && grid[r - 1][c] == 1) {
					grid[r - 1][c] = 2;
					queue.add(new int[] { r - 1, c });
					count--;
				}

			}
		}
		if (count == 0) {
			return round;
		}
		return -1;
	}
}
