package com.leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
//import java.util.Stack;

public class Leetcode_139_try2_practise {

	public boolean wordBreak(String s, List<String> wordDict) {

		int wordLen = wordDict.size();
		Set<String> set = new HashSet<>();
//		boolean  

		int minLen = Integer.MAX_VALUE;
		for (String str : wordDict) {
			set.add(str);
			minLen = Math.min(minLen, str.length());
		}

		for (int i = 1; i <= wordLen; i++) {
			
			for (int j = i +1)

		}
	}
}
