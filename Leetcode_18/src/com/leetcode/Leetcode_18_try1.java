/*18. 4Sum
Medium

6914

795

Add to List

Share
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

 

Example 1:

Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Example 2:

Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
 

Constraints:

1 <= nums.length <= 200
-109 <= nums[i] <= 109
-109 <= target <= 109
 * */

package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_18_try1 {
	public static void main(String[] args) {

	}

	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> ll = new ArrayList<List<Integer>>();

		// the
		if (nums == null || nums.length < 4) {
			return ll;
		}
		// 1. sort
		Arrays.sort(nums);

		// 2.
		int length = nums.length;
		for (int i = 0; i < length - 3; i++) {

			// using (long) for avoid overflow

			// 2a . skip the same nums[i]
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			// 2b when the sum too big , break the loop
			if ((long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) {
				break;
			}
			// 2c nums [i] too small ,try another one

			if ((long) nums[i] + nums[length - 3] + nums[length - 2] + nums[length - 1] < target) {
				continue;
			}

			// 3 inner for loop

//			for (int j = 0; j < length - 2; j++) { //wrong 
			for (int j = i+1; j < length - 2; j++) {

				// 3a. skip the same j
				if (j > i + 1 && nums[j] == nums[j - 1]) {
					continue;
				}

				if ((long) nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) {
					break;
				}

				if ((long) nums[i] + nums[j] + nums[length - 1] + nums[length - 2] < target) {
					continue;
				}

				// 4 2 points windows way
				int left = j + 1, right = length - 1;
				while (left < right) {
					// set
					int sum = nums[i] + nums[j] + nums[left] + nums[right];

					if (sum == target) {
						// add into ListList

						ll.add(Arrays.asList(nums[i] + nums[j] + nums[left] + nums[right]));

						// skip some same left right
						while (left < right && nums[left] == nums[left + 1]) {
							left++;
						}
						left++;
						while (left < right && nums[right] == nums[right - 1]) {
							right--;
						}
						right--;

					} else if (sum < target) {
						left++;
					} else if (sum>target){
						right--;
					}

				}
			}

		}
		return ll;
	}
}
