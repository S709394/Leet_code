package com.leetcode;

public class Leetcode_520_try1 {
	public static void main(String[] args) {
		String word = "Using";
		String word2 = "Uz";

		System.out.println(detectCapitalUse(word));
		System.out.println(detectCapitalUse(word2));

	}

	public static boolean detectCapitalUse(String word) {
//		boolean isCap = true;

		// base

//		int len = word.length();
		if (word.length() == 1) {
			return true;
		}
		char[] cArr = word.toCharArray();
//		
//		if (word.length() == 2) {
//			if (cArr[1] - 'a' < 0 || cArr[1] - 'a' > 25) {
//				return false;
//			}
//			return true;
//
//		}
		// base case end

		// Upper in [0]
		if (cArr[0] - 'a' < 0 || cArr[0] - 'a' > 25) {

			// Us???
			if (cArr[1] - 'a' >= 0 && cArr[1] - 'a' <= 25) {
				for (int i = 2; i < word.length(); i++) {

					// UsaaaA
					if (cArr[i] - 'a' < 0 || cArr[i] - 'a' > 25) {
						return false;
					}
				}
				// US
			} else {
				// USa or USA
				for (int i = 2; i < word.length(); i++) {

					if (cArr[i] - 'a' >= 0 && cArr[i] - 'a' <= 25) {
						return false;
					}
				}
			}
			// [0 ] is lower case
		} else {
			for (int i = 1; i < word.length(); i++) {

				// aaaaUaa;
				if (cArr[i] - 'a' < 0 || cArr[i] - 'a' > 25) {
					return false;
				}
			}
		}

		return true;
	}
}
