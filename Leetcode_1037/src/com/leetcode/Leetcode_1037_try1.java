package com.leetcode;

public class Leetcode_1037_try1 {
	public static void main(String[] args) {
//		int[][] points = { { 1, 1 }, { 2, 2 }, { 3, 3 } };
		int[][] points = { { 0, 0 }, { 1, 2 }, { 0, 1 } };
		
		System.out.println( isBoomerang( points));
	}

	public  static boolean isBoomerang(int[][] points) {
//		try1
//		int boomerangAngo = ( points [0] [0] /points [0] [1]);
//		int len = points.length;  // 3
//		
//		for (int i = 1 ; i < len ; i ++) {
//			if (points [i][0]/points[i][1]!= boomerangAngo){
//				return false ;
//			};
//		}
//		return true;
		int x = points[0][0], y = points[0][1];
		for (int i = 1; i < 3; i++) {

			points[i][0] -= x;
			points[i][1] -= y;
			
		}
		
		// deal with the 0 as divider
		if (points[1][1] == 0) {
			System.out.println("aaa");
			return points [2] [1] !=0;
			
		}
		int res = points [1][0] /points[1][1];
		System.out.println("res:"  + res);
System.out.println(points [2][0] / points [2][1]);
		return  points [2][0] / points [2][1] !=0||points [2][0] / points [2][1] !=res;
//		return 

	}
}
