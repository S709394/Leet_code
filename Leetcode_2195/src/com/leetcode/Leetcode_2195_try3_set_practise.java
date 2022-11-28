package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_2195_try3_set_practise {
	public static void main(String[] args) {
//		int[] nums = { 1, 4, 25, 10, 25 };		
////		[5,6]
//		int k = 2;
		
		
		// Step1  
		
		// nums  = { 5, 6 };
		// 
		// fullArray :   {1,2,3,4,5,6, 7}
		
		//
		
		
		int[] nums = { 5, 6 };
		int k = 5;
		System.out.println(minimalKSum(nums, k));
	}

	public static long minimalKSum(int[] nums, int k) {
		long res = (1L + k) * k / 2;

		int nextNum = k + 1;

		Set<Integer> set = new HashSet<Integer>();

		int cnt = 0;
		for (int num : nums) {
			if (set.add(num) && num <= k) {
				res -= num;
				cnt++;
			}
		}

		while (cnt > 0) {
			while (set.contains(nextNum)) {
				nextNum++;
			}

			res += nextNum;

			nextNum++;

			cnt--;
		}
		return res;
	}

}
