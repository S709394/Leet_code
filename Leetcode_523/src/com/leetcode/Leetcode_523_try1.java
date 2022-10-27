
//try 1 , does not works 

package com.leetcode;

public class Leetcode_523_try1 {
	public static void main(String[] args) {

//		int[] nums = { 23, 2, 4, 6, 7 };

		int[] nums = { 20, 100, 300 };

		int k = 13;
		System.out.println(checkSubarraySum(nums, k));
	}

	static boolean hasSubArray = false;
	static int cntA = 0;

	public static boolean checkSubarraySum(int[] nums, int k) {

////		if (!hasSubArray) {
//			dfs(nums, 0, 0, 0, k);
////		}
		dfs(nums, 0, 0, 0, k);

		return hasSubArray;

	}

	public static void dfs(int[] nums, int index, int cnt, int sum, int k) {
		if (hasSubArray) {
			return;
		}

		int len = nums.length;

//		System.out.println();

		if (index < len) {
			
			int subSum = 0 ;
			for (int i = index; i < len; i++) {

				cntA++; // test
				System.out.println("cntA : " + cntA);

				 subSum =  nums[i];
				 System.out.println(" nums[i]" + ( nums[i]));
				if (cnt != 0 && (subSum+nums[i]) % k == 0) {

					System.out.println("call this if (sum:)" + sum + " " + nums[i]); // test
					hasSubArray = true;
				}

//			test
				System.out.println("subSum + nums[i+1]" + (subSum + nums[i]));
				System.out.println("cnt : " + cnt);
				cnt++;
				if( i < len-1) {
				
				}

			}
			dfs(nums, index + 1, cnt, subSum, k);
		}

	}
}
