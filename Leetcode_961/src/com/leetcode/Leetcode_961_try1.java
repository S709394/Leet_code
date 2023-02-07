package com.leetcode;

import java.util.Arrays;

//works well

//Runtime
//6 ms
//Beats
//54.70%
//Memory
//43.1 MB
//Beats
//52.67%
public class Leetcode_961_try1 {

	public static void main(String[] args) {
		int[] nums = { 9, 5, 3, 3 };
		System.out.println(repeatedNTimes(nums));
	}

	public static int repeatedNTimes(int[] nums) {
		int len = nums.length;
//		System.out.println( "len : "+len);
		Arrays.sort(nums);
		
		//test code
//		for (int  num   : nums) {
//			System.out.println(num );
//		}
//		System.out.println("nums [0] : " + nums[0]);

//		System.out.println( "len /2 " +  (len /2));
		if(nums [len /2 ] >nums[0]&& nums [len -1] ==nums [len /2 ]) {
//			System.out.println("bbb");
//			System.out.println( nums [2]);
			return nums[len / 2];
		}else  {
//			System.out.println("aaa");
			return nums [len /2-1  ] ;
		}

		
//		///Not good
//		if (len % 2 != 1) {
//			 System.out.println("Even");
//			
//			if (nums[len / 2] > nums[0]) {
//				 System.out.println("bbb");
//				return nums[len / 2 -1];
//			}
//			
//			
//			if (nums[len / 2-1] < nums[len - 1]) {
//				 System.out.println("aaa");
//				return nums[len / 2 ];
//			}
//
//		} 
//		
//		
//		///Not good
//		if(nums [len /2 ] >nums[0]) {
//			return nums[len / 2];
//		}else  {
//			return nums [len /2 -1 ] ;
//		}
////		if(nums [len /2 -1]  <nums[len -1]) { 
////			return nums [len /2];
////		}
//		

	}
}
