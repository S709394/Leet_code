package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;


//Runtime
//1 ms
//Beats
//100%
//Memory
//42.2 MB
//Beats
//70.55%
public class Leetcode_994_try2 {
	public static void main(String[] args) {

	}

	public int orangesRotting(int[][] grid) {
		int M = grid.length;
		int N = grid[0].length;

		int count = 0;

		Queue<int[]> queue = new LinkedList<>();

		for (int r = 0; r < M; r++) {
			for (int c = 0; c < N; c++) {
				if (grid[r][c] == 1) {
					count++;
				}
				if (grid[r][c] == 2) {

					queue.add(new int[] { r, c });
				}

			}
		}
		int round = 0;
		while (count > 0 && !queue.isEmpty()) {
			round++;

			int n = queue.size();
			for (int i = 0; i < n; i++) {
				int[] orange = queue.poll();
				int r = orange[0], c = orange[1];

				if (r > 0 && grid[r - 1][c] == 1) {
					grid[r - 1][c] = 2;
					queue.add(new int[] { r - 1, c });
					count--;
				}

				if (c > 0 && grid[r][c - 1] == 1) {
					grid[r][c - 1] = 2;
					queue.add(new int[] { r, c - 1 });
					count--;
				}
				if (r < M - 1 && grid[r + 1][c] == 1) {
					grid[r + 1][c] = 2;
					queue.add(new int[] { r + 1, c });
					count--;
				}
				if (c < N - 1 && grid[r][c + 1] == 1) {
					grid[r][c + 1] = 2;
					queue.add(new int[] { r, c + 1 });
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
