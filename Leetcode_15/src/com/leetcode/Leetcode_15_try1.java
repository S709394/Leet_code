/*15. 3Sum
Medium

18554

1781

Add to List

Share
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Example 2:

Input: nums = []
Output: []
Example 3:

Input: nums = [0]
Output: []
 

Constraints:

0 <= nums.length <= 3000
-105 <= nums[i] <= 105
 * */

/*Idea:   2 pointers   
 * 
 *  arrys.asList ();
 *  
 *  
 *  Runtime: 44 ms, faster than 36.51% of Java online submissions for 3Sum.
Memory Usage: 62 MB, less than 24.71% of Java online submissions for 3Sum.
 * 
 * */
package com.leetcode;
//
//import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode_15_try1 {
	public static void main(String[] args) {
		
	}
	
	public static List<List<Integer>> threeSum(int[] nums) {
        	
//		List<List<Integer>> LL = new ArrayList(); // wrong 
		
		Set <List<Integer>>  HSet = new HashSet<>(); 
		
		// do not need this   //3 <= nums.length <= 3000
		if (nums.length<3) {
    		return  Collections.emptyList();
    	}
		
		
		//  i j k    ,   j and k are the 2 pointers 
		
		//1  sort  ,  from less to more
		Arrays.sort(nums);
		
		for (int i = 0 ; i < nums.length-2;i ++) {
			
			// some bad condition 
			
			if (nums[i]>0) break;
			
			// skip if the nums is the same
			if(i>0 &&  nums[i] == nums[i-1]) continue;
			
			
			int j = i +1;
			int  k  =  nums.length-1;
			
			while (j < k) {	
				
				
				int sum  = nums[i] + nums[j]+nums[k] ;
				//  Since the nums has been sorted , use this logic to help the sum to approach 0;
				if (sum== 0) {
//					List <Integer> numsList =  new ArrayList();
//					numsList.add(nums[i]);
//					numsList.add(nums[j]);
//					numsList.add(nums[k]);   // not good 
					
					HSet.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
					
					
//					HSet.add(numsList);
				}else  if (sum>0) {
//					while (nums[k]== nums[k+1]) {
//						k++;
//					}
					k--;
				}else if (sum <0){
//					while (nums[j]== nums[j+1]) {
//						j++;
//					}
					j++;
				}
			}
			
			
			
			
			
		}
		
		return  new ArrayList<>(HSet);
		
		
    }
}
