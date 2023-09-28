package com.leetcode;

public class Leetcode_316_try2 {
	public static void main(String[] args) {
		 String s = "abccca" ;
		 
		 System.out.println(removeDuplicateLetters (s));
	}

	public static String removeDuplicateLetters(String s) {
		
		//try2   works well 
		char[] S = s.toCharArray();

		int[] left = new int[26];

		for (char c : S) {
			left[c - 'a']++;
			
//			System.out.println(  "left[c - 'a']  :"  + left[c - 'a']);//test 
		}
// store the  ans string  
		StringBuilder ans = new StringBuilder(26);
		
		/// store the char in the  ans String ;
		boolean[] inAns = new boolean[26];

		for (char c : S) {
			// still has 'c ' on the right
			left[c - 'a']--;

			if (inAns[c - 'a']) {
				continue;
			}
//			ans.charAt(ans.length()-1)  : the last char at 'ans ' string 
			while (!ans.isEmpty() &&c < ans.charAt(ans.length()-1) && left [ ans.charAt(ans.length()-1)-'a'] >0 ) {
				inAns [ans.charAt(ans.length()-1)- 'a'] =false ;
				ans.deleteCharAt(ans.length()-1) ;
			}
			
			ans.append(c);
			inAns[c - 'a'] = true ;
		}
		return ans.toString();
	}
}
