package com.leetcode;
/*Idea 
 * Runtime: 5 ms, faster than 74.08% of Java online submissions for Valid Anagram.
Memory Usage: 43.6 MB, less than 67.70% of Java online submissions for Valid Anagram.
 * */
public class leetcode_242_try2 {
	public static void main(String[] args) {
		String s = "anagram", t = "nagaram";
	}
	public boolean isAnagram(String s, String t) {
		int [] cnt  = new int [26];
		
		if(s.length()!=t.length())return false;
		
		for ( int i =0;i<s.length();i++) {
			
			//Store  ++ when   s has a char 
			//  -- when  t has a char 
			// If the cnt become all  0s ,  they are  Anagram
			cnt[s.charAt(i)-'a'] ++ ;
			cnt[t.charAt(i)-'a'] -- ;
		}
		
		for (int i=0 ; i <26; i++) {
			if (cnt[i]!=0)return false;
		}
		
		return true;
	}
}
