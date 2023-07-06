package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_859_try3 {
	public static void main(String[] args) {
//		String s = "bac";
		String s = "aaa";

		String goal = "abc";
		System.out.println(buddyStrings(s, goal));
	}

	public static boolean buddyStrings(String A, String B) {
		if (A.length() != B.length()) {
			return false;

		}

		Set<Character> set = new HashSet<>();

		int diff1 = -1, diff2 = -1;
		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) != B.charAt(i)) {
				if (diff1 == -1) {
					diff1 = i;
				} else if (diff2 == -1) {
					diff2 = i;
				} else {
					return false;
				}
				
			}
			set.add(A.charAt(i));
		}

	}
}
