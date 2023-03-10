package com.leetcode;

public class Leetcode_875_try4_practise_binarySearch {
//	/ practise try4
	public static void main(String[] args) {
		int piles[] = { 3, 6, 7, 11 };
		int hours = 5;
		System.out.println(minEatingSpeed(piles, hours));

		// int minEatingSpeed

	}

	public static int minEatingSpeed(int[] piles, int hoursLimit) {
		int left = 1, right = 1000000000 + 1;
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (getTotalHours(piles, mid) > hoursLimit) {
				 left =mid + 1;
			} else {
				right= mid;
			}
		}
		return left ;

	}

	public static int getTotalHours(int[] piles, int speed) {
		int hours = 0;

		for (int i = 0; i < piles.length; i++) {
			hours += piles[i] / speed;
			if (piles[i] % speed != 0) {
				hours++;
			}
			;

		}
		return hours;
	}
}
