package com.leetcode;

public class Leetcode_1232_try4_practise {
	public static void main(String[] args) {
//		int[][] coord = new int[][] { { -1, 0 }, { 1, 2 }, { 2, 3 }, { 3, 4 } };
		int[][] coord = new int[][] { { 1, 2 }, { 2, 3 }, { 5, 7 } };
//		int[][] coord = new int[][] { { 0, 2 }, { 2, 4}, { 4, 6} };
//		int[][] coord = new int[][] { { 0, 0 }, { 0, 1 }, { 0, -1 } };
//		int[][] coord = new int[][] { { 2, 0 }, { 3, 0 }, { -1, 0 } };
//		int[][] coord = new int[][] { { 2, 1 }, { 4, 2 }, { 6, 3 } };
		System.out.println(checkStraightLine(coord));
	}

	public static boolean checkStraightLine(int[][] coord) {
		// (x1 - x0 ) / (y1-y0) == (curX - x0 ) ( curY - y0)
		// dx* ( curY - y0) == dy *( curX - x0 ;)

		if (coord == null || coord.length < 3 || coord[0].length < 2) {
			return false;
		}

		int x0 = coord[0][0], y0 = coord[0][1], x1 = coord[1][0], y1 = coord[1][1];

		// diff of x
		int dx = x1 - x0, dy = y1 - y0;

		for (int i = 1; i < coord.length; i++) {
			int curX = coord[i][0], curY = coord[i][1];
			if (dx * (curX - x0) != dy * (curY - y0)) {
				return false;
			}
		}
		return true;
	}
}
