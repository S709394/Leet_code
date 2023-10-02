package com.leetcode;

public class Leetcode_880_try1 {
	public static void main(String[] args) {
		
	}

	public String decodeAtIndex(String s, int k) {
		
		char []  chs = s.toCharArray() ;
		long size = 0 ;
		
		for ( char ch : chs) {
			 if(Character.isDigit(ch)) {
				 size *= (int)  (ch-'0') ;
			 }else {
				 size ++;
			 }
			 
		}
		
	}
}
