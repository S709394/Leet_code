package com.leetcode;

import java.util.Arrays;

public class Leetcode_135_try1 {
	public static void main(String[] args) {
		
	}
	 public int candy(int[] ratings) {
		 int  n = ratings.length;
		 int []  candies = new int [n];
		 Arrays.fill(candies, 1); 
		 
		 
		 //left to right 
		 for ( int i =1 ; i < n ; i ++) {
			 if ( ratings [ i ]  >ratings[i-1]) {
				 candies [i ] = candies [i -1] +1 ;	 
			 }
				 
		 }
		 for  (int i = n-2 ; i >=0 ; i --) {
			 if (ratings [i+1] > ratings [i ] ) {
				 candies [i+1] = Math.max(candies [i] +1, candies[i+1]) ;
				 
				 System.out.println(  candies [i+1]  );//
			 }
		 }
	 }
}
