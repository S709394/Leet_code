package com.leetcode;

public class Leetcode_1455_try1 {

	public static void main(String[] args) {

//		String str = "burger asad", searchWord = "burge"; //works 
		String str = "i burger", searchWord = "burge";
		System.out.println(isPrefixOfWord(str, searchWord));

	}

	public static int isPrefixOfWord(String sentence, String searchWord) {
		String trimed = sentence.trim();
		System.out.println(trimed);
		int cnt = 1;
		int start = 0;

		int len = trimed.length();
		char[] cArr = trimed.toCharArray();

		int searchIdx = 0;

		int searchLen = searchWord.length();
		char[] searchArr = searchWord.toCharArray();

		while (start < len && searchIdx < searchLen ) {
			System.out.println(cArr);
			if (cArr[start] == searchArr[searchIdx] && cArr[start] != ' ' &&searchIdx <searchLen) {
				start++;
				
				searchIdx++;
				if (searchIdx >=searchLen ) {
					return cnt;
				} 
				
			} 
			
			
			if (cArr[start] == ' ') {
				cnt++;
				
				System.out.println("cnt" + cnt);
				searchIdx = 0;
				do {
					start++;
				} while (cArr[start] == ' ' && start != len - 1);
//				start++;//???
			}

			System.out.println("start:" + start);
			System.out.println("searchIdx:" + searchIdx);

		}

//		if( sentence .startsWith(searchWord)) {
//			return cnt;
//		}else {
//			for (char c :sentence.toCharArray()) {
//				if(c!=' ') {
//					continue;
//					
//					if (c!=' ') {
//						cnt++;
//					}
//					
//				}
//				
//				start++;
//			}
//		}
//		
//		return 1+cnt ;

		return -1;
	}
}
