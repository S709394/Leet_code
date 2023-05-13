package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_2094_try3 {
	public static void main(String[] args) {
		int nums[] = { 1, 3, 5, 2 };

		System.out.println(findEvenNumbers(nums));
	}

	public static int[] findEvenNumbers(int[] digits) {
		//try3
		int[] cnt = new int[10];

		for (int i : digits) {
			cnt[i]++;
		}

//		   for (int i = 0 ; i < digits.length ; i ++ ) {
//			   String numStr = digits[i] +"" ;
//			   
//			   cnt [numStr -'0'] ++;
//			   
//		   }

		List<Integer> arrList = new ArrayList<>();

		for (int i = 100; i < 1000; i += 2) {

			String numStr = i + "";
			int[] curCnt = new int[10];

			for (int j = 0; j < 3; j++) {
				curCnt[numStr.charAt(j)-'0']++;

			}
			boolean isVaild = true;
			for (int j = 0; j < curCnt.length; j++) {
				if (curCnt[j] > cnt[j]) {
					isVaild = false;
					break;
				}
			}

			if (isVaild) {
				arrList.add(i);
			}
		}
		int [ ]  res  =   new int [arrList.size()] ;
		for (int i =0 ; i < arrList.size() ; i ++) {
			 res [i]=arrList.get(i );
		}
		
		return res;
	}
}
