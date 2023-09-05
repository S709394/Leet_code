package com.leetcode;

public class Leetcode_2707_try3_dp {
	public static void main(String[] args) {
		String s = "sayhelloworld";
		String[] dictionary = { "hello", "world" };
		
		System.out.println( minExtraChar (s , dictionary));
	}

	public static  int minExtraChar(String s, String[] dict) {
		// do not  fully understand so far 
		//https://leetcode.com/problems/extra-characters-in-a-string/solutions/3990686/step-by-step-beginner-friendly-full-explanation-dp-efficient-easy-to-understand/?envType=daily-question&envId=2023-09-02
		
		//1 <= s.length <= 50
		int [] dp = new int [51];
		
		int n = s.length();
		for (int i = n-1 ; i >= 0; i --) {
			dp [i] = dp [ i+1] + 1;
			
			for ( String w : dict) {
				if(  i  + w.length()<= n  && s .substring( i , i + w.length()    ) .equals(w)) {
					dp[i] = Math.min(dp[ i], dp [i+w.length()]) ;
				}
			}
		}
		return dp [ 0 ] ;
	}
}
