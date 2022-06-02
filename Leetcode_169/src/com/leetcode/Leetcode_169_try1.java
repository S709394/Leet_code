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
 * 
 * Array .sort ()  
 * 
 * After sort ,  there are about    (  length ) /2   or  (  length ) /2  +1 with  "majority"s in the array 
 * 
 * so  nums [length/2]  would be good 
 * 
 * */

package com.leetcode;

import java.util.Arrays;



public class Leetcode_169_try1 {
	public static void main(String[] args) {
		
		 	int[] nums   = {4,2,4};
		 	
		 	System.out.println(majorityElement(nums));
		 	
		 	
		 	
		
	}

 	
 	public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        
        return nums[nums.length/2];
    }

	
	
}
