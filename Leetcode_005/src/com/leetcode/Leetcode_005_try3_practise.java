//Idea  : https://leetcode.com/problems/longest-palindromic-substring/solutions/2928/very-simple-clean-java-solution/comments/1312121

package com.leetcode;

public class Leetcode_005_try3_practise {

	public static int startIdx, maxLen;

	public String longestPalindrome(String s) {
		int len = s.length();

		for (int i = 0; i < len; i++) {
			extendPal(s, i, i);
			extendPal(s, i, i+1);

		}
		return s.substring(startIdx , startIdx+maxLen);  //Not sure

	}

	public void extendPal(String s, int j, int k) {
		// Becareful : since  the    j--   is able to reach  -1 at the end   ,  the startIdx = j+1 
		while (j>=0 && k<s.length() && s.charAt(j)== s.charAt(k)) {
			j--;
			System.out.println("j:"+j);
			k++;
		}
		//since the startIdx = j+1    , maxLen should be  (k -j-1 )
		if(maxLen < (k-j-1)) {
			startIdx = j+1 ;
			maxLen = k-j-1;
		}
//		System.out.println(maxLen); //test
		
//		// not good 
//		maxLen = Math.max(maxLen, k-j);
//		System.out.println(maxLen); //test
		
	}
}
