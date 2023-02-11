package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leetcode_594_try2 {
	public static void main(String[] args) {
//		int nums[] = { 2, 2, 1, 1 };	
		int nums[] = { 1, 3, 2, 2, 5, 2, 3, 7 };
		System.out.println("----");

		System.out.println(findLHS(nums));
	}

	public static int findLHS(int[] nums) {

		Arrays.sort(nums);

		int res = 0;

		if (res == 1) {
			return res;
		}
		Map<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
//			System.out.println("add i :" + i);
//			System.out.println("hm.getOrDefault(nums[i], 1) :" + hm.getOrDefault(nums[i], 1));
		}
//		for (int key : hm.keySet()) {
//			if ((hm.get(key + 1) == null || hm.get(key + 1) == 0) 
//					&& hm.get(key - 1) == null || hm.get(key - 1) == 0) {
//				hm.put(key, 0);
//			}
//		}
		
		//test 
		for (int key : hm.keySet()) {
//			System.out.println( "key:" + key);
			System.out.println( "hm.get (key) :" + hm.get(key));
		}
		
//		
//		//test 
//		System.out.println( hm.get(6) );
		
		for (int key : hm.keySet()) {
			System.out.println("key" + key );
			if ((hm.get(key + 1) == null ) 
					&& hm.get(key - 1) == null ) {
				hm.put(key, 0);
			}
		}
		
		return 0 ;

	}
}
