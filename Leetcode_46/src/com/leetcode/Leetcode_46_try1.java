/*46. Permutations
Medium

11443

204

Add to List

Share
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]
Example 3:

Input: nums = [1]
Output: [[1]]
 

Constraints:

1 <= nums.length <= 6
-10 <= nums[i] <= 10
All the integers of nums are unique.
*/

/* Idea : 
 * 
 * 
 * list  .contains [   nums [i] ]  // make sure the elem not in the templist
 * 
 * 
 * Runtime: 1 ms, faster than 98.06% of Java online submissions for Permutations.
 * Memory Usage: 42.6 MB, less than 86.65% of Java online submissions for Permutations.
 * */

package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_46_try1 {
	public static void main(String[] args) {

		int[] nums = { 1, 2, 3 };
		
		System.out.println(permute (nums));
	}

	public static void dfs(List<List<Integer>> list, List<Integer> templist, int[] nums) {
		
		if ( templist.size()== nums.length) {
			list.add(new ArrayList<Integer>( templist));
		}else {
			for (int i = 0 ; i < nums.length;i++){
				if (templist.contains(nums[i])) continue; // make sure the element is not inside  templist
				templist.add(nums[i]);
				dfs (list,templist,nums);
				templist.remove(templist.size()-1);
			}
		}
		
		
	}

	public static List<List<Integer>> permute(int[] nums) {

		List<List<Integer>> list = new ArrayList<List<Integer>>();
		// Do not need to sort
		dfs(list, new ArrayList <Integer> (),nums);
		return list;

	}
}
