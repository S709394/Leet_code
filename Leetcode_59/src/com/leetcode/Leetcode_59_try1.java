package com.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Leetcode_59_try1 {
	public int[][] generateMatrix(int n) {
		int upper_bound = 0, low_bound = n;
		int left_bound = 0, right_bound = n;

		List<Integer> res = new LinkedList<>();

		while (res.size() < n * n) {
			if (upper_bound <= low_bound) {
				for (int i = left_bound; i < n; i++) {

				}
				upper_bound++;
			}
			if (left_bound <= right_bound) {
				right_bound--;
			}
			if (upper_bound <= low_bound) {
				
				low_bound--;
			}
			if (left_bound <= right_bound) {
				left_bound++;
			}

		}
	}
}
