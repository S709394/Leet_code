package com.leetcode;

public class Leetcode_459_try2 {
	
	//do not know what is the idea so far 
	public boolean repeatedSubstringPattern(String s) {
		//try2 
		// not have to 
		if ( s==null || s.length() ==0) return true ;
		
		int n = s.length() ;
		
		for ( int  len = 0 ; len <= n/2 ; len ++ ) {
			
			 // s length must can be divided by the pattern length
			if (n  % len != 0 ){
				continue ;
			}
			
			// pattern string
			
			String pattern = s.substring(0, len);
			
			
			// the 2nd pattern
			int i = len , j = len + n-1;
			
			while  ( j < n) {
				
				if ( !pattern  .equals( s.subSequence(i ,j)) ) {
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
