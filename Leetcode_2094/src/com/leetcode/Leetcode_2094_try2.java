package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_2094_try2 {
	public static void main(String[] args) {
		int nums[] = { 1, 3, 5, 2 };

		System.out.println(findEvenNumbers(nums));
	}

	public static int[] findEvenNumbers(int[] digits) {
		int[] cnt = new int[10];

		for (int i : digits) {
			cnt[i]++;
			
		}

		List<Integer> res = new ArrayList<>();

		for (int i = 100; i < 1000; i += 2) {

			int curCnt[] = new int[10];

			String numStr = i + "";

			for (int j = 0; j < 3; j++) {

				curCnt[numStr.charAt(j) - '0']++;
			}

			boolean isVaild = true;

			for (int j = 0; j < curCnt.length; j++) {
				if (curCnt[j] > cnt[j]) {
					isVaild = false;
					break;
				}

			}

			if (isVaild) {
				res.add(i);
			}
			

		}
		int [] resArr = new int [res.size()];
		
		for (int j =0 ; j < res .size(); j ++  ) {
			resArr[j] = res.get(j);
		}
		return resArr;
	}
}
