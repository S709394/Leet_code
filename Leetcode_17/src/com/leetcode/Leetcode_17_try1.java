/*17. Letter Combinations of a Phone Number
Medium

11016

710

Add to List

Share
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.


 

Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Example 2:

Input: digits = ""
Output: []
Example 3:

Input: digits = "2"
Output: ["a","b","c"]
 

Constraints:

0 <= digits.length <= 4
digits[i] is a digit in the range ['2', '9'].
 * 
 * */package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_17_try1 {
	List<String> ans =new ArrayList<>();
	public static void main(String[] args) {
		
		
		String str = "234";
		
		String[]  keyPad = new String []  {"" ,"","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		
	}
	
	public List<String> letterCobinations (String digits){
		if(digits.length()==0) {
			return ans;
		}
		///
		
		return ans;
	}
}
