package com.leetcode;

public class Leetcode_540_try4_binarySearch_parctise {
	public static void main(String[] args) {
		
	}
	public static int singleNonDuplicate(int[] nums) {
		int left = 0  , right = nums.length -1 ;
		
		while (left < right ) {
			int mid = left +  (right -left) /2 ;
			
			if (mid %2 ==1 ) {
				mid -- ;
			}
			
			
			
		}
		
	}
	
	
}
