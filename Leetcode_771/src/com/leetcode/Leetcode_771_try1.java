package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_771_try1 {
	public int numJewelsInStones(String jewels, String stones) {
		
		//practise try1 
		Set<Character> set = new HashSet<>();

		int jLen = jewels.length();
		int res = 0;
		for (int i = 0; i < jLen; i++) {
			set.add(jewels.charAt(i));

		}

		for (int i = 0; i < stones.length(); i++) {
			if (set.contains(stones.charAt(i))) {
				res++;
			}
		}
		return res ;
	}
}
