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
 * Use  binary search to find the MIN int the array
 * 
 * 
 * 
 * */

package com.leetcode;

public class Leetcode_33_try1 {
	public static void main(String[] args) {
		
		
		
	} 
	
	public  static int search(int[] nums, int target) {
		if ( nums==null || nums.length==0) {
			return -1;
		}
		
         int left = 0 ; 
         int right = nums.length-1;
         
         
         //1st binary search 
	         while (left<right)
	         {
	        	 int midPoint =left + (right-left)/2;
//	        	 if (nums[midPoint]>nums[midPoint+1]) {// //my try  //not good  
	        	 if(nums[midPoint]> nums[right]) {
	        		 
//	        		 left=midPoint;//wrong
	        		 
	        		 left=midPoint+1;
	        	 }else {
	        		 right =midPoint;
	        	 }
	        	 
	         }
	         
	         int start = left;
	         left = 0 ;
	         right = nums.length-1;
	         
	         //my try 
	         
	         if (target >= nums[start] && target <= nums [right]) {
	        	 left = start;
	        	 
	         }else {
	        	 right = start;
	        
	         }
	         
	         //2nd binary search 
	         while (left<right)
	         {
	        	 int midPoint =left + (right-left)/2;
//	        	 if (nums[midPoint]>nums[midPoint+1]) {// //my try  //not good  
	        	 if(nums[midPoint] == target) {
	        		 return midPoint;
	        	 }else if (nums[midPoint]<target) {
	        		 left = midPoint +1;
	        		 
	        	 }else {
	        		right = midPoint -1; 
	        	 }
	        	
	         }
	         return -1 ;
	     }
	};
         
    

