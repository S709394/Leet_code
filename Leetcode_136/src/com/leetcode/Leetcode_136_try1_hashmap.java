// Runtime: 34 ms, faster than 12.02% of Java online submissions for Single Number.
//Memory Usage: 53.6 MB, less than 22.84% of Java online submissions for Single Number.
//

package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_136_try1_hashmap {
	public static void main(String[] args) {
		int[] nums = { 2, 2, 1 };

		System.out.println(singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {
		int len = nums.length;
		if (len == 1)
			return nums[0];

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i : nums) {
			// v2.0
			map.put(i, map.getOrDefault(i, 0) + 1);

//			//v1.0
//			if(map.containsKey(i)) {
//				if(map.get(i)>1){
//					continue;
//				}else {
//					map.put(i, map.get(i)+1);
//				}
//				
//			}else{
//				map.put(i, 1);
//			}
		}
		
//		//test 
//		for (int i : map.keySet()) {
//            System.out.println( "i:" +i);
//            System.out.println("val"  +  map.get(i));
//        }

		for (int i : map.keySet()) {
			if (map.get(i) == 1) {
				return i;
			}
		}

		return -1;

	}
}
