package com.leetcode;

import java.util.HashSet;
import java.util.Set;


//works  but need to add steps by steps for understand 
//Idea from  : https://leetcode.cn/problems/append-k-integers-with-minimal-sum/solution/shi-ma-qing-kuang-tan-xin-shu-xue-qiu-he-nr93/

public class Leetcode_2195_try2_hashSet {
	public static void main(String[] args) {
//		int[] nums = { 1, 4, 25, 10, 25 };		
////		[5,6]
//		int k = 2;
		int[] nums = { 5, 6 };	
//		int[] nums = { 5, 6  ,7,8,9,10};	
		int k = 5;
		System.out.println(minimalKSum(nums, k));
	}

	public static long minimalKSum(int[] nums, int k) {
		
		long ans = (1L +k) * k /2 ;
		
		System.out.println("ans : " + ans ); //test 
		int nextNum = k+1 ; 
		
//		System.out.println ("nextNum :" + nextNum) ;//test 
		int cnt =0 ;
		Set <Integer> set = new HashSet <> () ;
		
		for (int num  : nums) {
			//able to add the num 
			if(set .add(num) && num<=k) {	
				System.out.println(  " num :" + num ); //test 
				ans-=num;
				cnt++;
			}
		}
		while (cnt>0) {
			while (set.contains(nextNum)) {
				nextNum++;
			}			
			ans+= nextNum ;
			System.out.println ("nextNum :" + nextNum) ;//test 
			nextNum++;
			cnt --;
		}
		return ans ;

	}
}
