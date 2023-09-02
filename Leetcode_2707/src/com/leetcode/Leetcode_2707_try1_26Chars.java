package com.leetcode;

public class Leetcode_2707_try1_26Chars {
	public static void main(String[] args) {
		String s = "sayhelloworld";
		String[] dictionary = { "hello", "world" };
		
		System.out.println( minExtraChar (s , dictionary));
	}

	public static  int minExtraChar(String s, String[] dict) {
		int cnt [] = new int [26] ; 
		int sLen = s.length();
		
		for (int i = 0 ; i < sLen ; i ++) {
			
			cnt [s.charAt(i)- 'a']  ++ ;
		}
		int dictLen = dict.length;
		for ( int i = 0 ; i < dictLen ; i ++) {
			
			for ( char  c: dict [i] .toCharArray()) {
				cnt[ c - 'a'] -- ;
				System.out.println( "c :" +c );
				
			}
			
			
		}
		
		int total =0 ;
		for  (int i = 0 ; i < 26 ;i ++) {
			total += cnt [i] ;
		}
		
		return total ;
	}
}
