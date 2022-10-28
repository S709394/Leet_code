//Idea   stone     <sum% k  , index >  in hashMap 
//    make sure  index a  - index b  >= 2 ;
//https://leetcode.com/problems/continuous-subarray-sum/discuss/1405425/A-Java-implementation-of-prefix-sum-that-may-be-easier-to-understand


//Runtime: 82 ms, faster than 8.70% of Java online submissions for Continuous Subarray Sum.
//Memory Usage: 112.3 MB, less than 37.39% of Java online submissions for Continuous Subarray Sum
package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_523_try6_hashMap {
	public static void main(String[] args) {

		// Base case
		// int k > 0 , 2 numbers are 0 in a roll

//		int k = 13;
//
//		int[] nums = { 23, 2, 4, 6, 6,7};

//		int[] nums = { 20, 100, 300 };
//		int k = 320;
//
//		int[] nums = { 21, 30, 1000 };
//		int k = 10;
		

		int[] nums = { 23,2,4,6,6 };
		int k = 7;

		System.out.println(checkSubarraySum(nums, k));
	}

	public static boolean checkSubarraySum(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();

		int remainer = 0;
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			
			sum += nums[i];

			remainer = sum % k;
			// case A:     
			if (remainer == 0 && i > 0)
				return true;

			

			if (map.containsKey(remainer) && (i - map.get(remainer) > 1)) {
				return true;
			}

			if (!map.containsKey(remainer)) {
				map.put(remainer, i);
			}

		}
		return false ;
	}

}
