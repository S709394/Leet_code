/*55. Jump Game
Medium

12098

656

Add to List

Share
You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

 

Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
 

Constraints:

1 <= nums.length <= 104
0 <= nums[i] <= 105*/

/*Idea 
 * From left to right 
 * 
 * 
 *  Have a  int rightMost ;  
 *  
 *  If right most >  nums.length  then true ,  or return false 
 *  
 *  
 *  
 * 
 * */

package com.leetcode;

public class Leetcode_55_try1 {
	
	
	public boolean canJump(int[] nums) {
		
		//Right most the the farest index we can jump to 
		int right_most = 0 ;
		int length = nums.length;
		
		for (int i = 0 ; i < nums.length; i ++) {
			right_most=Math.max(right_most, nums[i]+i);
			if(right_most>=length-1) return true ;
			
			System.out.println("right_most:" +right_most);
		}		
		return false;

    }
	
}
