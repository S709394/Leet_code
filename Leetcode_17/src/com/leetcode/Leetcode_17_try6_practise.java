package com.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Leetcode_17_try6_practise {
	
	//try6
	// "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
	String[] mapping = { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	//

	public List<String> letterCombinations(String digits) {

		// LinkedList String

		List<String> res = new LinkedList<>();
		int len = digits.length();
		// 1. len == 0
		if (len == 0) {
			return res;
		}
		// Add the 0 and "" into the LinkedList for remove
		res.add(0, "");

		for (int i = 0; i < len; i++) {
			// Using Character .getNumericValue
			int x = Character.getNumericValue(digits.charAt(i));

			int rSize = res.size();
			for (int j = 1; j <= rSize; j++) {

				String preStr = res.remove(0);

				for (char c : mapping[x].toCharArray()) {
					res.add(preStr + c) ;
				}

			}

		}

		

		// outter forloop is for

		return res ;

	}

}
