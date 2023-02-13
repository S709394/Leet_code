package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leetcode_594_try3_hashMap_practise {
	public static void main(String[] args) {
//		int nums[] = { 2, 2, 1, 1 };	
		int nums[] = { 1, 3, 2, 2, 5, 2, 3, 7 };
		System.out.println("----");

		System.out.println(findLHS(nums));
	}

	public static int findLHS(int[] nums) {
		
		//try 3 _hashMap
		
		Arrays.sort(nums);
		//
		int res = 0 ;
		//  Num  and the cnt
		Map <Integer , Integer>  hm = new HashMap <> ();
		
		
		//Store the num  and their counts in the hashMap
		for (int num : nums) {
			hm .put(   num   , hm.getOrDefault(num, 0)+1  );		
		}
		
		//check  the num +1  and num -1   shows 0 time or not 
		for (int num : hm.keySet() ) {
			if(!hm.containsKey(num+1) || hm.get(num+1)==0) {
				if(!hm.containsKey(num-1) || hm.get(num-1)==0) {
					hm.put(num, 0); // try another one ?
					
//					hm.remove(num); // not good
					
				}
				
			}
			
		}
		
		// A.  if the  num +1  exist   , curRes is the   sum of the cnts  of  'num'  and 'num +1'
		
		//B. Find the Max of the curRes ;
		
		for (int num : hm.keySet() ) {	
			int curRes = 0 ; 
			if (hm.containsKey(num+1)) {
				curRes = hm.get(num) + hm.get(num+1);
			}
			
			
			res = Math.max(curRes, res);
		}
		
		return res ;
		
		
	}
}
