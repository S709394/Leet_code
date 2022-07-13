/*
 * 560. Subarray Sum Equals K
Medium

14015

440

Add to List

Share
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

 

Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2
 

Constraints:

1 <= nums.length <= 2 * 104
-1000 <= nums[i] <= 1000
-107 <= k <= 107
*/
// Idea :   The normal one 
/*Noidea so far
 * 
 * 
 * 
 * */
public class Leetcode_560_try1 {
	public static void main(String[] args) {
		
		int [] 	nums = {1,1,1};
//		int [] 	nums = {1,3,7 ,10};
		
		 int k = 2;
		 
		 System.out.println(subarraySum(nums,k));
	}
	
	 public  static int subarraySum(int[] nums, int k) {
	        int res = 0 ;
	         for (int i= 0 ;i < nums .length ;i ++) {
	        	 if (nums[i] == k) {
	        		 res++;
	        	 }
	        	 int sum = nums[i];
	        	 
	        	 for (int j = i +1 ; j <nums.length ; j ++) {
	        		 sum += nums [j];
	        		 
	        		 if (sum==k) {
	        			 res ++;
	        		 }
	        	 }
	        	 
	        	 
	        	 
	         }
	         return res;
    }
}
