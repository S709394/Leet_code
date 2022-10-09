// Runtime: 0 ms, faster than 100.00% of Java online submissions for Keyboard Row.
//Memory Usage: 41.9 MB, less than 56.68% of Java online submissions for Keyboard Row.
//

package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_500_try1_hardCodeString {
	// "QWERTYUIOPqwertyuiop","ASDFGHJKLasdfghjkl","ZXCVBNMzxcvbnm"

	String[] strArr = { "QWERTYUIOPqwertyuiop", "ASDFGHJKLasdfghjkl", "ZXCVBNMzxcvbnm" };

	public String[] findWords(String[] words) {
		List<String> res = new ArrayList<>();
		// the word in witch row 0/1/2 , -1 means not found
		int rowNum = -1;
		for (String s : words) {

			rowNum = getRowNumber(s.charAt(0));
			
			
			//The first char is not in anyOf the strArr;
			if (rowNum == -1) {

				// skip this word ;
				continue;
			} else {
			//Add the word unless we found a char in this word not share the same "rowNum"
				boolean add = true;
				for (char c : s.toCharArray()) {
					if (strArr[rowNum].indexOf(c) == -1) {
						add = false;
						
						//break ;  // I add this line but make it slow and I do not know why  :(
					}
				}
				if (add == true) {
					res.add(s);
				}
			}

		}
		return res.toArray(new String[res.size()]);

	}

	public int getRowNumber(char c) {

		for (int rowNum = 0; rowNum < 3; rowNum++) {
			if (strArr[rowNum].indexOf(c) != -1) {

				System.out.println(rowNum); // test

				return rowNum;
			}
		}
		return -1;
	}
}
