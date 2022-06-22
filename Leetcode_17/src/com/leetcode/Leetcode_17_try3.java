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
 * */

/*Idea :
 * 
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/discuss/8064/My-java-solution-with-FIFO-queue/205699
 *   
 *   Methods :
 *   
 *   Character.getNumericValue ( char c )  ;   //  char - > int
 *   
 *   String . toCharArray()    // string - > CharArray
 *   
 * */

package com.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Leetcode_17_try3 {
	static String []mapping  = {"0","1","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	
	public static void main(String[] args) {
		
		//case
		String digits = "239";
		
		
		List<String>  L = letterCobinations (digits);
	}
	public static List<String> letterCobinations (String digits){
		
		List <String>  result = new LinkedList<String>();
		if (digits.length()==0) {
			return result;
		}
		
		//  for the  String s = result.remove(0);
		result.add (0,"");
		
		/*A .                             ""
		 *B.                  a            b         c
		 *C.              ad ae af     bd be bf     cd ce cf
		 *
		 *D.      adw adx ady adz
		 *		  aew aex aey aez 
		 *		  ...
		 *        ...                     ...          ... 
		 *		  
		 * */
		
		
		
		for ( int i = 0 ; i < digits.length();i++) {
			int x =  Character.getNumericValue( digits.charAt(i));
			
			int size = result.size();
			
			for (int k = 1; k<= size ; k ++ ) {
				
				String s = result.remove(0);
				
				for (char c : mapping[x].toCharArray()) {
					result.add(s + c);
					System.out.println("t+s:" + s+ c);//test
				}
			}
		}
		
		return result;
		}
	
}	
