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


/*idea : Using String builder
 * 
 * 1. The str  elem 's length  ==  max *2
 * 2.  Open == Close == max when we add the str into the List 
 *
 * 
 * 
 * 
 * 
 * Methods :  stringBuilder .append( str);
 * sb.setLength(sb.length()-1);     // Not sure yet  , but works well
 * 
 * */

// THIS ONE does not works sofar  (StringBuilder)

package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_22_try1 {
	static int cnt =0;  //test
	public static void main(String[] args) {
//		List<String > res  = new ArrayList <>();
//		helper (res, new StringBuilder(),0,0,n);
		
		
		
		List <String >  ls= new ArrayList<String>();
		ls=generateParenthesis(3);
		
		System.out.println(ls);
		
//		System.out.println("cnt :" + cnt  );//test
	}
	
	
	
	
	
	public static List<String> generateParenthesis(int n) {
	        List <String> resList = new ArrayList<String> ();
	        StringBuilder sb  = new StringBuilder();
	        
	        helper (resList , sb.append(""),0,0,n);
	        return resList;
	}
	
	public static void helper (List <String> res , StringBuilder sb, int open , int close , int max) {
//		if (open ==n &&close == n ) { // not this
		
//		cnt++;
//		System.out.println("cnt :" + cnt  );
		
		
		// To make sure the length
		if (sb.length()==max*2 ) {	
			res.add(sb.toString()); 
			return ;
		}
		
		if(open<max) {
			helper( res, sb.append("("), open+1, close, max);
//			System.out.println(sb.toString());  //test
			sb.setLength(sb.length()-1);
		}
		
		if (close<open) {
			
			helper( res, sb.append(")"), open, close+1, max);
//			System.out.println(sb.toString());  //test
			sb.setLength(sb.length()-1);
		}
		
		
		
		
		
	}
	
}
