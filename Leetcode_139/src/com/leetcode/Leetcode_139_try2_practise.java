package com.leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
//import java.util.Stack;

public class Leetcode_139_try2_practise {

	public boolean wordBreak(String s, List<String> wordDict) {
		int wordLen = wordDict.size();
		int strLen = s.length();
		Set<String> set = new HashSet<>();
		boolean[] boolArr = new boolean[strLen+1];

		int minLen = Integer.MAX_VALUE;
		for (String str : wordDict) {
			set.add(str);
			minLen = Math.min(minLen, str.length());
		}

		for (int i = 1; i <= wordLen; i++) {
			for (int j = i + 1; j > 0; j--) {

				if (i - j + 1 < wordLen) {
					continue;
				}
//				System.out.println(s.substring(j - 1, i)); //test 
				System.out.println("j-1 :" + (j - 1));//test 
				System.out.println("i : " + i);//test 
				System.out.println(s.substring(j - 1, i)); //test
				boolArr[i] = boolArr[i - 1] && set.contains(s.substring(j - 1, i));

			}
			if (boolArr[i]) {
				// System.out.println("i:" + i);
				break;
			}
		}
		return boolArr[strLen ] ;
	}
}
