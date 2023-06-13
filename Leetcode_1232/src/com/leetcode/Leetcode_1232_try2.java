package com.leetcode;

public class Leetcode_1232_try2 {
	public static void main(String[] args) {
//		int[][] coord = new int[][] { { -1, 0 }, { 1, 2 }, { 2, 3 }, { 3, 4 } };
		int[][] coord = new int[][] { { 1, 2 }, { 2, 3 }, { 5, 7 } };
//		int[][] coord = new int[][] { { 0, 2 }, { 2, 4}, { 4, 6} };
//		int[][] coord = new int[][] { { 0, 0 }, { 0, 1 }, { 0, -1 } };
//		int[][] coord = new int[][] { { 2, 0 }, { 3, 0 }, { -1, 0 } };
//		int[][] coord = new int[][] { { 2, 1 }, { 4, 2 }, { 6, 3 } };
		System.out.println(checkStraightLine(coord));
	}

	public static boolean checkStraightLine(int[][] coordinates) {
		// (x2 -x0 ) / ( y2 - y0) == (x2 - x1 ) / (y2 -y1)

		// dy* ( curX - x0) = dX * ( curX-x0);

		
		//do not need this 
		if (coordinates == null || coordinates.length < 2 || coordinates[0].length == 0) {
			return false;
		}
		int x0 = coordinates[0][0], y0 = coordinates[0][1], x1 = coordinates[1][0], y1 = coordinates[1][1];

		
		// the different between  point1 and point0
		int dx = x1 - x0, dy = y1 - y0;

		for (int i = 1; i < coordinates.length; i++) {

			int curX = coordinates[i][0], curY = coordinates[i][1];
			if (dy * (curX - x1) != dx * (curY - y1)) {
				return false;
			}
		}
		return true ;
	}
}
