package com.leetcode;

public class Leetcode_875_try2_binartSearch_practise {
	public static void main(String[] args) {
		int piles[] = { 3, 6, 7, 11 };
		int hours = 5;
		System.out.println(shipWithinDays(piles, hours));
	}

	public static int shipWithinDays(int[] weights, int hoursLimit) {
		//try2 
		
		int left = 0 ,right = 1000000000+1;
		
		while (left < right ) {
			int mid =  left + (right -left)/2;
			if (getTotalHours (weights ,mid)>hoursLimit) {
				left = mid +1 ;
			}else {
				right = mid ;
			}
			
//			System.out.println("left  :" + left + "right : " + right);
			
			
			
		}
		return left ;
	}

	// pileHours intS
	public static int getTotalHours(int[] weights, int eatSpeed) {
		int hours = 0;
		for (int i = 0; i < weights.length; i++) {
			hours += weights[i] / eatSpeed;

			if (weights[i] % eatSpeed != 0) {
				hours++;
			}
		}
//		System.out.println("hours"  + hours);//test 
		return hours;

	}
}
