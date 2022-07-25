/*75. Sort Colors
Medium

11113

438

Add to List

Share
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 

Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.
 

Follow up: Could you come up with a one-pass algorithm using only constant extra space?
*/

/* 
 * Idea :  
 * Count the 0s and 2s ;
 * That is all 
 * 
 * 
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Sort Colors.
Memory Usage: 42.7 MB, less than 37.01% of Java online submissions for Sort Colors.
 * */




package com.leetcode;

public class Leetcode_75_try1 {
	 public static void main(String[] args) {
		int [] nums =  {2,0,2,1,1,0};
	}
	 	public static void sortColors(int[] nums) {
	        int length = nums.length;
	        int cntZero = 0;
 			int cntTwo = 0;
	 		for (int i = 0 ; i < length ; i++) {
	 			
	 			if (nums[i]== 0) {
	 				cntZero++;
	 			}
	 			if (nums[i]== 2) {
	 				cntTwo++;
	 			}
	 			
	 			
	 		}
	 		int cntOne = length- cntZero - cntTwo;
	 		
	 		for (int i = 0 ; i < length ; i++ ) {
	 			if(i<cntZero) {
	 				nums[i]=0;
	 			}else if (i>=(length -cntTwo)){
	 				nums[i]=2;
	 			}else {
	 				nums[i]=1;
	 			}
	 		}
	    }
	 
	 
}
