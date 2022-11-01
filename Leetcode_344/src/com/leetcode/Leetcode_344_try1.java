//Runtime: 1 ms, faster than 99.94% of Java online submissions for Reverse String.
//Memory Usage: 54.4 MB, less than 61.14% of Java online submissions for Reverse String.

package com.leetcode;

public class Leetcode_344_try1 {
	public void reverseString(char[] s) {
		int len = s.length;
		int left = 0 ; 
		int right = len-1;
		
		char temp= ' ';
		while (left<right) {
			
			temp = s[left];
			s[left]=s[right];
			s[right]=temp;
			left++ ;
			right--;
		}
		
	}
	
}
