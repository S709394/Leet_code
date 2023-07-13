package com.leetcode;

public class Leetcode_2283_try1 {
	public static void main(String[] args) {
		String  s = "1210"  ;
		
		System.out.println( digitCount (s) );
	}

	public static boolean digitCount(String num) {

		int len = num.length();

		int[] dCnt = new int[10];

		for (int i = 0; i < len; i++) {

			dCnt[num.charAt(i) - '0']++;

		}
		
		for ( int i = 0 ; i <len ; i ++) {
//			System.out.println(  "dCnt[i] : "  + dCnt[i]);
//
//			System.out.println( dCnt [num.charAt(i)-'0'] );
//			System.out.println( num.charAt(i)-'0');
			
			if (num.charAt(i)-'0' != dCnt [i]) { //
				return false ;
			}
			
		}
		return true ;
	}
}
