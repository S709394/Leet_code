package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Leetcode_2418_try1 {
	public static void main(String[] args) {
		String[] names = { "Mary", "John", "Emma" };
		int[] heights = { 180, 165, 170 };

		System.out.println(sortPeople(names, heights));
	}

	public static String[] sortPeople(String[] names, int[] heights) {
		// try1
		// < height String >
		
		// 1. Create a HashMap that assigns each height to its own name.
		//heightToNameMap
		HashMap<Integer, String> hm = new HashMap<>();
		int len = names.length;

//		int[] addOrder = new int[len];

		String[] ans = new String[len];

		///

//		int max = 0;
		
		
		//2 . fill the hashMap
		for (int i = 0; i < len; i++) {
			hm.put(heights[i], names[i]);
//			max  = Math.max(max,heights[ i]) ;
		}
		
		//3 sort the heights in ascending order ;
		Arrays.sort(heights);

//		for (int i = len - 1; i >= 0; i--) {
		for (int i = len-1; i >= 0; i--) {
//			System.out.println (heights[i]) ;
			ans[i] = hm.get(heights[len-i-1]);
		}

		return ans;

	}

}
