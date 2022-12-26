package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode_994_try2 {
	public static void main(String[] args) {

	}

	public int orangesRotting(int[][] grid) {
		int N = grid.length;
		int M = grid[0].length;

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

			int[] orange = queue.poll();
			int r = orange[0], c = orange[1];

		}

	}
}
