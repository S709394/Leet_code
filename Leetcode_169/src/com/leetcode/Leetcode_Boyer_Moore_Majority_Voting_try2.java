/*
 * 169. Majority Element
Easy

9837

342

Add to List

Share
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than than [n / 2] times times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
 

Follow-up: Could you solve the problem in linear time and in O(1) space?
 * */

/*Idea :
 * Boyer-Moore Majority Voting Algorithm
 * 
 * Runtime: 1 ms, faster than 100.00% of Java online submissions for Majority Element.
Memory Usage: 46 MB, less than 93.29% of Java online submissions for Majority Element.
 * 
 * */
package com.leetcode;

public class Leetcode_Boyer_Moore_Majority_Voting_try2 {
	public static void main(String[] args) {
		int[] nums = { 3, 2, 3 };
	}

	public int majorityElement(int[] nums) {
		int n = nums.length;

		int majority = nums[0];
		int count = 1;
		for (int i = 1; i < n; i++) {

			if (nums[i] == majority) {
				count++;
			} else if (count == 0) {
				majority = nums[i];
			} else {
				count--;
			}

		}
		return majority;
	}
}
