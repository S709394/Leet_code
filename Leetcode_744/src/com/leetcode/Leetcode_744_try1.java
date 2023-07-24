package com.leetcode;

public class Leetcode_744_try1 {
	public static void main(String[] args) {

	}

	public static char nextGreatestLetter(char[] letters, char target) { 
		
//		/try1 
		int len = letters.length;
//		int res = -1 ;
		for ( int i = 0 ; i < len ; i ++) {
			if( (letters[i]-target) >0 ) {
				return letters [i] ;
			}	
		}
		return letters[0];
	}
}
