package com.leetcode;

import java.util.Arrays;

//Idea : from here    
//https://leetcode.cn/problems/append-k-integers-with-minimal-sum/solution/shi-ma-qing-kuang-tan-xin-shu-xue-qiu-he-nr93/
public class Leetcode2195_try1 {
	public static void main(String[] args) {
//		int[] nums = { 1, 4, 25, 10, 25 };
//		
////		[5,6]
//		int k = 2;
		int[] nums = { 5,6 };
		
		int k = 6;
		System.out.println( minimalKSum (nums,k));
	}

	public static long minimalKSum(int[] nums, int k) {
		Arrays.sort (nums);
		
//		int min = nums[0];
		
//		int maxIdx = 10001;
//		for (int i = k-1 ; i< k ; i ++ ) {
//			if (nums[i]  <k) {
//				maxIdx =  i;
//			}
//		}
		long kSum = 0 ;
		int start =1 ;
//		int regK = k;
		int maxInNums= 1;
		for (int i = 0 ;  k>0 && i< Math.min(nums.length-1 ,k); i ++) {
			if(nums[i]!=start) {
				System.out.println(nums[i]);
				System.out.println("start:" + start);
				kSum+= start;
				
				k--;
				maxInNums=nums[i];
			}else {
				
			}
			start++;
			
		}
		System.out.println("kSum:"+kSum);
		while(k>0) {
			System.out.println("max:" +maxInNums);
			kSum += ++maxInNums ;
			k--;
		}
		return  kSum;
		
		
	}
}
