package com.leetcode;

public class Leetcode_2849_try1 {
	public static void main(String[] args) {
		int sx = 2, sy = 4, fx = 7, fy = 7, t = 6;
		System.out.println(isReachableAtTime(sx, sy, fx, fy, t));
	}

	public static boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
		if ( sx ==fx && sy==fy) {
			return t==0 || t>1 ;
		}
		int xDiff = Math.abs(sx - fx);
		int yDiff = Math.abs(sy - fy);

//		System.out.println(xDiff + " /" + yDiff);//test

		return xDiff+ yDiff >= t;
	}
}
