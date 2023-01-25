package com.leetcode;

public class Leetcode_997_try1 {

	public int findJudge(int N, int[][] trust) {
		
		// 3 people 
		
		// 2 trust 
//		int len = trust.length;

		//from 0 1 2 3
		int[] trusted = new int[N + 1];
		int[] truster = new int[N + 1];

		for (int i = 0; i < trust.length; i++) {
			trusted[trust[i][1]]++;
			truster[trust[i][0]]++;
		}

		for (int i = 1; i <  N+1; i++) {
			if (trusted[i] == N-1 && truster[i] == 0) {
				return i;
			}

		}
		return -1;
	}

}
