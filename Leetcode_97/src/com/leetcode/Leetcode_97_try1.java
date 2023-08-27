package com.leetcode;

import java.util.Arrays;

public class Leetcode_97_try1 {
	public static void main(String[] args) {

		// from here ?
		// https://appktavsiei5995.pc.xiaoe-tech.com/p/t_pc/goods_pc_detail/goods_detail/p_62654124e4b09dda125f9a8d?
		// the
		String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac";

	}

	static int[][] memo;

	public static boolean isInterleave(String s1, String s2, String s3) {
		int m = s1.length(), n = s2.length();
//		, l3 = s3.length();/

		if (s3.length() - m != n) {
			return false;
		}

		memo = new int[m + 1][n + 1];

		// -1 mean not cal yet
		for (int[] row : memo) {
			Arrays.fill(row, -1);
		}

		return dp(s1, 0, s2, 0, s3);

	}

	public static boolean dp(String s1, int i, String s2, int j, String s3) {
		int k = i + j;

		// finish rebuild
		if (k == s3.length()) {
			return true;
		}

		if (memo[i][j] != -1) {

			return memo[i][j] == 1 ? true : false;
		}
		boolean res = false;
		if (i < s1.length() && s1.charAt(i) == s3.charAt(k)) {
			res = dp(s1, i + 1, s2, j, s3);
		}

		if (j < s2.length() && s2.charAt(j) == s3.charAt(k)) {
			res = res || dp(s1, i, s2, j + 1, s3);
		}

		memo[i][j] = res == true ? 1 : 0;

		return res ;
	}
}
