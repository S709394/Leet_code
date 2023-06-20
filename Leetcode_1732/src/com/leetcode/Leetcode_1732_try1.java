package com.leetcode;

public class Leetcode_1732_try1 {

	public static void main(String[] args) {
		int[] gain = { -5, 1, 5, 0, -7 };
		System.out.println(largestAltitude(gain));
	}

	public static int largestAltitude(int[] gain) {
		int a = 0;

		int max = 0;

		for (int i : gain) {
			a += i;
			if (a > max) {
				max = a;
			}
		}
		return max;
	}

}
