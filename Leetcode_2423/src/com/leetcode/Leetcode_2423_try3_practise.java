package com.leetcode;

public class Leetcode_2423_try3_practise {
	public static void main(String[] args) {
//		String word = "abc";
		// aca
		String word = "aca";
		System.out.println(equalFrequency(word));
	}

	public static boolean equalFrequency(String word) {
		int[] charCnt = new int[26];
		int len = word.length();
		for (int i = 0; i < len; i++) {
			charCnt[word.charAt(i )- 'a']++;
		}

		for (int i = 0; i < 26; i++) {
			charCnt[i]--;
			if (isEqual(charCnt)) {
				return true;
			}
			charCnt[i]++;

		}
		return false;
	}

	// isEquil
	public static boolean isEqual(int[] intArr) {
		int num = 0;
		for (int n : intArr) {
			if (n == 0) {
				continue;
			} else if (num == 0) {
				num = n;
			} else if( n!=num){
				return false ;
			}
		}
		return true;
	}
}
