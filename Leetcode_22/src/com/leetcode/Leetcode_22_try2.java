/*22. Generate Parentheses
Medium

13521

515

Add to List

Share
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]
 

Constraints:

1 <= n <= 8
Accepted
1,102,963
Submissions
1,561,523
 * 
 * */


/*idea : Using char  Array   + backtrack
 * 
 * 1. The   elem 's length  ==  max *2
 * 2.  Open == Close == max when we add the str into the List 
 *
 * 
 * 
 * 
 * 
 * Methods :   
 * 
 *  new String ( Char Array )
 * 
 * */

//

package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_22_try2 {
	static List <String> resList = new ArrayList<String> ();
	
	public static void main(String[] args) {
//		 List <String > res = new ArrayList <String> () ;
		 
		 
	}
	
	public static List<String> generateParenthesis(int n) {
		 
		 recursiveFuction (new char [n*2],0,0,0,n);
		 
		 return resList;
	}
	
	public static  void recursiveFuction( char [] arr,int currIndex, int opened , int closed , int toBeOpened) {
//		if (currIndex == arr.length) { //try later
		
		if (currIndex == arr.length) {
//			resList.add(arr.toString());//wrong
			resList.add(new String(arr));
			return;
		}
		
		if( opened>closed) {
			arr[currIndex]= ')';
			recursiveFuction (arr,currIndex+1,opened,closed+1,toBeOpened);
		}
		if(toBeOpened !=0) {
			arr[currIndex]='(';
			recursiveFuction (arr,currIndex+1,opened+1,closed,toBeOpened-1);
		}
	}
	
	
}
