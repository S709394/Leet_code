/*96. Unique Binary Search Trees
Medium

7712

309

Add to List

Share
Given an integer n, return the number of structurally unique BST's (binary search trees) which has exactly n nodes of unique values from 1 to n.

 

Example 1:


Input: n = 3
Output: 5
Example 2:

Input: n = 1
Output: 1
 

Constraints:

1 <= n <= 19
 * */

/* Idea :
 * 
 * The number of combination is
 * 
 		All possible left tree * all possible right tree
			
			
			(PS : 1,2,3 are in  left tree  and  6 ,7    are in the right tree       )
			
			   4 
			  /  \
			  2   6 
			/\    /   \
		   1  3  null  7
		   
		   
	Runtime: 1 ms, faster than 14.83% of Java online submissions for Unique Binary Search Trees.
	Memory Usage: 41.8 MB, less than 5.22% of Java online submissions for Unique Binary Search Trees.	   
		   
		   
 */
package com.leetcode;

import java.util.HashMap;


// 96 , not 95
public class Leetcode_95_try1 {
	private HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

	public static void main(String[] args) {

	}

	public int numTrees(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}

		// Not doing the repeat works //part 1
		if (hm.containsKey(n)) {
			return hm.get(n);
		}
		int sum = 0;

//		for ( int i =0;i<n; i ++) {  //wrong
		
		
		//start from [1 , n] 
		for ( int i =1;i<=n; i ++) {  
			sum+= numTrees(i-1) *(n-i);
		}
		
		// Not doing the repeat works //part 2
		hm.put(n, sum);
		
		return sum;
	}

}
