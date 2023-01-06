package com.leetcode;

import java.util.Arrays;



//https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/solutions/3001454/Explained-code....passed-all-the-edge-case-(-2147483646-214748364521474836462147483647)
//Going to update it in try2 
public class Leetcode_452_try1 {
	public int findMinArrowShots(int[][] points) {
		// base

		if (points.length == 0)
			return 0;
		// Lambda expsion    // this is not that say 
		Arrays.sort(points, (a, b) -> a[1] - b[1]);
		int cnt = 1;

		int arrowPos = points[0][1];

		for (int i = 1; i < points.length; i++) {
			
//			//1.my try , does not works 
//			if (arrowPos >= points[i][0]) {
//				continue;
//			}
//			
//			arrowPos = points[i][1];
//			cnt++;
			
			//2 . 
			int diff = points[i][0]-arrowPos ;
			
			if(diff>0) {
				cnt ++ ;
				arrowPos = points[i][1];
			}
			
			
			
		}
		return cnt;
	}
}
