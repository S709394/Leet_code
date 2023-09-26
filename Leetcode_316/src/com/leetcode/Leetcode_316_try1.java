package com.leetcode;

public class Leetcode_316_try1 {
	public static void main(String[] args) {

	}

	public String removeDuplicateLetters(String s) {
		//try1  does not works 
		boolean[] chars = new boolean[26];

		for (char c : s.toCharArray()) {
			chars[c - 'a'] = true;
		}

		StringBuilder sb = new StringBuilder(); 
		
		for ( int i = 0 ; i < 26 ;i ++) {
			if ( chars [i]== true ) {
				char  c =  (char) ('a' +i)   ;
				sb.append(c) ; 
				System.out.println( sb ); //test 
			}
		}
		return sb.toString();
	}
}
