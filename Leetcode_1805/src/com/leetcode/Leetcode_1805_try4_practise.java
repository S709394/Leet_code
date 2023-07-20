package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_1805_try4_practise {
	public static void main(String[] args) {
		// to solve this case when the digit at the verylast index
//		String s = "4a123B567a9";

		// leet1234code234
//		String s = "leet4567code234";

		// a1b01c001
		String s = "a1b000c001";
//		String s = "sh8s0";
		System.out.println(numDifferentIntegers(s));
	}

	public static int numDifferentIntegers(String word) {
		//try4
		Set<String> set = new HashSet<>();
		String[] words = word.replaceAll("[a-zA-z]", " ").split("\\s+");
		
		
		for (String str : words) {
			
//			System.out.println( str.replaceAll("^0*", ""));
//			System.out.println( str);
			
			// for the   "000"  or "00"
			
//			set.add(str.replaceAll("^0*", ""));
			if(!str.isEmpty()) {
				set.add(str.replaceAll("^0*", ""));
			}
			
		}
		return  set.size() ;
	}
}
