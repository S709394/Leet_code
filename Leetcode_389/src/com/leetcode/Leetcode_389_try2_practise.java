package com.leetcode;

public class Leetcode_389_try2_practise {
	public static void main(String[] args) {
		String  s = "abcd"  , t = "abcde";
		System.out.println( findTheDifference (s,t));
	}
	
	public static char findTheDifference(String s, String t) {
		///try2 _practise
		int []  intArr =  new int [ 26] ;
		char []  tArr = t.toCharArray();
		char []  sArr = s.toCharArray();
		
		for (int i = 0 ; i < s.length();i ++) {
			intArr[ tArr[i]-'a'  ]++;
			intArr[ sArr[i]-'a'  ]--;
		}
		int tLen = t.length();
		intArr[ tArr[tLen -1]-'a'  ]++;
		for (int i = 0 ; i < 26;i ++) {
			if (intArr [i] == 1) {
				return (char) ('a'+i);
			}
		}
		
		return ' '; 
	}
}
