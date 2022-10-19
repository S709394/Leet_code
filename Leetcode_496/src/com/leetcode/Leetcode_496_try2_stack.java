//time complexity  O(n)


package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Leetcode_496_try2_stack {
	public static void main(String[] args) {
		int[] nums1 = { 4, 1, 2 }, nums2 = { 1, 3, 4, 2 };
		
		System.out.println(nextGreaterElement(nums1,nums2));
	}

	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		Map <Integer , Integer>  map = new HashMap <> ();
		
		Stack <Integer> stack = new Stack <> ();
		int n = nums2.length;
		
		for (int i = n -1 ; i >=0; i --) {
			while (!stack.isEmpty() &&stack.peek()<=nums2[i])
//				
				stack.pop();
		}
		
	}
}
