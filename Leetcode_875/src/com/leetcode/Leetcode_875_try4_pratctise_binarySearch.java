package com.leetcode;
//try4
public class Leetcode_875_try4_pratctise_binarySearch {
	
	
	public static void main(String[] args) {
		int piles[] = { 3, 6, 7, 11 };
		int hours = 5;
		System.out.println(minEatingSpeed(piles, hours));

		// int minEatingSpeed

	}

	// minEatingSpeed

	public static int minEatingSpeed(int[] piles, int maxHours) {
		//Try4 binarySearch 
		int left = 1;
		int right = 1000000000 + 1;

		while (left < right) {

			int mid = left + (right - left) / 2;

			if (getTotalHours(piles, mid) > maxHours) {
				left = mid + 1;
			} else {
				right  =mid;
			}

		}
		return left ;
	}

	// getTotalHours , 
	//speed :eat x banana /perHour

	public static int getTotalHours(int[] piles, int speed) {
		int hours = 0;
		for (int pile : piles) {

			hours += pile / speed;

			if (pile % speed != 0) {
				hours++;
			}
		}

		return hours;

	}
}
