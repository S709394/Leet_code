package com.leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
//import java.util.Stack;

public class Leetcode_139_try2_practise {
	public static void main(String[] args) {
		String str = "leetcode" ;
		
	}

	public boolean wordBreak(String s, List<String> wordDict) {
		
		//try2
		Set<String> set = new HashSet<>();
//		int wordLen = wordDict.size();
		int strLen = s.length();
		
		boolean[] boolArr = new boolean[strLen+1];
		boolArr[0] = true;
		
		
		int minLen = Integer.MAX_VALUE;
		for (String str : wordDict) {
			set.add(str);
			minLen = Math.min(minLen, str.length());
		}

		for (int i = 1; i <= strLen; i++) {
			for (int j = i + 1; j > 0; j--) {

				if (j-1+i < minLen) {
					continue;
				}
//				System.out.println(s.substring(j - 1, i)); //test 
				System.out.println("j-1 :" + (j - 1));//test 
				System.out.println("i : " + i);//test 
				System.out.println(s.substring(j - 1, i)); //test
				boolArr[i] = boolArr[j - 1] && set.contains(s.substring(j - 1, i));
				if (boolArr[i]) {
					// System.out.println("i:" + i);
					break;
				}
			}
			
		}
		return boolArr[strLen ] ;
	}
}
