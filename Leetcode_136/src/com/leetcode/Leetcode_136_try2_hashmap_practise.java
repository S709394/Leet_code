//Runtime: 25 ms, faster than 18.97% of Java online submissions for Single Number.
//Memory Usage: 54.4 MB, less than 10.23% of Java online submissions for Single Number.
package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_136_try2_hashmap_practise {
	public static void main(String[] args) {
		int[] nums = { 2, 2, 1 };

		System.out.println(singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {
		int len = nums.length;
		if (len == 1) {
			return nums[0];
		}

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i : nums) {
			// v3.0 add this line slower
			// Runtime: 35 ms, faster than 11.59% of Java online submissions for Single
			// Number.
			// Memory Usage: 54.9 MB, less than 5.43% of Java online submissions for Single
			// Number.
			//
			if (map.get(i) == null || map.get(i) < 2) {

				// v2.0
				map.put(i, map.getOrDefault(i, 0) + 1);
			}
		}

		for (int k : map.keySet()) {
			if (map.get(k) == 1) {
				return k;
			}
		}

		return -1;
	}
}
