package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_953_try1 {
	public boolean isAlienSorted(String[] words, String order) {
		Map<Integer, Character> mapping = new HashMap<>();

		for (int i = 0; i < order.length(); i++) {
			mapping.put(i, order.charAt(i));
		}
	}
}
