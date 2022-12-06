package com.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Leetcode_54_try1 {
	public List<Integer> spiralOrder(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		int upper_bound = 0, low_bound = m - 1;
		int left_bound = 0, right_bound = n - 1;

		List<Integer> res = new LinkedList<>();

		while (res.size() < m*n) {
			if (upper_bound <= low_bound) {
				for (int i = left_bound; i <= right_bound; i++) {
					res.add(matrix[upper_bound][i]);
				}

				upper_bound++;
			}
			if (left_bound <= right_bound) {
				for (int i = upper_bound; i <= low_bound; i++) {
					res.add(matrix[i][right_bound]);

				}
				right_bound--;

			}
			if (upper_bound <= low_bound) {
				for (int i = right_bound; i >= left_bound; i--) {
					res.add(matrix[low_bound][i]);
				}

				low_bound--;
			}

			if (left_bound <=right_bound) {
				for (int i = low_bound; i >= upper_bound; i--) {
					res.add(matrix[i][left_bound]);
				}
				left_bound++;
			}

		}
		return res ;
	}

}
