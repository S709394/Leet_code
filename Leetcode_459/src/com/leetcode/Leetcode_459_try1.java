package com.leetcode;

public class Leetcode_459_try1 {
	public static void main(String[] args) {
		String s = "abcabc";
	}

	public boolean repeatedSubstringPattern(String s) {
		
		//does not finished 
		
		int len = s.length();

		if (len <= 3)
			return false;
//		if ( len / findIdx (  1,s , s.charAt(len))   != 0  ){
//			return false ;
//		}

		int subLen = 2;

		boolean isVaild = false;

	}

	// find the most left char c
	public static int findIdx(int start, String s, char c) {
		int len = s.length();
		int idx = start;
		while (idx < len) {
			if (c == s.charAt(idx)) {
				return idx;
			}

			idx++;
		}

		return -1;
	}
}
