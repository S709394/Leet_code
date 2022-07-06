/*40. Combination Sum II
Medium

5877

149

Add to List

Share
Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

Each number in candidates may only be used once in the combination.

Note: The solution set must not contain duplicate combinations.

 

Example 1:

Input: candidates = [10,1,2,7,6,1,5], target = 8
Output: 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]
Example 2:

Input: candidates = [2,5,2,1,2], target = 5
Output: 
[
[1,2,2],
[5]
]
 

Constraints:

1 <= candidates.length <= 100
1 <= candidates[i] <= 50
1 <= target <= 30
 * */

package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_40_try1 {
	public static void main(String[] args) {
		
		int []candidates = {10,1,2,7,6,1,5};
		int target = 8;
		System.out.println(combinationSum2(candidates,target));
		
		
	}
	
	// DFS  (Depth First Search)
	
	public static void dfs  (List<List<Integer>>list,  List<Integer>tempList,int [] nums, int remain ,int start) {
		// if  remain < 0 
		if (remain < 0 ) {return;}
		
		else if (remain==0) {
			 list.add(new ArrayList<Integer>(tempList));
		}else {
			for (int i = start ; i < nums.length;i++) {   // maybe add the nums[i]  < ramain  
				
//				if ( i>0 && nums[i]== nums[i-1]) continue;// wrong
				if ( i>start && nums[i]== nums[i-1]) continue;
				tempList.add(nums[i]);
//				dfs (list ,tempList, nums , remain- nums[i],i); //wrong 
				dfs (list ,tempList, nums , remain- nums[i],i+1); //wrong 
				tempList.remove(tempList.size()-1);
				
			}
			
		}
		
		
		//  if remain == 0
		//  DFS part   use a for loop  , 
		
		
		
		
	}
	
	public  static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> list = new ArrayList <List<Integer>>();
		
		//sort 
		Arrays.sort(candidates);
		
		dfs(list , new ArrayList<Integer> () , candidates, target,0);
		
		
		return  list ;
		
    }
}
