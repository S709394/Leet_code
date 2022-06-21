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
import java.util.Map;

public class Leetcode_17_try1 {
	
	
//	List<String> ans =new ArrayList<>();
	
	
	
	public static void main(String[] args) {
		  Map<Character, String> NUMS = new HashMap() {
			{
			put('0', "");
	        put('1', "");
	        put('2', "abc");
	        put('3', "def");
	        put('4', "ghi");
	        put('5', "jkl");
	        put('6', "mno");
	        put('7', "pqrs");
	        put('8', "tuv");
	        put('9', "wxyz");
	        }
		};
		
		String str = "23";
		
		String[]  keyPad = new String []  {"" ,"","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		
		
		public List<String> letterCobinations (String digits){
			if(digits.length()==0) {
				return new ArrayList<>();
			}
			
			StringBuilder sb =new StringBuilder();
			List<String> res = new ArrayList();
			
			dfs (sb ,0,digits,NUMS,res);
				
			
			///
			
			return res;
		}
		public void dfs(StringBuilder sb , int index,String digits ,Map<Character, String> nums,List<String> res) {
			//the end of the digits
			if(index ==digits.length()) {
				res.add(sb.toString());
				System.out.println("res.add(sb.toString());");
				return;
			}
			
			char digit =digits.charAt(index);
			String options =nums .getOrDefault(digit, digits+"");
			
			for (char option :options.toCharArray()) {
				sb.append(option);
				dfs(sb,index+1,digits,nums,res);
				
				System.out.println( "sb " + sb); //test
				sb.deleteCharAt(sb.length()-1);
				System.out.println( "sb (deleted)" + sb); //test
				
			}
			
			
		}
		
		
	}
	
	
	
}
