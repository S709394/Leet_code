package com.leetcode;


////Runtime
//2 ms
//Beats
//68.96%
//Memory
//42.5 MB
//Beats
//43%
public class Leetcode_520_try2 {
	public static void main(String[] args) {
		String word = "Using";
		String word2 = "Uza";

		System.out.println(detectCapitalUse(word));
		System.out.println(detectCapitalUse(word2));

	}

	public static boolean detectCapitalUse(String word) {

		int len = word.length();
		if (word.length() == 1) {
			return true;
		}

		char[] cArr = word.toCharArray();

		// Upper in [0]
		if (cArr[0] - 'a' < 0 || cArr[0] - 'a' > 25) {

			if (Character.isLowerCase(cArr[1])) {
//				System.out.println("xxx");
				int idx = 2;
				while (idx < len) {
//					System.out.println("idxA:" +idx);  //test 
					if (Character.isUpperCase(cArr[idx])) {
						return false;
					}
					idx++;
				}
			} else {
				int idx = 2;
				while (idx < len) {
					System.out.println("idxB:" + idx); // test
					if (Character.isLowerCase(cArr[idx])) {
						return false;
					}
					idx++;
				}
			}

			// boolean isUpper =true;
//			Character.isLowerCase(cArr[1]);

		} else {
			// lower
			int idx = 1;
			while (idx < len) {

				

				// Upper case
				// if (!(cArr[idx] - 'a' < 0 || cArr[idx] - 'a' > 25)) { // wrong
				if (Character.isUpperCase(cArr[idx])) {
					return false;
				}
				idx++;
			}
//			return true;
		}
		return true;
	}
}
