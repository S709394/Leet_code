package com.leetcode;

import java.util.Stack;

public class Leetcode_905_try1 {
	public static void main(String[] args) {
		int[] nums = { 3, 1, 2, 4 };
		System.out.println(sortArrayByParity(nums));
	}

	public static int[] sortArrayByParity(int[] nums) {
		//try1 
		Stack<Integer> stack = new Stack<>();
		int numLen = nums.length;
		int idx = 0;

		int[] res = new int[numLen];

		for (int num : nums) {
			if (num % 2 == 1) {
				stack.add(num);
			} else {
				res[idx++] = num;

			}

		}
		// stack.isEmpty() ==false
		while (idx < numLen) {

			res[idx++] = stack.pop();
		}
		return res;
	}
}
