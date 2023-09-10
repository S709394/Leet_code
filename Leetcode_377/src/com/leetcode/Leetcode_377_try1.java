package com.leetcode;

import java.util.Arrays;

public class Leetcode_377_try1 {
	
	
	public static void main(String[] args) {
		
	}
	
	static int []  dp   ;
	
	public static  int combinationSum4(int[] nums, int target) {
		dp = new int [target +1] ;
		
		Arrays.fill(dp, -1);
		
		dp[0] = 1; 
		
		return helper  ( nums , target);
		
		
	}
	
	public static helper ( int [ ] nums , int target) {
			if ( dp [ target ]!= -1) {
				return dp[target] ;
			}
			
	}
}
