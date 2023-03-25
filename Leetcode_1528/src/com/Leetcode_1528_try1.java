package com;

public class Leetcode_1528_try1 {
	public static void main(String[] args) {
		
	}

	public String restoreString(String s, int[] indices) {
		//easy
		char [] cArr = new char [indices.length];
		
		for (int i = 0 ; i < indices.length ; i ++) {
			
			cArr[indices [i]] = s.charAt(i);
		}
		
		return String.valueOf(cArr);
	}
}
