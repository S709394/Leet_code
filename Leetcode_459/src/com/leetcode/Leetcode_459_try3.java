package com.leetcode;

public class Leetcode_459_try3 {
	// do not know what is the idea so far
	public static void main(String[] args) {
		String str = "abcabc";
		System.out.println(repeatedSubstringPattern(str));
	}

	public static boolean repeatedSubstringPattern(String s) {

		if (s == null || s.length() == 0)
			return true;

		int n = s.length();

		for (int len = 1; len <= n/2; len++) {

			if (n % len != 0)
				continue;

			String pattern = s.substring(0, len );
//			System.out.println("pattern :" + s.substring(0, len - 1)); // test

			int i = len, j = i + len - 1;
			while (j < n) {

				String subString = s.substring(i, j +1);
				if (!pattern.equals(subString)) {
					break;

				}

				i += len;
				j += len;
			}
			if (i == n) {
				return true;
			}

		}
		return false;
	}
}
