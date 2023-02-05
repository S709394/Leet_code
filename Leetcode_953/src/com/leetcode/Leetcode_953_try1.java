package com.leetcode;

import java.util.HashMap;
import java.util.Map;

//does not works so far 
public class Leetcode_953_try1 {
	public boolean isAlienSorted(String[] words, String order) {
		Map<Character, Integer> mapping = new HashMap<>();

		for (int i = 0; i < order.length(); i++) {
			mapping.put(order.charAt(i), i);
		}

		String[] decrypt = new String[words.length];

		for (int i = 0; i < words.length; i++) {
			String decryptWord = "";

			for (int j = 0; j < words[i].length(); j++) {
				decryptWord += (char) ('a' + mapping.get(words[i].charAt(j)));
			}
			decrypt[i] = decryptWord;
		}
		for (int i = 0; i < decrypt.length - 1; i++) {
			if (decrypt[i].compareTo(decrypt[i + 1]) > 0) {
				return false;
			}

		}
		return true;
	}
}
