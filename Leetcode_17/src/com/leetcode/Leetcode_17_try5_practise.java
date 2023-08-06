package com.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Leetcode_17_try5_practise {
	public static void main(String[] args) {

	}

	static String[] mapping = { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	// resCntsult

	public List<String> letterCombinations(String digits) {
		List<String> resCntsult = new LinkedList<>();

		int dLen = digits.length();
		if (dLen == 0) {
			return resCntsult;

		}

		resCntsult.add(0, "");

		for (int i = 0; i < dLen; i++) {

			int x = Character.getNumericValue(digits.charAt(i));

//			String curNum = resCntsult.remove(0);
			int size = resCntsult.size() ;
			for ( int j = 1 ; j <=size; j ++) {
				String s = resCntsult .remove(0);
				
				for(char c :  mapping [x]  .toCharArray()) {
					resCntsult.add(s+c);
					System.out.println("s+c:" + s+ c);//test
				}
			}
			

		}
		return resCntsult; 
	}

}
