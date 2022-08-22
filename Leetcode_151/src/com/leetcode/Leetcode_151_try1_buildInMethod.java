/*151. Reverse Words in a String
Medium

3719

4078

Add to List

Share
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 

Constraints:

1 <= s.length <= 104
s contains English letters (upper-case and lower-case), digits, and spaces ' '.
There is at least one word in s.
 

Follow-up: If the string data type is mutable in your language, can you solve it in-place with O(1) extra space?*/

/*
 * Idea:   find
 * */


/*Runtime: 2 ms, faster than 99.95% of Java online submissions for Reverse Words in a String.
Memory Usage: 42.9 MB, less than 84.76% of Java online submissions for Reverse Words in a String.*/

package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Leetcode_151_try1_buildInMethod {
//	//v2.0 Using  build  trim and 
//	
//	
//	/*Runtime: 10 ms, faster than 62.23% of Java online submissions for Reverse Words in a String.
//Memory Usage: 43.7 MB, less than 57.19% of Java online submissions for Reverse Words in a String.*/
//	public String reverseWords(String s) {
//		
//		// regex         meaning        "more then 1 spaces"
//		String [] words = s.trim().split(" +");
//		
//		Collections.reverse(Arrays.asList(words));
//		
//		return  String.join(" ", words);
//		
//	}
	
	//v1.0
	public String reverseWords(String s) {
		StringBuilder  sb =  new StringBuilder();
		for (int start = s.length()-1;start>=0;start--) {
			if(s.charAt(start)==' ') {
				continue;
			}
			
			int end = start;
			
			while (start>=0 && s.charAt(start)!=' ') {
				start --;
			}
			
			
			System.out.println("start:"+start+1 + "\n end + 1"+ end+1);
			sb.append(s.substring(start+1,end+1)) .append(' ');
			
			
			//removed the last  ' '  
			if(sb.length()>0) {
				sb.setLength(sb.length()-1);
			}
		}
		return sb.toString();
		
	}
}
