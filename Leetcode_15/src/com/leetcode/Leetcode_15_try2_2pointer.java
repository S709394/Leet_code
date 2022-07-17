package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
 *  hashSet<List> =>  List<List>
 *  
 *  new ArrayList <> (hashSet)
 *  
 *  
 *  Runtime: 44 ms, faster than 36.51% of Java online submissions for 3Sum.
Memory Usage: 62 MB, less than 24.71% of Java online submissions for 3Sum.

v 3. 0  add some whileloop  to make sure when the some same nums show in a row ,  we can just skip it 
for both i j k  

Runtime: 29 ms, faster than 73.37% of Java online submissions for 3Sum.
Memory Usage: 46.3 MB, less than 96.41% of Java online submissions for 3Sum.

 * 
 * */

public class Leetcode_15_try2_2pointer {
	public static void main(String[] args) {
		
	}
	 public static List<List<Integer>> threeSum(int[] nums) {
	        
		 Arrays.sort(nums);
		 Set<List<Integer>>  hashSet =  new HashSet <>();
		 int sum = 0;
		 for (int i = 0 ; i < nums.length-2;i++) {
			 
			 // skip the same nums[i]
			 
			 if(i>0 && nums[i]==nums[i-1]) continue;
			 
			 
			 int j = i+1;
			 int k = nums.length-1;
			 while (j<k) {
				 
				 sum= nums[i]+nums[j]+nums[k];
				 
				 if (sum==0) {
					 
//					 hashSet.add(  Arrays.asList(nums[i],nums[j],nums[k])  );// wrong 
					 hashSet.add(  Arrays.asList(nums[i],nums[j++],nums[k--]));
					 
					 //skip the same nums[j]  \ nums[k]   in a row 
					 
					 while (j<k&& nums[j]== nums[j-1]) j--;
					 while (j<k&& nums[k]== nums[k+1]) k++;
					 
				 }else if (sum>0) {
					 k--;
				 }else if (sum<0) {
					 j++;
				 }
				 
				 
			 }
			 
		 }
		 return new ArrayList<>(hashSet);
    }
}
