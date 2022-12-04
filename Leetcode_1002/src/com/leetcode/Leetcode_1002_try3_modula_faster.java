package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_1002_try3_modula_faster {
	// from :
	// https://leetcode.com/problems/find-common-characters/submissions/853567231/
	// A better version  with good val names :try4 try5
	
	public List<String> commonChars(String[] words) {
		int[] ans = new int[26];
		Arrays.fill(ans, 200);
		for (String word : words) {
			helper(ans, word);
		}
		List<String> resCntsult = new ArrayList<>();
		for (int i = 0; i < 26; i++) {
			while (ans[i] > 0) {

				ans[i]--;

				resCntsult.add(String.valueOf((char) ('a' + i)));
			}

		}
		return resCntsult;
	}

	public void helper(int[] ans, String word) {
		int[] cnt = count(word);
		for (int i = 0; i < 26; i++) {
			ans[i] = Math.min(ans[i], cnt[i]);
		}
	}

	public int[] count(String word) {
		int[] cnt = new int[26];
		for (int i = 0; i < word.length(); i++) {
			cnt[word.charAt(i) - 'a']++;
		}
		return cnt;
	}
}
