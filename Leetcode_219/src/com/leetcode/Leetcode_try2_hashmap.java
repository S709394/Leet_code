package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_try2_hashmap {
	public static void main(String[] args) {
		int []  nums =  { 1,2,3,1}; 
		
		int k = 3 ; 
		System.out.println(containsNearbyDuplicate (nums,k));
	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		
		Map <Integer , Integer>  hashMap = new HashMap <> ();
		
		int len  = nums.length;
		
		for ( int i  =0;i <len ; i ++) {
			
			if (hashMap.containsKey(nums[i])) {
				if (i-hashMap.get(nums[i]) <=k) {
					return true;
				}
			}
			
			
			hashMap.put(nums[i],i );
		}
		return false ;
	}
}
