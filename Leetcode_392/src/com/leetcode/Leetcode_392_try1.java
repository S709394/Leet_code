//Try using stack   
//Does not works  

package com.leetcode;

import java.util.ArrayList;
import java.util.List;
//import java.util.Stack;

public class Leetcode_392_try1 {
	public static void main(String[] args) {
		String s = "abc", t = "ahbgdc";
		System.out.println(isSubsequence (s,t));
	}

	public static boolean isSubsequence(String s, String t) {
		int sLen =s.length();
		
		if(sLen==0) {
			return true;
		}
		List<Character> list = new ArrayList <> ();
		
		for (char c : s.toCharArray()) {
			list.add(c);
		}
		System.out.println(list.size());
		
		
		
		for (char c : t.toCharArray()) {
			if(list.contains(c)){
//				System.out.println( list.get(sLen));
				list.remove(c);
				sLen--;
			}
			if(list.isEmpty()) {
				return true;
			}
		}
		
		return false ;
		
	}
}
