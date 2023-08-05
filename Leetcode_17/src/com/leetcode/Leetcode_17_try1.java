/*17. Letter Combinations of a Phone Number
Medium

11016

710

Add to List

Share
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represCntsent. Return the answer in any order.

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

 
 /*Idea   backtrack  
  * 
  *   Does not works so far   meet me at try 2  
  * */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




public class Leetcode_17_try1 {
	
public static void main(String[] args) {
		
		
		String str = "23";
		
		String[]  keyPad = new String []  {"" ,"","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		
		
		
		
		
	}
//	List<String> ans =new ArrayList<>();
	static Map<Character, String> NUMS = new HashMap<Character, String>() {
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
	
	
	
	
	public static List<String> letterCobinations (String digits){
		if(digits.length()==0) {
			return new ArrayList<>();
		}
		
		StringBuilder sb =new StringBuilder();
		List<String> resCnts = new ArrayList();
		
		dfs (sb ,0,digits,NUMS,resCnts);
			
		
		///
		
		return resCnts;
	}
	public static  void dfs(StringBuilder sb , int index,String digits ,Map<Character, String> nums,List<String> resCnts) {
		//the end of the digits
		if(index ==digits.length()) {
			resCnts.add(sb.toString());
			System.out.println("resCnts.add(sb.toString());");
			return;
		}
		
		char digit =digits.charAt(index);
		String options =nums .getOrDefault(digit, digits+"");
		
		for (char option :options.toCharArray()) {
			sb.append(option);
			dfs(sb,index+1,digits,nums,resCnts);
			
			System.out.println( "sb " + sb); //test
			sb.deleteCharAt(sb.length()-1);
			System.out.println( "sb (deleted)" + sb); //test
			
		}
		
		
	}
	
	
	
}
