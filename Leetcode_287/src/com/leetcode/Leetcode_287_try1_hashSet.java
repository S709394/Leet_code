package com.leetcode;

public class Leetcode_287_try1_hashSet {
	
//	Runtime: 66 ms, faster than 8.17% of Java online submissions for Find the Duplicate Number.
//	Memory Usage: 92.7 MB, less than 12.36% of Java online submissions for Find the Duplicate Number.
	
	 public int findDuplicate(int[] nums) {
	        Set <Integer> set = new HashSet <> ();
	        
	        for ( int i  : nums) {
	            
	            if (set.contains (i)) {
	                return i;
	            }
	            
	            set .add (i);
	        }
	        
	        
	        
	        return -1 ;
	    }
}
