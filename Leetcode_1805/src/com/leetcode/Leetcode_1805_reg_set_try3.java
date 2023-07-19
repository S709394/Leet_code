package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_1805_reg_set_try3 {
	public static void main(String[] args) {
		// to solve this case when the digit at the verylast index
//		String s = "4a123B567a9";

		// leet1234code234
//		String s = "leet4567code234";

		// a1b01c001
		String s = "a1b01c001";
//		String s = "sh8s0";
		System.out.println(numDifferentIntegers(s));
	}

	public static int numDifferentIntegers(String word) {
//try3
		String[] words = word.replaceAll("[A-Za-z]", " ").split("\\s+");

//		for (String aWord  :  words) {  //test 
//			System.out.println(aWord);
//		}
		Set<String> set = new HashSet<>();
		
		for (String str  :  words) { 
//			System.out.println(aWord);
			if(!str.isEmpty()) {
//				System.out.println(str.replaceFirst("^0*", ""));
				set.add(str.replaceAll("^0*", ""));
			}
			
		}

		return set.size();
	}

}
