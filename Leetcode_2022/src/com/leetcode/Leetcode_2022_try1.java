package com.leetcode;

public class Leetcode_2022_try1 {
	public int[][] construct2DArray(int[] original, int m, int n) {
		int len = original.length;

		if (len != m * n) {
			return new int[0][0];
		}

		int[][] newMat = new int[m][n];
		for (int i = 0; i < m * n; i++) {
			set(newMat, i, original[i]);
		}
		return newMat;
	}

	public void set(int[][] mat, int idx, int val) {
		int m = mat.length;
		int n = mat[0].length;

		int r = idx / n, c = idx % n;

		mat[r][c] = val;
	}

}
