/*704. Binary Search
Easy

6029

136

Add to List

Share
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
 

Constraints:

1 <= nums.length <= 104
-104 < nums[i], target < 104
All the integers in nums are unique.
nums is sorted in ascending order.
Accepted
1,144,393
Submissions
2,072,852
*/

/*Idea*/
package com.leetcode;

public class Leetcode_704_try2_practise {
	public static void main(String[] args) {
		int[] nums = { -1, 0, 3, 5, 9, 12 };
		int target = 9;

	}

	public static int search(int[] nums, int target) {
		int resCnts = -1;
		int start = 0, end = nums.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				resCnts = mid;
				return mid;
			} else if (nums[mid] > target) {
				end=mid-1;

			}else {
				start = start +1;
			}
		}

		return resCnts;
	}
}
