package com.leetcode;

public class Leetcode_223_try1 {
	public static void main(String[] args) {
		int ax1 = -3, ay1 = 0, ax2 = 3, ay2 = 4, bx1 = 0, by1 = -1, bx2 = 9, by2 = 2;
		System.out.println(computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2));
	}

	public static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
		// area A

		int areaA = (ax2 - ax1) * (ay2 - ay1);

		// area B
		int areaB = (bx2 - bx1) * (by2 - by1);
		
		
		//IF  No midArea  (No overLap)
		int midArea = 0;
		
		int cx2 = Math.min(ax2, bx2), 
				cx1 = Math.max(ax1, bx1), 
				cy2 = Math.min(ay2, by2), 
				cy1 = Math.max(ay1, by1);
		
		//IF  has midArea ( Has overLap)
		if ((cx2 - cx1) > 0 && cy2 - cy1 > 0) {
			// midArea
			

			midArea = (cx2 - cx1) * (cy2 - cy1);
		}

		int total = areaA + areaB - midArea;
		return total;

	}
}
