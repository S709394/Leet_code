package com.leetcode;

public class Leetcode_1795_try2 {
	
	public static void main(String[] args) {
		System.out.println( countHomogenous ( "aabbb"));
	}
	public static int countHomogenous(String s) {
		int res = 0 ,cur =0 ,count =0 ,mod = 1_000_000_007 ;
		
		for ( int i  =  0 ; i < s.length() ; i ++) {
			
			if( s.charAt( i) == cur) {
				count ++ ;
			}else {
				count =1 ;
			}
			
			cur = s.charAt(i ) ;
			
			res =  (res + count ) % mod ;
			
		}
		return res ;
	}
}
