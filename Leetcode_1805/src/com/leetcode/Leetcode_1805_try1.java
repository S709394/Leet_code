package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_1805_try1 {
	public static void main(String[] args) {
		String word = "sh8s0";
		System.out.println(numDifferentIntegers(word));
	}

	public static int numDifferentIntegers(String word) {

		int wLen = word.length();
//		System.out.println(word.charAt(0) - '0'); // test

		Set<Long> intSet = new HashSet<>();

//		int curLeft = 0 ;
//				
//		int curRight =0;

		boolean found = false;

		long curNum = 0;
		for (int i = 0; i < wLen; i++) {

			if (word.charAt(i) - '0' >= 0 && word.charAt(i) - '0' <= 9) {
				if (found == false) {
					curNum += (word.charAt(i) - '0');
					found = true;
				} else {
					curNum = curNum * 10;
					curNum += (word.charAt(i) - '0');
				}
			} else {
				long addNum = curNum;
				if (found == true) {
					System.out.println("add: " + addNum);
					intSet.add(addNum);
				}

				// add

				curNum = 0;
				found = false;
			}

		}
		if (curNum != 0) {
			// add
			long addNum = curNum;
			System.out.println("add: " + addNum);
			intSet.add(addNum);
		}

		return intSet.size();
	}
}
