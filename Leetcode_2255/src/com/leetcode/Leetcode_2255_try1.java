package com.leetcode;

import java.util.HashSet;

import java.util.Set;

public class Leetcode_2255_try1 {
	public int countPrefixes(String[] words, String s) {
		
		int sLen = s.length();
		Set <String>  set = new HashSet <String>();
		
		StringBuilder sb = new StringBuilder () ; 
		for (int i = 0 ; i < sLen ; i ++) {
			
			sb .append( s.charAt(i));
			set.add(sb.toString());
		}
		int cnt =0 ;
		for (String word : words ) {
			if (set.contains(word)) {
				cnt++;
			}
		}
		return cnt ;
	}
}
