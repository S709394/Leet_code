package com.leetcode;

public class Leetcode_2255_try2_startwith {
	public int countPrefixes(String[] words, String s) {
		
		int cnt = 0 ;
		for (String word : words) {
			if(s.startsWith(word)) {
				cnt++;
			}
		}
		return cnt;
	}
}
