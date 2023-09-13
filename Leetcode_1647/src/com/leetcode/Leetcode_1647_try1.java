package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_1647_try1 {
	public static void main(String[] args) {
		
	}
	 public int minDeletions(String s) {
		 int []   cnt = new  int [26] ;
		 
		 for (int i = 0 ; i  < s.length() ; i ++) {
			  cnt [ s.charAt(i) - 'a' ] ++ ;
		 }
		 
		 Set <Integer>  set = new HashSet <> () ;
		 
		 for ( int x  : cnt ) { 
			 
			 if( set .contains(x)) {
				 return false ;
			 }
			 if( x! =0  && ) {
				 set.add(null)
			 }
		 }
		 
		 
		 return true ;
	 }
}	
