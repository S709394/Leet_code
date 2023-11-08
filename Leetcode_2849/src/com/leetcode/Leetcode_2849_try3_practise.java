package com.leetcode;

public class Leetcode_2849_try3_practise {
	
	// try3
	
	// space complexity of this code is also O(1)
	//	The time complexity of this code is O(1)
	public static void main(String[] args) {
		int sx = 2, sy = 4, fx = 7, fy = 7, t = 6;
		System.out.println(isReachableAtTime(sx, sy, fx, fy, t));
	}

	public static boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
		//try3 practise 
		int xDiff = Math.abs(sx - fx);
		int yDiff = Math.abs(sy - fy);

		if (xDiff == 0 && yDiff == 0) {
			return t == 0 || t > 1;
		}

		return Math.max(xDiff, yDiff) <=t ;
	}
}
