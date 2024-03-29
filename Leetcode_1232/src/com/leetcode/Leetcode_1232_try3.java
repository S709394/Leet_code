package com.leetcode;

public class Leetcode_1232_try3 {
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

		// try3

		// 3 points in a line :
		// (x1 - x0) / (y1 -y0) == (x2 -x1 ) / (y2-y1 )

//		dx =x1 -x0  , dy = y1-y0 ;
		// dx * (curY- y0 ) = dy (curX -x0);

		if (coord == null || coord.length <2 || coord[0].length < 2) {
			return false;
		}

		int x0 = coord[0][0], y0 = coord[0][1], x1 = coord[1][0], y1 = coord[1][1];

		// diff of the x
		int dx = x1 - x0, dy = y1 - y0;

		for (int i = 2; i < coord.length; i++) {

			int curX = coord[i][0], curY = coord[i][1];

			if (dx * (curY - y0) != dy * (curX - x0)) {
				return false;
			}

		}
		return true;
	}
}
