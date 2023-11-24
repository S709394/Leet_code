package com.leetcode;

//import java.util.Arrays;

public class Leetcode_2423_try1 {
	public static void main(String[] args) {

	}

	public boolean equalFrequency(String word) {
		
		//does not works so far 
		// word.length >=2 , <=100

		int[] charCnt = new int[26];
//		Arrays.fill(charCnt, 0);
		int len = word.length();
		for (int i = 0; i < len; i++) {

			charCnt[word.charAt(i) - 'a']++;

		}
		for (int i = 0; i < 26; i++) {
			int cnt = 0;
			if (cnt == 0 && charCnt[i] != 0) {
				cnt = charCnt[i];
			}

			if (charCnt[i] != 0) {
				if (charCnt[i] != 0 && charCnt[i] != cnt) {
					return false;
				}
			}

		}
		return true;
	}
}
