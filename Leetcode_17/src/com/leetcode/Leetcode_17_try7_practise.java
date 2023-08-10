package com.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Leetcode_17_try7_practise {
	public static void main(String[] args) {

		// try 5 , works well

	}

	static String[] mapping = { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public List<String> letterCombinations(String digits) {

		List<String> res = new LinkedList<>();

		int len = digits.length();

		if (len == 0) {
			return res;

		}
		
		res.add(0,"");

		for (int i = 0; i < len; i++) {
			int x = Character.getNumericValue(digits.charAt(i));

			int resSize = res.size();
			for (int j = 1; j <= resSize; j++) {

				String str = res.remove(i);

				for (char c : mapping [x].toCharArray()) {
					res.add(str+ c) ;
				}

			}

		}
		return res ;
	}

}
