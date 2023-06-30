//
//Runtime
//9 ms
//Beats
//70.18%
//Memory
//43.5 MB
//Beats
//60.64%

//Idea :
package com.leetcode;

import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class Leetcode_139_try1 {

	public boolean wordBreak(String s, List<String> wordDict) {
		//try1
		Set<String> set = new HashSet<>();
		// base case   Do not need to have these lines  in 139
//		if (s == null || s.length() == 0 || wordDict == null || wordDict.size() == 0) {
//			return false;
//		}
		int sLen = s.length();
		
		
		// DP :boolArr  store it one by one  
		// boolArr[sLen]  represCntsent the resCnts we are going to return
		
		boolean[] boolArr = new boolean[sLen + 1];

		boolArr[0] = true;

		int wordMinLen = Integer.MAX_VALUE; // need to update

		for (String word : wordDict) {
			wordMinLen=Math.min(wordMinLen, word.length());

			set.add(word);
		}
//		System.out.println("wordMinLen"+wordMinLen); //test
		// 
		for (int i = 1; i <= sLen; i++) {
//		for (int i = 1 ; i <= sLen-wordMinLen; i++) {
			// wordMinLen
			for (int j = i + 1; j > 0; j--) { // does not well
//				for (int j =i+1;j>0 ;j-- ) {  // does not well
//			for (int j =i+wordMinLen;j>0;j-- ) {
//				if (j >= wordMinLen) {

				
				//Do not have to add this , but a little bit faster
				if (j - 1 + i < wordMinLen) {
//					System.out.println("continue"); //test 
					continue;
				}
				boolArr[i] = boolArr[j- 1] && set.contains(s.substring(j - 1, i));
				
				//test code 
//				System.out.println("j-1 :"  + (j-1) );
//				System.out.println("i : " +  i);
//				System.out.println(s.substring(j - 1, i));
				
				
				//end condition
				if (boolArr[i]) {
					System.out.println("i:" + i);
					break;
				}

//				}

			}

		}
		return boolArr[sLen];
	}

}
