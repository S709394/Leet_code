/*131. Palindrome Partitioning
Medium

7386

232

Add to List

Share
Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.

A palindrome string is a string that reads the same backward as forward.

 

Example 1:

Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]
Example 2:

Input: s = "a"
Output: [["a"]]
*/

/*Idea :
 * Backtrack  
 * Depth first search 
 * 
 * String  :
 * 
 * s.charAt()  
 * 
 * 
 * public boolean isPalindrome(String s, int low, int high)   {}   ; //  from start to end to compare one by one
 * 
 * */

package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_131 {
	
	public static void main(String[] args) {
		String s = "aab";
		System.out.println(partition(s));
	}
	
	 public static List<List<String>> partition(String s) {
		 List<List<String>>list= new ArrayList<List<String>>();
		 dfs(list, new ArrayList<String>(),s,0);
		 
		 return list;
    }
	
	 //dfs  
	 
	 public  static void dfs(List<List<String>>list ,List<String>templist,String s,int start) {
		 if (start == s.length()) {
			list.add (new ArrayList<>(templist));
			
		 }else{
			 for ( int i = start  ; i < s.length();i ++) {
				 if (isPalindrome (s,start,i)) {
//					 templist.add(s.substring(start, i));//wrong
					 templist.add(s.substring(start, i+1));//wrong
					 dfs(list,templist,s,i+1);
					 templist.remove(templist.size()-1);
				 }
			 }
			 
		 }
		 
		 
	 } 
	
	//isPalindrome
	public static   boolean  isPalindrome (String s , int low, int high) {
		
		boolean isPalindrome =true;
		
		while (low< high) {
			if (s.charAt(low++)!=s.charAt(high--)) {
				isPalindrome = false;
			}
		}
		
		
		return isPalindrome;
	}
	
}
