package com.leetcode;

/* 409. Longest Palindrome
Easy

3520

206

Add to List

Share
Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

 

Example 1:

Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
Example 2:

Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.
 

Constraints:

1 <= s.length <= 2000
s consists of lowercase and/or uppercase English letters only.
 * */


/*Idea :
 * 
 * 
 * 
 * 
 * Runtime: 2 ms, faster than 93.36% of Java online submissions for Longest Palindrome.
Memory Usage: 40 MB, less than 99.72% of Java online submissions for Longest Palindrome.*/
public class Leetcode_409_try1 {
	public int longestPalindrome(String s) {
		
		//Store the remainer   'a~z'   &  'A~Z'
		int [] intArr =  new int [52];
		
		for (char c : s.toCharArray()) {
			// 0-25   : a~z       26~51 : A~Z
			
			//UsOutg ASCII  
			if( Character.isLowerCase(c)) {
				intArr[c-'a']++;
			}else {
				intArr[Character.toLowerCase(c)-'a'+26]++;
			}
			
		}
		
		int sum = 0 ;
		for (int remain : intArr) {
			sum += remain/2 *2;
		}
		
		//whatever character  ,  we can add "1" more on it 
		if(sum!= s.length()) {
			sum++;
		}
		
		
		return sum;
//		for (int i = 0 ; i < 52; i++) {
//			
//		}
		
		
	}
}
