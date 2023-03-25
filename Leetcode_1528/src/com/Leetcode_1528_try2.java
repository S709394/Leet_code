package com;

public class Leetcode_1528_try2 {

	public static void main(String[] args) {
		String s = "codeleet";
		int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
		System.out.println( restoreString (s, indices));

	}

	public static  String restoreString(String s, int[] indices) { 
		//try2 
		char[] cArr = new char[indices.length];

		for (int i = 0; i < indices.length; i++) {
			cArr[indices[i]] = s.charAt(i);
		}

		return String.valueOf(cArr);
	}
}
