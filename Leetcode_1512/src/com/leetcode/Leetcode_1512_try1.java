package com.leetcode;

public class Leetcode_1512_try1 {
	public static void main(String[] args) {
		int  []nums = { 1, 2, 3, 1, 1, 3 };
		System.out.println( numIdenticalPairs (nums));
	}

	public static int numIdenticalPairs(int[] nums) {
		int  len = nums.length;
		
		 int left = 0 ; int right = len -1 ;
		 
		 int cnt  = 0 ;
		
		 
		 
		 for (int i = left ; i < right ; i ++) {
			 System.out.println(" i : " + i);
			 
			 for ( int  j = i+1 ;  j < right ; j ++) {
				 System.out.println("j :" + j );
				 if( nums [ i] == nums[j]) {
					 cnt ++ ;
				 }
			 }
			 
			 
			 right --;
			 
		 }
		 return cnt ;
	}
}
