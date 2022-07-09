/*47. Permutations II
Medium

5988

106

Add to List

Share
Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.

 

Example 1:

Input: nums = [1,1,2]
Output:
[[1,1,2],
 [1,2,1],
 [2,1,1]]
Example 2:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 

Constraints:

1 <= nums.length <= 8
-10 <= nums[i] <= 10
*/
/*Idea : 
 * 
 * */
 
package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_47_try1 {
	
	public static void main(String[] args) {
		int[] nums = { 3,2,2,1};
		
		System.out.println(permuteUnique(nums));
	}
	//DFS
	
	public static void dfs (List<List<Integer>> list , List<Integer>tempList,int []nums , boolean [] used ) {
		if (tempList.size()== nums.length) {
			list.add( new ArrayList<>(tempList));
		}else {
			for (int i = 0 ; i < nums.length;i ++) {
				if (used [i] || i>0 && nums[i]== nums[i-1]&& !used[i-1] ) continue;
				used[i]= true;
				tempList.add(nums[i]);
				dfs(list, tempList,nums,  used);
				used[i]= false;
				
				tempList.remove(tempList.size()-1);
			}
		}
	}
	
	
	 public static List<List<Integer>> permuteUnique(int[] nums) {
		 List<List<Integer>>  list = new ArrayList<List<Integer>> ();
		 Arrays.sort(nums);
		 dfs(list, new ArrayList<Integer>(),nums,  new boolean[nums.length]);
		 
		 return list ;
	 }
	
	
}
