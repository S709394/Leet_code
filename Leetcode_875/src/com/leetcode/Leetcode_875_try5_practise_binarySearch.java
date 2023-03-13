package com.leetcode;

public class Leetcode_875_try5_practise_binarySearch {

	public static void main(String[] args) {
		int piles[] = { 3, 6, 7, 11 };
		int hours = 5;
		System.out.println(minEatingSpeed(piles, hours));

		// int minEatingSpeed

	}

	// minEatingSpeed

	public static int minEatingSpeed(int[] piles, int maxHours) {

		/// (pile + mid -1)/mid

		int left = 1;
		int right = 100000000 + 1;

		while (left < right) {

			int mid = left + (right - left) / 2;

			if (getTotalHours(piles, mid) > maxHours) {
				left = mid + 1;
			} else {
				right = mid;
			}

		}
		return left ;
	}

	public static int getTotalHours(int[] piles, int eatingSpeed) {

		int hours = 0;
		for (int pile : piles) {
			hours += (pile - 1 + eatingSpeed) / eatingSpeed;

		}

		return hours;

	}
}
