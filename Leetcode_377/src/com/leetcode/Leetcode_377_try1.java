package com.leetcode;

import java.util.Arrays;

public class Leetcode_377_try1 {
	
	
	public static void main(String[] args) {
		
	}
	
	static int []  dp   ;
	
	public static  int combinationSum4(int[] nums, int target) {
		
		//try1  
		
		//https://leetcode.com/problems/combination-sum-iv/solutions/85036/1ms-java-dp-solution-with-detailed-explanation/?envType=daily-question&envId=2023-09-09
		
		//store the combination  1 by 1 
		dp = new int [target +1] ;
		
		
		// default
		Arrays.fill(dp, -1);
		
		dp[0] = 1; 
		
		return helper  ( nums , target);
		
		
	}
	
	public static  int helper ( int [ ] nums , int target) {
			if ( dp [ target ]!= -1) {
				return dp[target] ;
			}
			
			int res = 0 ;
			
			for ( int i = 0 ; i < nums.length ; i ++) {
				if( target >= nums [i]) {
					res +=  helper ( nums , target - nums [i]);  
				}
			}
			
			dp [target] = res ;
			
			return res ;
	}
}
