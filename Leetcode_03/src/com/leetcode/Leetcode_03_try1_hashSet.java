// Runtime: 15 ms, faster than 53.86% of Java online submissions for Longest Substring Without Repeating Characters.
//Memory Usage: 46.1 MB, less than 33.04% of Java online submissions for Longest Substring Without Repeating Characters 
//

package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_03_try1_hashSet {
	public static void main(String[] args) {
		String s = "pwwkew";
		
		
	}
	 public static int lengthOfLongestSubstring(String s) {
		 Set <Character> set = new HashSet <> () ;
		 
		 int left = 0 ; int right = 0 ; 
		 int maxLen = 0 ;
		 char [] cArr = s.toCharArray();
		 while (right < s.length()) {
			 if ( !set .contains(cArr[right])) {
				 set.add(cArr[right]) ;
				 right ++ ;
				 
				 maxLen = Math.max(set.size(), maxLen) ;
				 
			 }else {
				 set .remove(cArr[left]) ;
				 left ++ ;
			 }
		 }
		 return maxLen ;
		 
	 }
}
