package com.leetcode;

import java.util.HashSet;
import java.util.Set;

//Idea from  : https://leetcode.cn/problems/append-k-integers-with-minimal-sum/solution/shi-ma-qing-kuang-tan-xin-shu-xue-qiu-he-nr93/

public class Leetcode_2195_try2_hashSet {
	public static void main(String[] args) {
//		int[] nums = { 1, 4, 25, 10, 25 };
//		
////		[5,6]
//		int k = 2;
		int[] nums = { 5, 6 };

		int k = 6;
		System.out.println(minimalKSum(nums, k));
	}

	public static long minimalKSum(int[] nums, int k) {
		
		long ans = (1L *+k) * k /2 ;
		
		int nextNum = k+1 ; 
		
		int cnt =0 ;
		Set <Integer> set = new HashSet <> () ;
		
		for (int num  : nums) {
			
			//able to add the num 
			if(set .add(num) && num<=k) {
				ans-=num;
			}
		}
		while 

	}
}
