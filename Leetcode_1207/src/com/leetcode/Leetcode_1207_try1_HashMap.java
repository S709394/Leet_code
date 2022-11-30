package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Leetcode_1207_try1_HashMap {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 1, 1, 3 };

	}

	public boolean uniqueOccurrences(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int num : arr) {
			if (!map.containsKey(num)) {
				map.put(num, 1);
			} else {
				map.put(num, map.get(num) + 1);
			}
		}
		
		Set <Integer> set = new HashSet<>  () ;
		for ( int value: map.values()) {
			if (!set.add(value)) {
				return false ;
			}
			
		}
		
		
		
		return true ;
		
	}
}
