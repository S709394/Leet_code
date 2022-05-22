/*
 * 53. Maximum Subarray
Easy

20787

1029

Add to List

Share
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
 

Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

Accepted
2,342,699
Submissions
4,728,323*/

/* Idea :   From left to right ,  to calculate the MaxSum of the pos so far .
 * 
 * for example  {-2,1,-3,4,-1,2,1,-5,4}  
 * 
 * in the for loop  
 * 
 * we comper  the   (-2 )  and (1  )   , 1 > -2  ,than  we start in 1 ;
 *   
 *   next  compare  1 and  -3     -3 < 1  , than we  add them together  into -2;
 *   
 *   next one   -2 < 4  , so our contiguous subarray has a new start  begin  at 4 
 * 
 *  step by step   now we have a {4,-1,2,1 }  and  they sum as a 6;
 *  
 *  from here to the end ,  we can not replace this MaxSumEndHere anymore.
 *  
 *  So the answer of this array is a 6
 * 
 * 
 * */
package com.leetcode;

public class Try1_leetcode_53 {
	
	public static void main(String[] args) {
		
		//sample 1
		int []  nums = {-2,1,-3,4,-1,2,1,-5,4};  //test 
		
		//sample 2 
//		int []  nums = {5,4,-1,7,8};  //test 
		System.out.println( maxSubArray (nums));
	}
	//MaxSoFar   MaxSum
	
	public static int maxSubArray(int[] nums) {
	 int MaxSumEndHere = nums[0];
	 
	 
	 // the Max number till this pos
	 int MaxSoFar =nums[0];
	 
	 
	 
	 for (int i=1 ; i< nums.length; i++) {
		 
//		 MaxSumEndHere =  Math.max(MaxSoFar, MaxSoFar + nums[i]); //wrong
		 MaxSumEndHere =  Math.max(nums[i], MaxSumEndHere + nums[i]); 
		 
		 System.out.println("MaxSumEndHere:" +MaxSumEndHere);
		 
		 
		 MaxSoFar= Math.max(MaxSoFar, MaxSumEndHere);
	 }
	 
	 return  MaxSoFar;
	 //near the g chest xxxxxx
	}
}
