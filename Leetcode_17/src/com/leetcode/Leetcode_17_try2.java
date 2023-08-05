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
 * */

package com.leetcode;

import java.util.LinkedList;
import java.util.List;

/*Idea    From  : https://leetcode.com/problems/letter-combinations-of-a-phone-number/discuss/8064/My-java-solution-with-FIFO-queue
  *  LinedList
  *  
  *  Character.getNumericValue
  *  
  *  LinkedList.peek(); // "Looking the 1st elem  but not remove it "
  *   
  *   
  *   Can not fully understand, try  the 3rd time
  * */



public class Leetcode_17_try2 {
	public static void main(String[] args) {
		String digits = "786";
		
//		String digits = "239";
		
		
		letterCombinations(digits);
	}
	
	static  List<String> letterCombinations(String digits) {
		
		//For Input: digits = "" ;
//		List <String> LS= new LinkedList<String>();  // wrong
		LinkedList <String> LS= new LinkedList<String>();  
		if(digits.length()==0) {
			return LS;
		}
		
		String [] mapping = new String [] { 
			 "0","1","abc", "def" , "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
		};
		//??? no idea
		LS.add("");
		
		for (int i = 0 ; i < digits.length();i++) {
			
			//set the x to the number of the one user presCntss
			int x =Character.getNumericValue(digits.charAt(i));
			
			System.out.println("int x : " + x);//test
			System.out.println("LS.peek().length():" +LS.peek().length());//test
			
			while (LS.peek().length()==i) {
//				System.out.println("LS .size() (before :"+LS.size());//test
					String t = LS.remove();
					
					System.out.println("String t :"+t);//test
					System.out.println("LS .size()  (after:"+LS.size());//test
				
				for(char s : mapping[x].toCharArray()) {				
//					System.out.println(s);//test
					LS.add(t+s);
					System.out.println("t+s:" + t+ s);//test
				}	
			}
		}
		return LS;
		
	}
}
