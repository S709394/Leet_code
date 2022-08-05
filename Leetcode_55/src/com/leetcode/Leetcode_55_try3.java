/*45. Jump Game II
Medium

8839

321

Add to List

Share
Given an array of non-negative integers nums, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Your goal is to reach the last index in the minimum number of jumps.

You can assume that you can always reach the last index.
 * 
 * 
 * */

/*Idea :  
 * 
 * Using Optimal Greedy Approach
 * 
 * 
 * Runtime: 1 ms, faster than 99.93% of Java online submissions for Jump Game II.
 * Memory Usage: 42.6 MB, less than 95.33% of Java online submissions for Jump Game II.
 */


package com.leetcode;

public class Leetcode_55_try3 {
	public static void main(String[] args) {
//		 int [] nums =   {2,3,1,1,4};
		//2,3,0,1,4
		int [] nums =   {2,3,0,1,4};
		
//		 int [] nums =   {1,2,3};
		 
		 System.out.println(   jump(nums));
	}
	
	
	//int length = nums.length;
    //int end = 0;
    //int maxPosition = 0; 
    //int steps = 0;

	
	
	public static  int jump(int[] nums) {
		int  length = nums.length-1;
		
		//
		int checkPoint = 0 ;
		
		// "The maxPosition that x steps can go"
		int maxPosition = 0; 
		
		// the steps we need to this position
		int steps = 0;
		
		for (int i= 0 ;  i < length; i ++ ) {	
			
			//find the maxPosition for that  next steps can reach 
			maxPosition = Math.max(maxPosition, i+nums[i]);
			
//			System.out.println("checkpoint : " + checkPoint   +  "maxPosition : " + maxPosition);
			// The first step is in the  pos 0 ;
			if(checkPoint==i) {
				
				// update your next step  for the maxPosition
				checkPoint=maxPosition;
				steps++;
			}
		}
		
		
		return steps ; 
	}
}
