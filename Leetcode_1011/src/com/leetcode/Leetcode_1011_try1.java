package com.leetcode;

public class Leetcode_1011_try1 {
	public static void main(String[] args) {
		int weights[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int days = 5;
		System.out.println(shipWithinDays(weights, days));
	}

	public static int shipWithinDays(int[] weights, int days) {
		int left = 0, right = 0;
		for (int weight : weights) {
			left = Math.max(left, weight);

			right += weight;
		}

		while (left < right) {
			int mid = (left + right) / 2, need = 1, cur = 0;

			for (int w : weights) {
				
				//
				if (cur + w > mid) {

					need += 1;
					cur =0;
				}
				cur +=w;
				;
				
			}
			if (need > days) {
				left = mid + 1;
			} else {
				right = mid;
			}

		}
		return left;
	}
}
