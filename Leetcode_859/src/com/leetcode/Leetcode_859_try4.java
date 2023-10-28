package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_859_try4 {
	public static void main(String[] args) {
//		String s = "bac";
		String s = "acb";

		String goal = "abc";
		System.out.println(buddyStrings(s, goal));
	}

	public static boolean buddyStrings(String s, String goal) {
		int sLen = s.length();

		// 1
		if (sLen != goal.length()) {
			return false;
		}

		// 2 2 place to store the diffs

		Set<Character> set = new HashSet<>();

		int diff1 = -1, diff2 = -1;

		for (int i = 0; i < sLen; i++) {

			if (s.charAt(i) != goal.charAt(i)) {
				if (diff1 == -1) {
					diff1 = i;
				} else if (diff2 == -1) {
					diff2 = i;
				} else {
					return false;
				}
			}

			set.add(s.charAt(i));

		}

		if (diff1 != -1 && diff2 != -1) {
			return s.charAt(diff2) == goal.charAt(diff1) && s.charAt(diff1) == goal.charAt(diff2);
		}
		if( diff1 != -1 ) { //diff2 == -1 
			return  false ;
		}

		return  set.size() < s.length();
	}
}
