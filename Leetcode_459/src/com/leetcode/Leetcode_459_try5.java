package com.leetcode;

public class Leetcode_459_try5 {
	public static void main(String[] args) {
		String str = "abcabc";
		System.out.println(repeatedSubstringPattern(str));
	}

	public static boolean repeatedSubstringPattern(String s) {

		// try5
		if (s == null || s.length() == 0) {
			return true;
		}

		int n = s.length();
		// the length of each pattern
		for (int len = 1; len <= n / 2; len++) {

			String pattern = s.substring(0, len );
			System.out.println("pattern :" + pattern); // test

			if (n % len != 0) {
				continue;
			}

			int i = len, j = len + i - 1;

			while (i < n) {
				String toCompare = s.substring(i, j + 1);
				System.out.println("toCompare :" + toCompare); // test
				if (!pattern.equals(toCompare)) {
					break;
				}
				i += len;
				j += len;
			}

			if (i == n)
				return true;
		}
		return false;
	}
}
