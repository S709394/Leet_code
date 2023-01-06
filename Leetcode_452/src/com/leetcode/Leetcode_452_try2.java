package com.leetcode;

import java.util.Arrays;

//Upgrade to Integer .compare ()  
public class Leetcode_452_try2 {
	public static void main(String[] args) {
		int[][] points = { { -2147483646, -2147483645 }, { 2147483646, 2147483647 } };
		System.out.println(findMinArrowShots(points));
	}

	

	public static int findMinArrowShots(int[][] points) {

		if (points.length == 0)
			return 0;
		// Lambda expsion // this is not that say

		// This one not good : // integer overflow happens in here
		// [[-2147483646,-2147483645],[2147483646,2147483647]] 
//		 Arrays.sort(points, (a, b) -> a[1] - b[1]); 

		Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1])); //Better
		int cnt = 1;

		int arrowPos = points[0][1];

		System.out.println(arrowPos);
		// Test

		for (int i = 1; i < points.length; i++) {

//			System.out.println(-2147483645 - 2147483645); // test
			if (arrowPos >= points[i][0]) {
				continue;
			}

			arrowPos = points[i][1];
			cnt++;

		}
		return cnt;
	}
	
	
//	//sth like this    in  Integer.compare ()
//		public static int compareA(int x, int y) {
//
//			if (x < y) {
//				return -1;
//			} else {
//				if (x == y) {
//					return 0;
//				} else {
//					return 1 ;
//				}
//			}
//
//		}
}
