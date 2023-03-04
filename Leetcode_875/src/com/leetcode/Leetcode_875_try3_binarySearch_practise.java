package com.leetcode;

public class Leetcode_875_try3_binarySearch_practise {
	public static void main(String[] args) {
		int piles[] = { 3, 6, 7, 11 };
		int hours = 5;
		System.out.println(shipWithinDays(piles, hours));

		// int shipWithinDays

	}

	public static int shipWithinDays(int[] piles, int hoursLimit) {
		int left = 0;
		int right = 1000000000 + 1;

		while (left < right) {
			int mid = left + (right - left) / 2;

			if (getTotalHours(piles, mid) > hoursLimit) {
				left = mid + 1;
			} else {
				right = mid;
			}

		}
		return left;
	}

	// int getTotalHours
	public static int getTotalHours(int[] piles, int pilePerHour) {
		int hours = 0;
		for (int pile : piles) {
			hours += pile / pilePerHour;
			if (pile % pilePerHour != 0) {
				hours++;
			}

		}
		return hours;

	}

}
