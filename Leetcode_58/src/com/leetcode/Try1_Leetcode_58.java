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

public class Try1_Leetcode_58 {
	
	public static void main(String[] args) {
//		
	//1. test code 
//			 
		
		
		System.out.println( lengthOfLastWord("heell a adwe       "));
		System.out.println( lengthOfLastWord("heell a aasdadad       "));
		
		System.out.println( lengthOfLastWord("heell a 1       "));
		
		
		
		
	}
	
	public static int lengthOfLastWord(String s) {
		
		String trimed = s.trim();
//		System.out.println("The string:|"+s.trim()+"|");//test
		
		
//		System.out.println (trimed.length()); //test
		int lenOfLastWord=0;
		for (int i= trimed.length()-1;i>=0;i--) {
			
//			System.out.println("s.charAt(i):|"+s.charAt(i)+"|");//test
			
			if(trimed.charAt(i)!=' ') {
				lenOfLastWord++;
				
				
				
			}else {
				break;
			}
		}
		
		return lenOfLastWord;
	}
	
	
	
}
