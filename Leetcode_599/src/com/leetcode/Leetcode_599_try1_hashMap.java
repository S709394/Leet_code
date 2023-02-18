package com.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Leetcode_599_try1_hashMap {
	public static void main(String[] args) {

	}

	public static String[] findRestaurant(String[] list1, String[] list2) {
		// StringToIndex
		Map<String, Integer> map = new HashMap<>();
		// Store the res
		List<String> res = new LinkedList<>();

		// the Min sum of the String

		int minSum = Integer.MAX_VALUE;

		for (int i = 0; i < list1.length; i++) {
			map.put(list1[i], i);

		}
		for (int i = 0; i < list2.length; i++) {

			// make sure this string exist
			Integer j = map.get(list2[i]);

			if (j != null && i + j < minSum) {
//				
				// remove them all
				res.clear();
				minSum = i + j;
			}
		}
		return res.toArray(new String[res.size()]);

	}
}
