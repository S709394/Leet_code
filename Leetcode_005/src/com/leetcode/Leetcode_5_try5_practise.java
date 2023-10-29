	package com.leetcode;

public class Leetcode_5_try5_practise {

	public int startIdx, maxLen;

	public String longestPalindrome(String s) {
		int len = s.length();

		for (int i = 0; i < len; i++) {
			palHelper(s, i, i + 1);
			palHelper(s, i, i);
		}
		return s.substring(startIdx, startIdx + maxLen);
	}

	public void palHelper(String s, int j, int k) {
		while (0 <= j && k < s.length() && s.charAt(j) == s.charAt(k)) {
			j--;
			k++;
		}

		int curMaxLen = k - j - 1;
		if (maxLen < curMaxLen) {
			maxLen = curMaxLen;
//			System.out.println(maxLen);
			startIdx = j + 1;
			
		}

	}
}
