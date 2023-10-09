package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_1218_try3_practise {
	public int longestSubsequence(int[] arr, int difference) { 
		//try3 
		int len = arr.length;
		if( arr == null || arr .length == 0) return 0 ;
		Map<Integer, Integer> map = new HashMap<>();
		
		map .put(arr [0], 1) ;
		
		int max =1 ; 
		
		for ( int i = 01 ;  i < len ; i ++) {
			
			int prev =   map.getOrDefault( arr[i] -difference , 0) ;
			
			map.put(arr[i], prev+1) ;
			max = Math.max(max, prev+1) ;
			
			
		}
		return max ;
	}
}
