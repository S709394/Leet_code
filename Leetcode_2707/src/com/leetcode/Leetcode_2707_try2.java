package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_2707_try2 {
	public static void main(String[] args) {
		
		//does not works 
		String s = "sayhelloworld";
		String[] dictionary = { "hello", "world" };
		
		System.out.println( minExtraChar (s , dictionary));
	}

	public static  int minExtraChar(String s, String[] dict) {
		
		//does works when   for this case  s = "leetscode"  ,  dict ["leet","code","leets"]
		Set <String>  strSet  = new HashSet <> () ;
		
		int cntRes = 0 ; 
		int sLen = s.length() ;
		int minLen =  128;
		for (String  str : dict) {
			strSet .add(str) ;
//			System.out.println( str);  //test
			minLen =Math.min(minLen, str.length());
			
//			System.out.println("minLen" + minLen);
		}
		int left =0 , right = left + minLen ;
		while  (right <= sLen-1 ) {  //not sure 
			String toCompare = s.substring(left,right);
			
//			System.out.println("toCom: " + s.substring(left,right) ); 
			if (strSet.contains(toCompare)) {
				
				left += toCompare .length();
				right +=  toCompare .length();
			}else {
				left ++ ;
				right ++ ;
				cntRes ++ ;
				continue;
			}
//			System.out.println( "cnt" + cntRes);
		}
		
		return cntRes ;
	}
	
}
