/* 
 * 58. Length of Last Word

Easy

938

77

Add to List

Share
Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 

Constraints:

1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.
*/

/*  Some idea
 * 
 *  trim  to remove the lead and tail whitespace
 *  charAt(i) ;
 * */

package com.leetcode;

public class Try2_Leetcode_58 {
	
	public static void main(String[] args) {
		
		System.out.println( lengthOfLastWord("heell a adwe       "));
	}
	
	 public static int lengthOfLastWord(String s) {
		 String str =s.trim();
		 
		 int lenOfTheLastWord =0;
		 
		 for (int i =str.length()-1 ; i>=0; i--) {
			 
			 if (str.charAt(i)!= ' ') {
				 lenOfTheLastWord++;
			 }else {
				 break;
			 }
			 
		 }
		 
		 
		 return lenOfTheLastWord ;
		 
		 
	 }
}	
