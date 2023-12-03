package com.leetcode;

import java.util.Arrays;

public class Leetcode_1160_try1 {
	public static void main(String[] args) {
		String[] words = { "cat", "bt", "hat", "tree" };
		String chars = "atach";
		System.out.println(countCharacters(words, chars));
	}

	public static int countCharacters(String[] words, String chars) {
//	try1	
		int[] cnt = new int[26];

		for (char c : chars.toCharArray()) {
			cnt[c - 'a']++;
		}

		int ans = 0;
		for (String word : words) {
			int len = word.length();
			if (wordInChars(cnt, word)) {
				ans += len;
			}

		}
		return ans;
	}

	public static boolean wordInChars(int[] cntArr, String word) {

//		int [] cntCopy  = new Arrays .copyOf(null, 0) ;

		int[] cntCopy = new int[26];

		for (int i = 0; i < 26; i++) {
			cntCopy[i] = cntArr[i];
		}
		for (char c : word.toCharArray()) {
			cntCopy[c - 'a']--;
			if (cntCopy[c - 'a'] < 0) {
				return false;
			}
		}
		return true;
	}
}
