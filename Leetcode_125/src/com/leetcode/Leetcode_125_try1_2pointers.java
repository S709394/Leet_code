
/*Runtime: 3 ms, faster than 99.01% of Java online submissions for Valid Palindrome.
Memory Usage: 44 MB, less than 52.93% of Java online submissions for Valid Palindrome.*/
package com.leetcode;

public class Leetcode_125_try1_2pointers {

	public static void main(String[] args) {
		String s = "abcba";

		System.out.println(isPalindrome(s));

	}

	public static boolean isPalindrome(String s) {

		int start = 0, end = s.length() - 1;

		while (start <= end) {
			// skip the leading
			while (start <= end && !Character.isLetterOrDigit(s.charAt(start))) {
				start++;
			}
			// skip the end
			while (start <= end && !Character.isLetterOrDigit(s.charAt(end))) {
				end--;
			}
			// Character . toLowCase if for tran them all to lowcase
			if (start <= end && (Character.toLowerCase(s.charAt(end)) != Character.toLowerCase(s.charAt(start)))) {
				return false;
			}

			//move the 2 pointers to check the charters   pair by pair
			start++;
			end--;

		}

		return true;
	}
}
