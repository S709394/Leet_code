//Does not works 

package com.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Leetcode_77_try1 {

	static List<List<Integer>> res = new LinkedList<List<Integer>>();
	static List<Integer> track = new LinkedList<Integer>();
	
	public List<List<Integer>> combine(int n, int k) {
		if (k <= 0 || n <= 0) {
			return res;
		}
//		Vector<Integer> track =  new Vector<Integer> ();
		

		backtrack(n, k, 1, track);
		return res;

	}

	public static void backtrack(int n, int k, int start, List<Integer> track) {

		if (k == track.size()) {
			res.add(new LinkedList<Integer>(track));
		}
		;

		for (int i = start; i < n; i++) {
			track.add(i);

			backtrack(n, k, start + 1, track);
			track.remove(track.size() - 1);
		}

	};
}
