package com.leetcode;

public class Leetcode_005_try2_practise {
public static void main(String[] args) {
		
	}
	
	private  int startIdx, maxLen;

	public  String longestPalindrome(String s) {
		int len = s.length();
		if(len<2) {
			return s;
		}
		
		for (int i =0 ; i<len ; i++) {
			extendPal (s,i,i);
			extendPal (s,i,i+1);
		}
		return s.substring(startIdx,startIdx +maxLen); //test 
	}
	
	public  void extendPal(String s,int  j, int k) {
		while (0<=j && k<s.length() && s.charAt(j)==s.charAt(k)) {
			j--;
			k++;
		}
		if(maxLen<k-j-1) {
			startIdx=j+1;
			maxLen= k-j-1;
		}
	}
}
