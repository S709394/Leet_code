package com.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Leetcode_17_try4 {
	
	
//	try4  doese not works 
	public static void main(String[] args) {

	}

//	static List <String >  mapping= new  LinkedList <> () ;

	// "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
	static String[] mapping = { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static List<String> letterCobinations(String digits) {
		List<String> res = new LinkedList<String>();
		if (digits.length() == 0) {
			return res;
		}
		res.add(0,"");
		int digitLen = digits.length();
		for (int i = 0; i < digitLen; i++) {
			int x = Character.getNumericValue(digits.charAt(i));

			int resSize = res.size();
 
			for (int j = 1; j <= resSize; j++) {

				String preStr = res.remove(0);

				for (char c : mapping[x].toCharArray()) {
//					System.out.println();
					
					String newNum = preStr + c ;
//					System.out.println(newNum);
					res.add(newNum);
					

				}

			}

		}

		return res;
	}
}
