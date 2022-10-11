
//Runtime: 70 ms, faster than 97.03% of Java online submissions for Find Triangular Sum of an Array.
//Memory Usage: 42.6 MB, less than 87.79% of Java online submissions for Find Triangular Sum of an Array.

/*Idea:
 * 
 * 1. Traverse the array from i = 0 to length and replace nums[i] with (nums[i] + nums[i+1]) %10  
 * 2. Deduct 1 from the length with each traversal
 * 3. Return nums[0] when length becomes 1
 * 
 * */
package com.leetcode;

public class Leetcode_2221_try1 {
	public static void main(String[] args) {
//		int[] nums = { 5 };
		int[] nums = { 1,2,5 };

		System.out.println(triangularSum (nums));
	}

	public static int triangularSum(int[] nums) {
//        int 
		int count = nums.length;

//		int len = count ;

		while (count > 1) {

			for (int i = 0; i < count - 1; i++) {

				nums[i] = nums[i] + nums[i + 1] % 10;
			}
			count--;
		}
		return nums[0];
	}
}
