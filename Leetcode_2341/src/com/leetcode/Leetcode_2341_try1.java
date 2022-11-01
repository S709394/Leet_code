package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_2341_try1 {
	public static void main(String[] args) {
		
		int [] nums = {1,2,3,4,5} ;
		System.out.println(  numberOfPairs (nums));
	}

	public static int[] numberOfPairs(int[] nums) {

		Set<Integer> set = new HashSet<>();
		int len = nums.length;
		
//		set.add(22);
//		set.add(1);
//		set.add(2233);
//		
//		set.add(4444);
		
		int pairCnt = 0 ;
		
		for (int i = 0 ; i < len  ; i ++ ) {
			if (!set.contains(nums[i])) {
				set.add(nums[i]);
			}else {
				set.remove(nums[i]);
				
				pairCnt ++ ;
			}
		}
		

//		for (int i : set) {
////			System.out.println(i);
//			
//		}

		int  [] res = new int [2] ;
//		return  new int[set.size()] ( set.toArray());
		res [0] = pairCnt; 
		
		res[1] = set.size();
//		return new int[2] {pairCnt,set.size()};
		
		return res ;
	}
}
