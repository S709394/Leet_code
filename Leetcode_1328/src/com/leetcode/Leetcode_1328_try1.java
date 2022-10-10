//Runtime: 0 ms, faster than 100.00% of Java online submissions for Break a Palindrome.
//Memory Usage: 41.9 MB, less than 66.45% of Java online submissions for Break a Palindrome.

package com.leetcode;

public class Leetcode_1328_try1 {
	public static void main(String[] args) {
//		String  s =  "aba";
//		String  s =  "aaaaa";
		String  s =  "cac";
		
		System.out.println(breakPalindrome (s));
	}
	
	public static String breakPalindrome(String palindrome) {
		
		int len  = palindrome.length();
		
		if(len <2) return "";
		
		char [] charArr = palindrome.toCharArray();
		
		// (len /2 ) -1
		for (int i =0 ; i <(len/2) ; i ++) {
			if (charArr[i]!='a') {
				charArr[i]='a';
//				return charArr.toString();  //wrong 
				return String .valueOf(charArr);
			}
		}
		
		charArr[len-1]='b';
		
		
//		return charArr.toString();  //wrong 
		return String .valueOf(charArr);
		
	}
}
