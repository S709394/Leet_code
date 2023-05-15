package com.leetcode;

public class Leetcode_1295_try2 {
	public static void main(String[] args) {
		int nums[] = { 555, 901, 482, 1771 };

		System.out.println(findEvenNumbers(nums));
	}

	public static int findEvenNumbers(int[] nums) {

		int cnt = 0;
		for (int i : nums) {

			if ((i > 9 && i <= 99) || i > 999 && i <= 9999 ||  i == 100000) {
				cnt++;
			}
		}
		return cnt;
	}
}
