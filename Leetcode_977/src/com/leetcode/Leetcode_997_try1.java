//Idea : squares is always  > then  '0'  
//         we can just use 2 pointers  from the left and right and compare them one by one       
//Runtime: 2 ms, faster than 90.70% of Java online submissions for Squares of a Sorted Array.
//Memory Usage: 55.8 MB, less than 30.29% of Java online submissions for Squares of a Sorted Array.

package com.leetcode;

//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;

public class Leetcode_997_try1 {
	public int[] sortedSquares(int[] nums) {
		int len = nums.length;
		int end = len -1;
		int l = 0, r = len - 1;
//		List<Integer> list = new ArrayList<>();
		int[] res = new int[len];

		while (l <= r) {
            // System.out.println("hihi"); //test
			int lNum = nums[l], rNum = nums[r];

			int lSqr = lNum * lNum, rSqr = rNum * rNum;

			if (lSqr >= rSqr) {
				res[end] = lSqr;
				l++;
			} else {
				res[end] = rSqr;
				r--;
			}
             // System.out.println("res [end] : " + res[end]); //test
			end--;
   
		}
		return res;
	}
}
