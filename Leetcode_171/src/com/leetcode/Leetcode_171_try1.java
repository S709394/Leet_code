package com.leetcode;

public class Leetcode_171_try1 {
	public static void main(String[] args) {
		String s = "AB";
		System.out.println(titleToNumber(s));
	}

	public static int titleToNumber(String cT) {
		//try1
		int len = cT.length();
		char[] cArr = new char[len];

		cArr = cT.toCharArray();
		int res = 0;

//		for (int i = len - 1; i >= 0; i--) {

		for (int i = 0; i < len; i++) {
			res *= 26;
			res += (cArr[i] - 'A' + 1);
//			System.out.println(res); // test
		}

//		int n = Integer.parseInt(cT);
		return res;
	}

}
