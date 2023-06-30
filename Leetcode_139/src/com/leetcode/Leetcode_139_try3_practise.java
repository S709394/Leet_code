package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode_139_try3_practise {

	public static void main(String[] args) {
		List<String> wordDictionary = new ArrayList<String>();
		wordDictionary.add("leet");
		// \",\"code\"
		wordDictionary.add("code");

		String s = "leetcode";
		System.out.println(wordBreak(s, wordDictionary));
	}

	public static boolean wordBreak(String s, List<String> wordDict) {
		//try3
		Set<String> set = new HashSet<>();

		int sLen = s.length();

//		int wordLen = wordDict.size();

		boolean[] boolArr = new boolean[sLen + 1];

		boolArr[0] = true;

		int wordMinLen = Integer.MAX_VALUE;

		for (String word : wordDict) {
			set.add(word);
			wordMinLen = Math.min(word.length(), wordMinLen);
		}

		for (int i = 1; i <= sLen; i++) {

			for (int j = i + 1; j > 0; j--) {

				if (j - 1 + i < wordMinLen) {
					continue;
				}
				// test code
				System.out.println("j-1 :" + (j - 1));// test
				System.out.println("i : " + i);// test
				System.out.println(s.substring(j - 1, i)); // test

				boolArr[i] = boolArr[j - 1] && set.contains(s.substring(j - 1, i));
				
				if (boolArr[i] == true) {
					break;
				}
			}

			//

			// find the word in the set
			

		}
		return boolArr[sLen];
	}
}
