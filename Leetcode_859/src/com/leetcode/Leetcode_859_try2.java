package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_859_try2 {
	public static void main(String[] args) {
//		String s = "bac";
		String s = "aaa";

		String goal = "abc";
		System.out.println(buddyStrings(s, goal));
	}

	public static boolean buddyStrings(String A, String B) {
		
		//does not works so far 

		int ALen = A.length();
		if (A.length() != B.length())
			return false;

		int diff1 = -1, diff2 = -1;

		Set<Character> set = new HashSet<>();

		for (int i = 0; i < ALen; i++) {
			if (A.charAt(i) != B.charAt(i)) {

				if (diff1 == -1) {
					diff1 = i;
				} else if (diff2 == -1) {
					diff2 = i;
				} else {
					return false;  //more then 2 diff  between A & B
				}
				set.add(A.charAt(i));
			}
		}
		
		if( diff1 != -1 && diff2 != -1 ) {
			return A.charAt(diff2) == B.charAt(diff1)  && A.charAt( diff1) == B.charAt(diff2);
		}
		
		if( diff1 != -1) {  // only 1 diff place 
			return false ;
		}
		
		return  set.size() < A.length() ;// No different between A & B, check if A contains at least 1 duplicate letters.
	}
}
