package com.leetcode;

//import java.util.Arrays;

public class Leetcode_2423_try1 {
	public static void main(String[] args) {
		String word = "abc";
		System.out.println(equalFrequency(word));
	}

	public static boolean equalFrequency(String word) {

		// does not works so far
		// word.length >=2 , <=100

		int[] charCnt = new int[26];
//		Arrays.fill(charCnt, 0);
		int len = word.length();
		for (int i = 0; i < len; i++) {
			System.out.println(word.charAt(i) - 'a');
			charCnt[word.charAt(i) - 'a']++;

		}

		int[] cnts = new int[2];

		int numA = -1;
		int numB = -1;

		for (int i = 0; i < 26; i++) {
			if (charCnt[i] == numB) {
				cnts[1]++;
			}
			if (charCnt[i] == numA) {
				cnts[0]++;
			}

			if (numA == -1 && charCnt[i] != 0) {
				numA = charCnt[i];
				cnts[0] = 1;
			}
			if (numB == -1 && numA != -1 && charCnt[i] != 0 && charCnt[i] != numA) {
				numB = charCnt[i];
				cnts[1]++;
			}
		}

		if (numA == -1 || numB == -1 || Math.abs(cnts[0] - cnts[1]) != 1) {
			return false;
		}

//		for (int i = 0; i < 26; i++) {
//			int cnt = 0;
//			int cntAddOne = 0;
//
//			// 1. for cnt
//			if (cnt == 0 && cntAddOne == 0) {
//
//				if (charCnt[i] != 0) {
//					cnt = charCnt[i];
//				}
//
//			}
//			// 2. for cntAddOne ;
//			if (cnt != 0 && cntAddOne == 0) {
//				if (charCnt[i] != 0) {
//					if ((charCnt[i] - cnt) == 1) {
//						cntAddOne = charCnt[i];
//					} else if (charCnt[i] - cnt == -1) {
//
//						cntAddOne = charCnt[i];
//						cnt = cntAddOne - 1;
//					} else {
//						return false;
//					}
//				}
//			}
//			if (cnt != 0 && cntAddOne != 0 && charCnt[i] != cnt) {
//				return false;
//			}

//		}
		return true;
	}
}
