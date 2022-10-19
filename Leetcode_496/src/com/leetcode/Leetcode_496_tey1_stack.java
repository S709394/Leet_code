//does not works so far 

package com.leetcode;

import java.util.Map;
import java.util.HashMap;
import java.util.Stack;
public class Leetcode_496_tey1_stack {
	public static void main(String[] args) {
		int[] nums1 = { 4, 1, 2 }, nums2 = { 1, 3, 4, 2 };
		
		System.out.println(nextGreaterElement(nums1,nums2));
	}

	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		 
		// store the nextGreater of nums1
//		int [] res = new int [nums1.length];
		
		// store the nums2 after upgrade 
		
		int [] greater = helper (nums2);
		
		//step2
		Map <Integer ,Integer>  greaterMap= new HashMap <> ();
		for (int i = 0 ;  i < nums2 .length ; i ++) {
			greaterMap.put(nums2[i], greater[i]);
		}
		
		int [] res =new int [nums1.length] ;
		for (int i = 0 ; i <nums1.length;i++) {
			res[i] =greaterMap.get(nums1[i]);
		}
		return res;
		
	}
	
	
	public static int [] helper ( int [] nums) {
		 int n = nums .length;
		 int [] res = new int[n];
		 Stack <Integer> stack  = new Stack <> ();
		 
		 for (int i = n -1 ; i >=0; i --) {
			 
//			 System.out.println("i:" + i); //test
			 
			 while (!stack.isEmpty()&& stack.peek() < nums[i]) {
				 stack.pop();   //
//				 System.out.println( stack.pop());
			 }
			 
			 //v1.0
//			 res[i] =stack.isEmpty()? -1 :stack .peek();
			 
			 
////		 //v2.0
//			 if (stack.isEmpty()) {
//				 res[i]=-1;
//			 }else {
//				 res[i]=stack.peek();
//			 }
			 
			 stack.push(nums[n]);
		 }
		 return  res;
	}
}
