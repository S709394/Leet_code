package com.leetcode;

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
		// Sum  the k nums
	}
}
