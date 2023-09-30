package com.leetcode;

public class Leetcode_880_try1 {

	public static void main(String[] args) {
		String s = "leet2code";

		System.out.println(decodeAtIndex(s, 10));
	}

	public static String decodeAtIndex(String s, int k) {

		int sLen = s.length();

		int idx = 0;
		int curNum = 0 ; 
		
		
		boolean fullString =  false ;
		while (idx < sLen - 1) {
			int curLen = 0;
			StringBuilder curStr = new StringBuilder();

			int ascii = s.charAt(curLen);
			System.out.println(ascii);  //test 
			
			//
			boolean = isLow
			if    (fullString ==false  &&) {
				
			}
			
			
			if (ascii - 'a' >= 0 && ascii - 'a' < 26) {
				curStr.append((char) ascii);
				System.out.println(curStr);  //test 
			} else  if (ascii - '0' >=48 && ascii - 'a'  <=57) {
				curNum *=10 ; 
				curNum +=  ascii -'0';
				System.out.println( "curNum : " +curNum ); //test
			}

			idx++;
		}

		return "999";
	}
}
