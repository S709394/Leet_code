//does not works and too long

package com.leetcode;

public class Leetcode_1455_try3 {
	public static void main(String[] args) {

//		String str = "burger asad", searchWord = "burge"; //works 
//		String str = "i love burger", searchWord = "burge";

		// this problem is an easy problem

		String str = "this problem is an easy problem", searchWord = "pro";

		// this problem is an easy problem

		// "hellohello hellohellohello"

//		String str = "hellohello hellohellohello", searchWord = "ello";

		System.out.println(isPrefixOfWord(str, searchWord));

	}

	static int res = 1;
	static boolean found = false;

	public static int isPrefixOfWord(String sentence, String searchWord) {
//		int res = 0;

		System.out.println("searchWord:" + searchWord);
		String trimed = sentence.trim();
		int tLen = trimed.length();
		if (tLen == 0) {
			return -1;
		}
		int idx = 0;
		
			if (!found && trimed.startsWith(searchWord)) {
				found = true;
				return res;
			} else {
				while (idx < tLen - 1 && trimed.charAt(idx) != ' ') {
					idx++;
					System.out.println("idx:" + idx);
				}
//		while (idx < tLen && trimed.charAt(idx) != ' ') {
//			idx++;
//		}
				res++;
				System.out.println("res++");
				trimed = trimed.substring(idx + 1);

//		System.out.println("trimed/" + trimed);
				System.out.println("res/" + res);
				return isPrefixOfWord(trimed, searchWord);
			}
		

//		return -1;
	}
}
