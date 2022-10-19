//time complexity  O(n)

//Runtime: 6 ms, faster than 69.27% of Java online submissions for Next Greater Element I.
//Memory Usage: 45.1 MB, less than 6.99% of Java online submissions for Next Greater Element I.


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
		
//		for (int i = n -1 ; i >=0; i --) {
		for (int i = 0  ; i < n ; i ++) {
			while (!stack.isEmpty() &&stack.peek()<nums2[i]) {
//				
				
				map.put(stack.pop(),nums2[i]);
				}
			stack.push(nums2[i]);
		}
		
		//test 
		
		System.out.println(stack.size());
		
		for (int i = 0 ; i < nums1.length;i++) {
			nums1[i] = map.getOrDefault(nums1[i], -1);
		}
		
		return nums1;
		
		
	}
}
