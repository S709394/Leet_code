package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_1002_try2 {
	public static void main(String[] args) {

	}

	public List<String> commonChars(String[] w) {
		int[] toCompareArr = new int[26];
		String startStr = w[0];

		for (int i = 0; i < startStr.length(); i++) {
			toCompareArr[startStr.toCharArray()[i] - 'a']++;
		}

		for (int i = 1; i < w.length; i++) {

			int[] curArr = new int[26];

			for (int j = 0; j < w[i].length(); j++) {
				curArr[w[i].toCharArray()[j] - 'a']++;
			}

			// renew the toCompareArr
			for (int j = 0; j < 26; j++) {
				if (curArr[j] < toCompareArr[j]) {
					toCompareArr[j] = curArr[j];
				}

			}

		}
		List<String> list = new ArrayList<>();

		for (int i = 0; i < toCompareArr.length; i++) {
			while (toCompareArr[i] > 0) {

				toCompareArr[i]--;

				list.add("" + toCompareArr[startStr.toCharArray()[i] - 'a']);
			}

		}
		return list;
	}
}
