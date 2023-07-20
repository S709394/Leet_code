package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_1805_try5_practise {
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
		//try5
		Set<String> set = new HashSet<>();

		String[] strs = word.replaceFirst("a-zA-Z", " ").split("\\s+");

		for (String str : strs) {
			if (!str.isEmpty()) {
				set.add(str.replaceAll("^0*", ""));
			}

		}
		return set.size();
	}
}
