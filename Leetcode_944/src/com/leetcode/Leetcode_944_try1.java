package com.leetcode;


//Runtime
//18 ms
//Beats
//40.54%
//Memory
//48.3 MB
//Beats
//18.47% 

//Not that fast 
public class Leetcode_944_try1 {
	public static void main(String[] args) {
		String[] strs = { "abcd", "bced", "caed" };
		System.out.println(minDeletionSize(strs));
	}

	public static int minDeletionSize(String[] strs) {
		int res = 0;
		// base case

//		if (strs.length == 1) {
//			return strs[0].length();
//		}

		// How many strings?

		int cnt = strs.length;

		int len = strs[0].length();

		for (int i = 0; i < len; i++) {

			for (int j = 1; j < cnt; j++) {

				if (strs[j].charAt(i) - strs[j - 1].charAt(i) <0) {
					res++;
					break;
				}

			}
		}
		return res;
	}
}
