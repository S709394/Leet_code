package com.leetcode;

public class Leetcode_875_try1_binarySearch {
	public static void main(String[] args) {
		int piles[] = { 3, 6, 7, 11 };
		int hours = 5;
		System.out.println(pileHours(piles, hours));
	}

	public static  int minEatingSpeed(int[] piles, int h) {
		
		//try1  works well
		int left = 1, right = 1000000000 + 1;
		while (left < right) {
			int mid = left +( right -left) / 2;
			if (pileHours(piles, mid) > h) {
				left =mid +1;

			}else {
				right = mid;
			}
		}
		return left ;
	}

	public static  int pileHours(int [] piles, int speed) {
		int hours = 0;
		for (int i = 0; i < piles.length; i++) {
//			 hours = 0;

			hours += piles[i] / speed;
			/// 10 /3 then hours ++ hours = 4
			if (piles[i] % speed > 0) {
				hours++;
			}
//			System.out.println(" hours:" + hours);
		}

		return hours; 
	}
}
