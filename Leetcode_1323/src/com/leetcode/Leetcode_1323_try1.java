//Idea   :  


//Integer .toString ()  // not cool
//char [] cArr = String .valueOf(n) .toCharArray();
//Integer.parseInt(new String (cArr));

package com.leetcode;

public class Leetcode_1323_try1 {
	public static void main(String[] args) {
		int n = 9654;
		
		System.out.println( maximum69Number ( n));
	}
	
	public static int maximum69Number (int n) {
       
		
		
		char [] cArr = String .valueOf(n) .toCharArray();
		int sLen = cArr.length;
		
		boolean done = false ;
		for (int i = 0 ; i < sLen && done==false ; i ++) {
//			if (s.charAt(i)=='6') {
//				s.charAt(i) ='9'
//			}
			if (cArr[i]=='6') {
				cArr[i]='9';
				done=true;
				break; 
			}
		}
		
		//v1.0
//		return Integer.valueOf(new String (cArr));//  works ok 
		
		//v1.2
		return Integer.parseInt(new String (cArr));
		
    }
}
