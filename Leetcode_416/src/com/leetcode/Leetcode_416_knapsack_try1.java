/*416. Partition Equal Subset Sum
Medium

8619

138

Add to List

Share
Given a non-empty array nums containing only positive integers, find if the array can be partitioned into two subsets such that the sum of elements in both subsets is equal.

 

Example 1:

Input: nums = [1,5,11,5]
Output: true
Explanation: The array can be partitioned as [1, 5, 5] and [11].
Example 2:

Input: nums = [1,2,3,5]
Output: false
Explanation: The array cannot be partitioned into equal sum subsets.
 

Constraints:

1 <= nums.length <= 200
1 <= nums[i] <= 100*/

/*Idea  : 
 * https://leetcode.cn/problems/partition-equal-subset-sum/solution/fen-ge-deng-he-zi-ji-by-leetcode-solution/
 * 
 * Need a little bit practice later 
 * 
 * 
 * 
 * Runtime: 46 ms, faster than 73.07% of Java online submissions for Partition Equal Subset Sum.
Memory Usage: 43 MB, less than 83.14% of Java online submissions for Partition Equal Subset Sum.
 * */
package com.leetcode;

public class Leetcode_416_knapsack_try1 {
	public static void main(String[] args) {
//		int nums [] =  {1,5,11,5};
		int nums[] = { 3 };
		System.out.println(canPartition(nums));
	}

	public static boolean canPartition(int[] nums) {

		// 1a.  length <2  return false
		int len = nums.length;
		if (len < 2) {
			return false;
		}
		
		int sum = 0, maxNum = 0;
		for (int num : nums) {
			sum += num;
			maxNum = Math.max(maxNum, num);
		}
		//1c .sum is odd     return false
		if (sum % 2 == 1) {
			return false;
		}
		// 1b .  maxNum >   Sum /2   return false 
		int target = sum / 2;

		// for example {11,5} 11 > ((11+5) /2)
		if (maxNum > target) {
			return false;
		}

		// 2
		boolean[][] dp = new boolean[len][target + 1];

		// init
		
		//3a.   
		for (int i = 0; i < len; i++) {
			dp[i][0] = true;
		}
		dp[0][nums[0]] = true;

		for (int i = 1; i < len; i++) {
			int num = nums[i];
			// j is the target    
			for (int j = 1; j <= target; j++) {
				if (j >= num) {
					//    Do not use the current num   ||       USE the current num
					dp[i][j] = dp[i - 1][j] || dp[i - 1][j - num];
				} else {
					
					//  When  j < num   , we can not use the current num
					dp[i][j] = dp[i - 1][j];
				}
			}
		}

		return dp[len - 1][target];

	}
}
