package com.leetcode;

import java.util.Arrays;

public class Leetcode_455_try2_greedy_practise {
	public static void main(String[] args) {
		int[] g = { 1, 2, 3 }, s = { 1, 1 };
		System.out.println(findContentChildren(g, s));
	}

	public static int findContentChildren(int[] g, int[] s) {
		// cnt : the count of the child got the cookie they want
		int cnt = 0;
		Arrays.sort(g);
		Arrays.sort(s);

//		for(int i  : g) {  //test 
//			System.out.println(i);
//		}

		// kidIdx
		int k_Idx = g.length - 1;

		// cookieIdx
		int c_Idx = s.length - 1;

		while (k_Idx >= 0 && c_Idx >= 0) {
			if (g[k_Idx] > s[c_Idx]) {
				k_Idx--;
			}

			else if (g[k_Idx] <= s[c_Idx]) {
				
				k_Idx--; c_Idx--;
				cnt++;
			}

		}

//		for (int i =s.length-1;  i >=0 ; i --) {
//			
//			
//		}

		return cnt;
	}
}
