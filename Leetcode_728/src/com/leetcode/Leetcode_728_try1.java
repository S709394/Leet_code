package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_728_try1 {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22 };
		int left = 1, right = 22;

		int a = 128;

		System.out.println(isSelfDividing(a));
	}

	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<>();

		for (int i = left; i <= right; i++) {
			if (isSelfDividing(i)) {
				list.add(i);
			}

		}

//		while 
		return list;

	}

	public static boolean isSelfDividing(int num) {

		int regNum = num;

		while (num >= 1) {

			int div = num % 10;
//			System.out.println("div : "+div);//test
			if (div == 0)
				return false;
			if (regNum % div != 0) {
				return false;
			}
			num /= 10;
//			System.out.println(num);//test 

		}
		return true;

	}
}
