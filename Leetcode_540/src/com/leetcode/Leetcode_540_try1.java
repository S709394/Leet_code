package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_540_try1 {
	
	
	public static void main(String[] args) {
		int[] nums = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
	}

	
	// time complexity : O(n)
	// This is because the code iterates through each element of the array exactly once
	
	
//	space complexity :O(n), 
//	where n is the length of the input array nums. 
//	This is because the code creates a HashSet to store the unique elements of the input array. 
	
	//Should use binary search in try 2
	
	public static int singleNonDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (int num : nums) {
			if (set.contains(num)) {
				set.remove(num) ;
			}else {
				set.add(num) ;
			}
			
		}
		// set only have 1 element in it 
		int res =set.iterator().next();
		
		return res ;
	}
}
