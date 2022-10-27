
//try2   does not works 
//package com.leetcode;

public class Leetcode_523_try2_DFS {
	public static void main(String[] args) {

//		int[] nums = { 23, 2, 4, 6, 7 };

		int[] nums = { 20, 100, 300 };

		int k = 320;
		System.out.println(checkSubarraySum(nums, k));
	}

	static boolean hasSubArray = false;
	static int cnt = 0;

	public static boolean checkSubarraySum(int[] nums, int k) {

//		if (!hasSubArray) {
//			dfs(nums, 0, 0, 0, k);
////		}

		dfs(nums, 0, k);

		return hasSubArray;
	}

	public static void dfs(int[] nums, int index, int k) {

		if (hasSubArray) {
			return;
		}
		int len = nums.length;

//		if(index < len )

		int subSum = 0;
		int cntA = 0;

		for (int i = index; i < len; i++) {
			System.out.println("i : " + i);

			cnt++; // test
			System.out.println("cnt : " + cnt);

			subSum += nums[i];
			System.out.println("subSum : " + subSum);

			cntA++;
			if (cntA >= 2 && subSum % k == 0) {
//				 System.out.println("***");
				hasSubArray = true;
			}
			if (index < len - 1) {
				System.out.println("index:" + (index));
				dfs(nums, index + 1, k);
			}

		}

	}
}
