package com.leetcode;
/*Idea:
 * 
 * Use 2 int [26] to store the count of char 
 * 
 * Runtime: 5 ms, faster than 74.08% of Java online submissions for Valid Anagram.
Memory Usage: 44 MB, less than 48.49% of Java online submissions for Valid Anagram.
 *  */


public class leetcode_242_try1 {
	public static void main(String[] args) {
		String s = "anagram", t = "nagaram";
	}

	public boolean isAnagram(String s, String t) {
		if(s.length()!=t.length()) return false;
		
		int [] sArr = enCode(s);
		
		int [] tArr = enCode(t);
		
		for (int i =0 ; i <26 ; i++) {
			if(sArr[i]!=tArr[i]) {
				return false;
			}
		}
		return true;
		
		
	}
	
	public static int [] enCode(String a) {
		int [] intArr = new int [26];
		
		for (char c : a.toCharArray()) {
			intArr [ c-'a']++;
		}
		
		return intArr ;
	}

}
