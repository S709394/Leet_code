package com.leetcode;

public class Leetcode_2391_try1 {
	public static void main(String[] args) {

	}

	public static int garbageCollection(String[] garbage, int[] travel) {
		// find the last G/P/M in the unit's index from the end

		int gIdx = -1, pIdx = -1, mIdx = -1;

		for (int i = garbage.length - 1; i >= 0; i--) {
			String s = garbage[i];
			for (char c : s.toCharArray()) {
				if (gIdx == -1 && c == 'G') {
					gIdx = i;
				}
				if (pIdx == -1 && c == 'P') {
					pIdx = i;
				}
				if (mIdx == -1 && c == 'M') {
					mIdx = i;
				}
			}

			if (gIdx != -1 && pIdx != -1 && mIdx != -1) {
				break;
			}

		}
		// the len of total garbage item
		int len = 0;
		for (int i = 0; i < garbage.length; i++) {
			len += garbage[i].length();

		}

		int sum = 0;
		for (int i = 0; i < gIdx; i++) {
			sum += travel[i];
		}
		for (int i = 0; i < pIdx; i++) {
			sum += travel[i];
		}
		for (int i = 0; i < mIdx; i++) {
			sum += travel[i];
		}

		return len + sum;
	}
}
