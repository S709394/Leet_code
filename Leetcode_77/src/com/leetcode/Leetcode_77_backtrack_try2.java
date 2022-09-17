//Does not finished

/*Idea :
 * 
 * Runtime: 105 ms, faster than 8.92% of Java online submissions for Combinations.
Memory Usage: 65.9 MB, less than 15.68% of Java online submissions for Combinations.
 * */

package com.leetcode;

import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.List;



public class Leetcode_77_backtrack_try2 {
	 

//	static List<Integer> track = new LinkedList<Integer>();
	public static List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
//		if (k <= 0 || n <= 0) {
//			return res;
//		}
		;
		List<Integer> track = new ArrayList<Integer>();
		backtrack(res,track, n, k, 1);
		
		return res;

	}

	public static void backtrack(List<List<Integer>> res,List<Integer> track, int n, int k, int start) {
		if (k == 0) {
			res.add(new ArrayList<Integer>(track));
		}
//		for (int i = start; i <= n; i++) {  //slow 
		for (int i = start; i <= n-(k-track.size()); i++) {
			track.add(i);
			backtrack(res,track ,n, k-1,   i + 1);
			track .remove(track.size()-1);
		}
	}
}
