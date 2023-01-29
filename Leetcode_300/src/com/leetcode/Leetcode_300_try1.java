package com.leetcode;


//does  not works at all 
public class Leetcode_300_try1 {
//	1 <= nums.length <= 2500
//			-104 <= nums[i] <= 104
	
	public int lengthOfLIS(int[] nums) {
        int curMin = -10001 ;
        int cnt = 0 ;
        
        int maxCnt =0 ;
        
        curMin = nums[0] ;
        for (int i = 1 ; i < nums.length  ; i ++) {
        	
        	if( curMin < nums[i]) {
        		cnt ++ ;
        		
        		curMin = nums[i] ;
        	}else {
        		cnt = 0 ;
        	}
        	
        	if (maxCnt < cnt ) {
        		maxCnt = cnt ;
        	}
        	
        	//
        }
        
        
        return maxCnt ;
    }
}
