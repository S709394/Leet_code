package com.leetcode;

public class Leetcode_2423_try2_otherMethod {
	public static void main(String[] args) {
//		String word = "abc";
		// aca
		String word = "aca";
		System.out.println(equalFrequency(word));
	}

	public static boolean equalFrequency(String word) {

		// does not works so far
		// word.length >=2 , <=100

		int[] charCnt = new int[26];
//		Arrays.fill(charCnt, 0);
		int len = word.length();
		for (int i = 0; i < len; i++) {
//			System.out.println(word.charAt(i) - 'a');
			//
			charCnt[word.charAt(i) - 'a']++;

		}

		for (int i = 0; i < 26; i++) {
			charCnt[i]--;

			if (isEqual(charCnt)) {
				return true;
			}
			;
			charCnt[i]++;

		}
		return false;
	}

	///
	public static boolean isEqual(int[] data) {
		int n = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == 0) {
				continue;
			} else if (n == 0) {
				n = data[i];
			} else if (n != data[i]) {
				return false;
			}

		}
		return true;
	}
}
