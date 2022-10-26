//Idea  :

//  t.indexOf(c, fromIndex)  
//  Using fromIndex +1  to find the    char c in the  string s   one by one 
//  (fromIndex) :   the char after the char we just found 
// for example : 

//String s = "abc", t = "ahbgdc";

//  the 1st loop start in idx :0  
// then we found a in the   idx : 0 
// and update fromIndex to the idx :1  in the 2nd loop

package com.leetcode;

public class Leetcode_392_try2_charAt {
	public static void main(String[] args) {
		String s = "abc", t = "ahbgdc";
		System.out.println(isSubsequence(s, t));
	}

	public static boolean isSubsequence(String s, String t) {

		int startIndex = 0;
		for (char c : s.toCharArray()) {

			startIndex = t.indexOf(c, startIndex);

			if (startIndex == -1) {
				return false;

			}
			// Start in the next char after the find the current char
			startIndex++;

//            System.out.println("fromIndex(after/"+startIndex); //test
		}

		return true;
	}

}
