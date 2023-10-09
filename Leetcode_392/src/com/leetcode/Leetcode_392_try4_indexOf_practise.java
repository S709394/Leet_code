package com.leetcode;

public class Leetcode_392_try4_indexOf_practise {
	public static void main(String[] args) {
		String s = "abcz", t = "ahbgdc";
		System.out.println(isSubsequence(s, t));
	}

	public static boolean isSubsequence(String s, String t) {
		int startIndex = 0;

		for (char c : s.toCharArray()) {
			startIndex = t.indexOf(c, startIndex);

			if (startIndex == -1) {
				return false;

			}

			startIndex++;
		}
		return true;
	}
}
