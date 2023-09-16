package com.leetcode;

import java.util.Arrays;

public class Leetcode_135_try1 {
	public static void main(String[] args) {
//		int [] rating  = {1,0,2} ; 
		
		int []  rating = {    1 , 0 , 1,2,3,4,5,6} ;
		System.out.println(  candy (rating));
	}

	public  static int candy(int[] ratings) {
//		https://leetcode.com/problems/candy/description/?envType=daily-question&envId=2023-09-13
		int n = ratings.length;
		int[] candies = new int[n];
		Arrays.fill(candies, 1);

		// left to right
		for (int i = 1; i < n; i++) {
			if (ratings[i] > ratings[i - 1]) {
				candies[i] = candies[i - 1] + 1;
				System.out.println(" A candies [i ]" + candies[i]);
			}

		}
		for (int i = n - 2; i >= 0; i--) {
			if (ratings[i] > ratings[i + 1]) {
				candies[i] = Math.max(candies[i], candies[i + 1] + 1);

				System.out.println(" B candies [i]" + candies[i ]); // test

			}
		}
		
		int totalCandies = 0 ; 
		for ( int  candy : candies) {
			totalCandies += candy ;
		}
		return totalCandies ;

	}
}
