package com.leetcode;

public class Leetcode_459_try2 {
	
	//do not know what is the idea so far 
	public static void main(String[] args) {
		String  str = "abcabc" ;
		 System.out.println(repeatedSubstringPattern (str ) );
	}
	public  static boolean repeatedSubstringPattern(String s) {
		//try2 
		// not have to 
		if ( s==null || s.length() ==0) return true ;
		
		int n = s.length() ;
		
		
		// len  start  from 1 
		for ( int  len = 1 ; len <= n/2 ; len ++ ) {
			
			 // s length must can be divided by the pattern length
			if (n  % len != 0 ){
				continue ;
			}
			
			// pattern string
			
			String pattern = s.substring(0, len);
			
			
			// the 2nd pattern
			int i = len , j = len + i-1;
			
			while  ( j < n) {
				String subString =  s.substring( i , j +1);
				System.out.println( "subString :" + subString );
				if ( !pattern  .equals(subString	) ) {
					break ;
				}
				i+= len ;
				j+= len ;
				
			}
			if  (i == n ) return true ; 
			 
			
		}
		return false ;
		
	}
}
