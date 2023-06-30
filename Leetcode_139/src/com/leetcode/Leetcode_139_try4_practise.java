package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode_139_try4_practise {
	public static void main(String[] args) {
		List<String> wordDictionary = new ArrayList<String>();
		wordDictionary.add("leet");
		// \",\"code\"
		wordDictionary.add("code");

		String s = "leetcode";
		System.out.println(wordBreak(s, wordDictionary));
	}

	public static boolean wordBreak(String s, List<String> wordDict) {

		int minLen = Integer.MAX_VALUE;
		boolean  [] boolArr = new boolean  [ wordDict.size()+1];
		
		Set<String >  set =new HashSet <> () ;
		
		for (String word : wordDict) {
			minLen = Math.min(minLen,word.length());
			set.add(word);
			
		}
		
//		for (int i = 1 ;)
	}
}
