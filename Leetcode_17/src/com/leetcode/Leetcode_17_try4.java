package com.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Leetcode_17_try4 {
	public static void main(String[] args) {

	}

//	static List <String >  mapping= new  LinkedList <> () ;

	// "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
	String[] mapping = { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static List<String> letterCobinations(String digits) {
		List<String> res = new LinkedList<>();
		if (digits.length() == 0) {
			return res;
		}
		
		int digitLen = digits.length();
		for ( int  i = 0 ; i < digitLen ; i ++) {
			int x = Character .getNumericValue( digits.charAt(i)) ;
			
			int resSize = res .size() ;
			
			for ()  {
				
			}
					
					
			
			
			
			
		}
		
		
		return res ;
	}
}
