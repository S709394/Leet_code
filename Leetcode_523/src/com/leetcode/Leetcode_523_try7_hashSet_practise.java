// Idea 


package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_523_try7_hashSet_practise {
	public static void main(String[] args) {

		// Base case
		// int k > 0 , 2 numbers are 0 in a roll

//		int k = 13;
//
//		int[] nums = { 23, 2, 4, 6, 6,7};

//		int[] nums = { 20, 100, 300 };
//		int k = 320;
//
//		int[] nums = { 21, 30, 1000 };
//		int k = 10;
		

		int[] nums = { 23,2,4,6,6 };
		int k = 7;

		System.out.println(checkSubarraySum(nums, k));
	}

	public static boolean checkSubarraySum(int[] nums, int k) {
			Map <Integer , Integer> map = new  HashMap <> ();
			int sum = 0  , remainer = 0;
			
			
			for (int i = 0 ; i < nums.length; i++) {
				sum +=  nums[i];
				
				remainer = sum % k ;
				
				if(remainer ==0 && i>0) {
					return true;
				}
				if (map .containsKey(remainer)    && (i - map.get(remainer)) >1) {
					return true;
				}
				if(!map.containsKey(remainer)) {
					map.put(remainer, i);
				}
				
				
			}
			
			return false ;
	}
}
