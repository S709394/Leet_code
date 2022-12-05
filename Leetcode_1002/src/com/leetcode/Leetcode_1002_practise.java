package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_1002_practise {
//	\ //from : https://leetcode.com/problems/find-common-characters/submissions/853567231/

	public List<String> commonChars(String[] words) {

		int[] resCntArr = new int[26];
		Arrays.fill(resCntArr, Integer.MAX_VALUE);
		for (String word : words) {
			toMin(resCntArr, word);
		}
		List<String> resList = new ArrayList<>();

		for (int i = 0; i < 26; i++) {
			while (resCntArr[i]-- > 0) {
				resList.add(String.valueOf((char) (i + 'a')));
			}
		}
		return resList;
	}

	// toMin
	public void toMin(int[] cntArr, String str) {
		int[] curCntArr = getCntArr(str);
		for (int i = 0; i < 26; i++) {
			cntArr[i] = Math.min(cntArr[i], curCntArr[i]);
		}

	}

	// getCntArr
	public int[] getCntArr(String str) {
		int[] cntArr = new int[26];

		for (int i = 0; i < str.length(); i++) {
//			cntArr[str.toCharArray()[i] - 'a']++;// too slow 
			cntArr[str.charAt(i) - 'a']++;
		}
		return cntArr;

	}

}
