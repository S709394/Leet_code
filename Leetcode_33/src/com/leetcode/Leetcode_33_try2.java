
/*
 * 33. Search in Rotated Sorted Array
Medium

15298

957

Add to List

Share
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1
 

Constraints:

1 <= nums.length <= 5000
-104 <= nums[i] <= 104
All values of nums are unique.
nums is an ascending array that is possibly rotated.
-104 <= target <= 104
 * */


/*Idea   :
 * Use  binary search to find the MIN int in the array
 * 
 * 
 * 
 * */

package com.leetcode;

public class Leetcode_33_try2 {
	
	public static void main(String[] args) {
		int [] nums = {4,5,6,7,0,1,2};

//		int [] nums = {1};
		int target = 0;
		
//		int [] nums = {4,5,6,7,0,1,2};
//		int target = 3;
//		
		int res = search (nums,target);
		
		System.out.println(res);
	}
	
	  public static int search(int[] nums, int target) {
		  if (nums== null || nums.length==0) {
			  return -1;
		  }
		  
		  int left = 0 ; int right = nums.length-1;
		  
		  while (left<right) {
			  int midPoint = left +  (right -left)/2;
			  
			  if (nums[midPoint]>nums[right]) {
				  left =midPoint+1;
			  }else {
				  right = midPoint;
			  }
			  
		  }
		  
		  int start = left ; 
		  left = 0 ; 
		  right = nums.length-1;
		  
		  
		  if ( target > nums[right]) {
			  right = start-1;
		  }else {
			  left= start;
		  }
		  
		  //2nd binary search
		  
		  
		  while (left<=right) { //wrong
			  
			  int midPoint = left +  (right -left)/2;
			  
//			  //my try  1.0
//			  if (target>=nums[midPoint]) {
//				  left=midPoint;
//			  }else {
//				  right= midPoint-1;
//			  }
			  
			  // better 2.0
			  if (target==nums[midPoint]) {
				  return midPoint;
			  }else  if (target>nums[midPoint]) {
				  left=midPoint+1;
			  }else {
				  right= midPoint-1;
			  }
			 
			  
			  
		  }
		  
		  
//		  while(nums[left] <= nums[right]) {
//			  
//		  }
//		  
		  return -1;
		  
	  }
	
}
