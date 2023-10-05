package com.leetcode;

public class Leetcode_1512_try1 {
	public static void main(String[] args) {
		int  []nums = { 1, 2, 3, 1, 1, 3 };
	}

	public static int numIdenticalPairs(int[] nums) {
		int  len = nums.length;
		
		 int left = 0 ; int right = len -1 ;
		 
		 int cnt  = 0 ;
		  while (left < right ) {
			  if (nums [ left ] == nums [right]) {
				  cnt ++ ; 
			  }
		  }
		 
		 
//		 for (int i = 0 ; i < right ; i ++) {
//			 
//		 }
	}
}
