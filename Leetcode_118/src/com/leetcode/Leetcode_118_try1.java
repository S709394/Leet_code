package com.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leetcode_118_try1 {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(generate(n));
	}

	public static List<List<Integer>> generate(int n) {
		List<List<Integer>> ll = new ArrayList<>();
		// base case //
		for (int i = 0; i < n ; i++) {
			List<Integer> list = new ArrayList<Integer>();
				
			for (int j = 0; j < i+1; j++) {
				if (i == 0 || j == i) {
					list.add(1);
				} else {
					list.add(ll.get(i-1).get(j-1) + ll.get(i -1).get(j));
				}
			}

			ll.add(list);
		}
		return ll;
	}
}
