package com.leetcode;

import java.util.Arrays;

public class Leetcode_377_try2_practise {

	public static void main(String[] args) {

	}

	static  int  [] dp ;
	public static int combinationSum4(int[] nums, int target) {
		
		//try2 
		 dp =  new int [ target+1] ;
		 Arrays.fill(dp, -1); 
		 dp [0] =1 ;
		 
		 return helper (nums , target) ;
	}
	public static int helper  ( int  [] nums , int target ) {
		 
		if( dp [target]!= -1) {
			return dp [ target] ;
		}
		 
		
		 int res = 0 ;
		 
		 for ( int i = 0 ; i < nums.length ; i ++) {
			 if ( nums [ i]<= target  ) {
				 res += helper  (nums , target - nums [i]) ;
				 System.out.println( "res"); //test 
			 }
		 }
		 
		 dp [target] = res ;
		 
		 return  res ;
		 
	}
}
