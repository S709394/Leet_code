package com.leetcode;
//

import java.util.Arrays;

import java.util.HashMap;
import java.util.Map;

//going to write the detail in try3 
public class Leetcode_594_try1 {
	//does not works so far 
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
		int min = nums[0], max = nums[nums.length - 1];

//		System.out.println( min + " /" + max); //test 

		Map<Integer, Integer> hm = new HashMap<>();
		// add a elem before and after
		hm.put(min - 1, 0);
		hm.put(max + 1, 0);

		for (int i = 0; i < nums.length; i++) {
			hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
//			System.out.println("add i :" + i);
//			System.out.println("hm.getOrDefault(nums[i], 1) :" + hm.getOrDefault(nums[i], 1));
		}

//		//test 
//		for (int i = min ; i <=max +1 ; i ++) {
//			System.out.println( "get i : "+hm.get(i)  + " i :" + i );
//		}

//		///1st
//		for (int i = min; i <= max; i++) {
////			if (hm.getOrDefault(i, 0)==0) {
////				continue;
////			}
//			if (hm.get(i)==null) {
//				hm.put(i, 0);
//			}
//			
////			if (hm.get(i - 1, 0) == null && hm.getOrDefault(i + 1, 0) == 0) {
//			if (hm.getOrDefault(i - 1, 0) == 0 && hm.getOrDefault(i + 1, 0) == 0) {
//				hm.put(i, 0);
////				System.out.println("remove i : " + i);
//			}
//		}

		// 2nd
		for (int key : hm.keySet()) {
//		if (hm.getOrDefault(i, 0)==0) {
//			continue;
//		}
//			if (hm.get(key) == null) {
//				hm.put(key, 0);
//			}

//		if (hm.get(i - 1, 0) == null && hm.getOrDefault(i + 1, 0) == 0) {
			if(    hm.get(key ) ==null || hm.getOrDefault(key, 0) == 0)  && 
			
			if (hm.getOrDefault(key, 0) == 0 && hm.getOrDefault(key, 0) == 0) {
				hm.put(key, 0);
			System.out.println("remove key : " +key);
			}
		}
		
		//BBB 
//		if (hm.getOrDefault(key, 0) == 0 && hm.getOrDefault(key, 0) == 0) {
//			hm.put(key, 0);
//		System.out.println("remove key : " +key);
//		}

//		int res = 0;

//		test 
		System.out.println("test ");
		for (int i = min; i <= max + 1; i++) {
			System.out.println("get i : " + hm.get(i) + " i :" + i);
		}
		for (int i = min; i <= max; i++) {
			int curRes = 0;
			System.out.println(" i:" + i);
//			System.out.println(" i in 3rd :" + i); // test

//			
//			if (hm.getOrDefault(i - 1, 0) != 0 && hm.getOrDefault(i + 1, 0) != 0) {
//				curRes = 0;
//			} else {
			curRes = hm.get(i) + hm.get(i + 1);
//				System.out.println(" hm.get(i):" + hm.get(i));

//			}

			System.out.println("curRes:" + curRes);

			res = Math.max(res, curRes);
		}
		return res;
//		
//		
//		// try1 hashMap not good 
//		// numAndCnt
//		Map<Integer, Integer> hm = new HashMap<>();
//		for (int i : nums) {
//			hm.put(i, hm.getOrDefault(hm, 0) + 1);
//		}
	}
}
