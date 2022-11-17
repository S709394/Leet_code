package com.leetcode;

public class Leetcode_409_try2_int_52_practise {
	  public int longestPalindrome(String s) {
		  int [] charCnt  = new int [ 52] ;
		  
		  for (char c : s.toCharArray()) {
			  
			  if(Character.isLowerCase(c) ) {
				  charCnt [ c-'a' ] ++;
			  }else {
				 
				  charCnt[ Character.toLowerCase(c ) -'a' +26 ] ++;
			  }
			  
		  }
		  int len = 0 ;
		  
		  for (int cnt : charCnt) {
			  len += cnt/2 *2 ;
		  }
		  
		  if(len < s.length()) {
			  len ++;
		  }
		  
		  return len ;
	  }
	
}
