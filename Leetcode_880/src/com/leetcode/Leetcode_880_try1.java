package com.leetcode;

public class Leetcode_880_try1 {
	public static void main(String[] args) {
		
	}

	public String decodeAtIndex(String s, int k) {
		
		//  try1
		
		// no idea so far 
		
		char []  chs = s.toCharArray() ;
		long size = 0 ;
		
		for ( char ch : chs) {
			 if(Character.isDigit(ch)) {
				 size *= (int)  (ch-'0') ;
			 }else {
				 size ++;
			 }
			 
		}
		
		
		// make sur k < size 
		if ( k > size ) {
			return null ;
		}
		
		long sNo = size ; 
		
		
		for ( int ix = chs.length -1 ;ix >=0 ; ix--) {
				char ch = chs[ix] ;
				// end situation 
				if( k==0 && Character.isLetter(ch)) {
					return String.valueOf(ch);
				}
				if(  Character.isDigit(ch)) {
					int dgt =  (int) (ch-'0');
					System.out.println( "dgt: " + dgt); //test
					
					sNo =sNo /dgt;
					k%= sNo ; //*
				}
				else if ( k == sNo) {
					return String.valueOf(ch);
				}else {
					sNo--;
				}
		}
			return null;
	}
}
