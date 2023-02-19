package com.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Leetcode_599_try2_hashMap_practise {
	public static void main(String[] args) {

	}

	public static String[] findRestaurant(String[] list1, String[] list2) {
		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < list1.length; i++) {
			map.put(list1[i], i);

		}

		int minSum = Integer.MAX_VALUE;

		List<String> list = new LinkedList<>();

		for (int i = 0; i < list2.length; i++) {
			Integer j = map.get(list2[i]);
			// to be continue
//			int curSum = i + j;  // does not work 
//			list.add(list2[i]);
			if (j != null && i + j <= minSum) {
				if (i + j < minSum) {
					minSum = i + j;
					list.clear();
				}
				
				//if minSum
				list.add(list2[i]);

			}
//		
		}
		return list.toArray(new String[list.size()]);
	}
}
