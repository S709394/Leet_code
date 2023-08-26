package com.leetcode;

public class Leetcode_459_try4 {
	public static void main(String[] args) {
		String str = "abcabc";
		
		
		System.out.println( str.substring( 0 , 4));
		System.out.println(repeatedSubstringPattern(str));
	}

	public static boolean repeatedSubstringPattern(String s) {

		if (s == null | s.length() == 0)
			return true;

		int n = s.length();
//		System.out.println( "n:" + n ); //test 
 
		for (int len = 1; len <= n / 2; len++) {
			if (n % len != 0) {
				System.out.println("continue" + " : len : " + len);
				continue;
			}

			String pattern = s.substring(0, len );
//			System.out.println("pattern: "+pattern); // test

			int i = len, j = i + len - 1;

			while (j < n) {
				String toCompare = s.substring(i, j+1);
//				System.out.println("toCompare :" + toCompare); // test

				if (!pattern.equals(toCompare)) {
					
					System.out.println("break");
					break;
				}
				i += len;
				j += len;

			}
			
			if (i == n) {
				return true;
			}

		}
		return false;
	}

}
