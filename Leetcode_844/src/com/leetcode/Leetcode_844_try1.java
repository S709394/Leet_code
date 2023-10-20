package com.leetcode;

public class Leetcode_844_try1 {
	public static void main(String[] args) {
		String s = "ab#c", t = "ad#c";

//		System.out.println(getString(s));
		System.out.println(backspaceCompare(s, t));
	}

	public static String getString(String str) {
		// from end to begin
		System.out.println("str len :" + str.length());
		int cnt = 0;
		System.out.println("str " + str);
		String newStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println("i" + i);

			System.out.println("str.charAt(i) :" + str.charAt(i));
			if (str.charAt(i) == '#') {
				cnt++;
			} else {
				if (cnt > 0) {
					cnt--;
				} else {
					newStr = str.charAt(i) + newStr;

				}
			}

		}
		System.out.println("newStr :" + newStr); // test
		return newStr;
	}

	public static boolean backspaceCompare(String s, String t) {

		return getString(s).equals(getString(t));
//		return getString 
	}
}
