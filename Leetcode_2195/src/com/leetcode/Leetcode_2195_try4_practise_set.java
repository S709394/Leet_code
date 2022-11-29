package com.leetcode;

import java.util.HashSet;
import java.util.Set;
//
//Runtime
//75 ms
//Beats
//41.72%
//Memory
//95.6 MB
//Beats
//26.30%
public class Leetcode_2195_try4_practise_set {
	public static void main(String[] args) {

		// Steps:

		// nums = { 5, 6 }; k =5
		//
		// fullArray : {1,2,3,4,5,6, 7}

		// sum the from (1 ~k) using the fomula

		// using set to minus the num in nums one by one
		// cnt for count how many num has been minus
		// Last , need to add cnt

		int[] nums = { 5, 6 };
		int k = 5;

//		int[] nums = { 1, 4, 25, 10, 25 };		
////	[5,6]
//	int k = 2;
		System.out.println(minimalKSum(nums, k));
	}

	public static long minimalKSum(int[] nums, int k) {
		Set <Integer> set = new HashSet <> () ;
		
		long res = (1L + k) * k /2 ;
		int nextNum = k+1;
		int cnt  = 0 ; 
		
		for (int num : nums) {
			if (set.add(num) && k>=num) {
				res-= num;
				cnt ++;
			}
		}
		
		while (cnt >0) {
			if (set.contains(nextNum)) {
				nextNum++;
			}
			res+= nextNum;
			nextNum ++;
			
			cnt--;
		}
		return res ;
	}
}
