package com.leetcode;

public class Leetcode_1037_try2 {
	public static void main(String[] args) {
//		int[][] points = { { 1, 1 }, { 2, 2 }, { 3, 3 } };
		int[][] points = { { 0, 0 }, { 1, 2 }, { 0, 1 } };

		System.out.println(isBoomerang(points));

	}

	public static boolean isBoomerang(int[][] points) {
		// try2 _ cross multiple

		// int k_AB = (points [1] [0] - points [0][0]) / ( points[1] [1] - points [ 0]
		// [1]) ;
		// int k_BC = (points [2] [0] - points [1][0]) / ( points[2] [1] - points [ 1]
		// [1]);

		int mutipleAB = (points[1][0] - points[0][0]) * (points[2][1] - points[1][1]);

		return (points[2][0] - points[1][0]) * (points[1][1] - points[0][1]) != mutipleAB;
	}
}
