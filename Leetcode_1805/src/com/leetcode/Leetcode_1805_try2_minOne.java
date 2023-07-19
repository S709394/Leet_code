package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_1805_try2_minOne {
	public static void main(String[] args) {
		//to solve this case   when the  digit at the verylast index 
		String s = "4a123B567a9";
		
		//leet1234code234
//		String s = "leet4567code234";
		
		//a1b01c001
//		String s = "a1b01c001";
//		String s = "sh8s0";
		System.out.println(numDifferentIntegers(s));
	}

	public static int numDifferentIntegers(String word) {
		
		//does not works well when the numbers  are too long 

		int wLen = word.length();
//		System.out.println(word.charAt(0) - '0'); // test

		Set<Long> intSet = new HashSet<>();

//		int curLeft = 0 ;
//				
//		int curRight =0;

		boolean found = false;

		long curNum = -1;
		for (int i = 0; i < wLen; i++) {

			if (word.charAt(i) - '0' >= 0 && word.charAt(i) - '0' <= 9) {
				if (found == false) {
					if( curNum==-1 ) {
						curNum =(word.charAt(i) - '0') ;
					}else {
						curNum += (word.charAt(i) - '0');
					}
					
					found = true;
				} else {
					curNum = curNum * 10;
					curNum += (word.charAt(i) - '0');
				}
			} else {
				long addNum = curNum;
				if (found == true) {
//					System.out.println("add: " + addNum);
					intSet.add(addNum);
				}

				// add
				//reset
				curNum = -1;
				found = false;
			}

		}
		if (curNum != -1) {
			// add
			long addNum = curNum;
//			System.out.println("add: " + addNum);
			intSet.add(addNum);
		}

		return intSet.size();
	}
}
