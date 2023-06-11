package com.leetcode;

public class Leetcode_1232_try1 {
	public static void main(String[] args) {
//		int[][] coord = new int[][] { { -1, 0 }, { 1, 2 }, { 2, 3 }, { 3, 4 } };
//		int[][] coord = new int[][] { { 1, 2 }, { 2, 3 }, { 3, 4 } };
		int[][] coord = new int[][] { { 0, 2 }, { 2, 4}, { 4, 6} };
		System.out.println(checkStraightLine(coord));
	}

	public static boolean checkStraightLine(int[][] coordinates) {
		int coorLen = coordinates.length;

		if (coorLen == 2) {
			return true;
		}

		int div = coordinates[1][1] - coordinates[0][1];
		System.out.println("div :" + div);// test
		if (div == 0) {
			for (int i = 2; i < coorLen; i++) {
				if (coordinates[i][1] != coordinates[0][1]) {
					return false;
				}
			}
		} else {

			double ans = ((double)coordinates[1][0] - (double)coordinates[0][0] )/
					((double)coordinates[1][1] -(double) coordinates[0][1]);
			
//			System.out.println((double)coordinates[1][1] -(double) coordinates[0][1]);
			System.out.println("ans: "  + ans);
			for (int i = 1; i < coorLen - 1; i++) {
				System.out.println(i); // test
				int xA = coordinates[i][0];
				int yA = coordinates[i][1];
				int xB = coordinates[i + 1][0];
				int yB = coordinates[i + 1][1];

				double rate = (yB - xB )/ (yA - xA); //test
				System.out.println("rate" + rate);
				if (rate != ans) {
					return false;
				}

			}
		}
		return true;
	}
}
