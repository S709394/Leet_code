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
 * Does not works so far 
 * 
 * using dynamic programing 
 * 
 * */

package com.leetcode;

public class Leetcode_45_try1_DP {
	
	public static void main(String[] args) {
//		 int [] nums =   {2,3,1,1,4};
		//2,3,0,1,4
		int [] nums =   {2,3,0,1,4};
		
//		 int [] nums =   {1,2,3};
		 
		 System.out.println(   jump(nums));
	}
	
	public static  int jump(int[] nums) {
		
		int length = nums.length;
        int [] dp = new int[length];
        
        dp[0]=0;  
        for (int i = 1; i < length ; i++) {
        	dp[i]= Integer.MAX_VALUE;
        	
//        	System.out.println("dp[i] :"+ dp[i]);
        }
//        for (int i = 0; i < length ; i++) {   //test
//        	
//        	System.out.println("dp[i] aaa:"+ dp[i]);
//        }
        
        for (int i = 0; i < length ; i++) {
        	
//        	dp[i] = 0;
        	
        	 if (i!=0) {
        		 dp[i]= dp[i-1]+1;
        	 }
        	
        	 int index_to_fill =  i+ nums[i];
        	 
        	 int cnt =0;  // test 
        	for(int k = i+1 ; k <index_to_fill &&i>0&& k <length; k ++) {
        		
        		cnt++;
        		System.out.println("cnt: " + cnt + "   i: " + i );
        		
//        		dp[k]= Math.min(last_step+1, dp[k]);
        		dp[k]= Math.min(dp[i-1]+1, dp[k]);
//        		dp[k]= dp[i];
        		
        		i++;
//        		System.out.println("k:" + k  + " dp[]k  :" + dp[k]);
        	}
        	
        	
        }
//        //test
        for (int i = 0; i < length ; i++) {   //test
        	
        	System.out.println("dp[i] :"+ dp[i]);
        }
        return dp [length-1];
    }
}
