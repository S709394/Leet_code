//Runtime: 77 ms, faster than 9.61% of Java online submissions for Next Greater Element II.
//Memory Usage: 61.3 MB, less than 5.28% of Java online submissions for Next Greater Element II.

package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Leetcode_503_try1_2TimeForLoop {
	public static void main(String[] args) {
//		int[] nums = { 4, 1, 2 };
		int[]  nums= { 100,1,11,1,120,111,123,1,-1,-100};

		System.out.println(nextGreaterElements(nums));
	}

	public static int[] nextGreaterElements(int[] nums) {
		int[] greater = helper(nums);

		int[] result = new int[nums.length];
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			map.put(i, greater[i]);
		}

		for (int i = 0; i < nums.length; i++) {
			result[i] = map.get(i);
		}
		return result;

	}

	public static int[] helper(int[] nums) {
		int n = nums.length;

		int[] res = new int[n];

		Arrays.fill(res, Integer.MIN_VALUE);

		Stack<Integer> stack = new Stack<>();

		for (int i = n * 2 - 1; i >= 0; i--) {
			while (!stack.isEmpty() && stack.peek() <= nums[i % n]) {
				stack.pop();  
				
//				System.out.println("pop:" + stack.pop());
			}

// 			if (res[i % n] == -1) {

// 				if (!stack.isEmpty()) {

// 					res[i % n] = stack.peek();
// 				}

				// 0.1
				if (stack.isEmpty()) {
					res[i % n] = -1;
				} else {
					res[i % n] = stack.peek();
				}

			// }
			stack.push(nums[i % n]);
			
//			System.out.println("stack size :"+ stack.size());

		}
		return res;

	}
}
