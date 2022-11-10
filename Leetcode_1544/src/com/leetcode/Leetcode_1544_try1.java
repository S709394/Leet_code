//Slow but works 



//https://leetcode.com/problems/make-the-string-great/solutions/2628805/make-the-string-great/

package com.leetcode;

public class Leetcode_1544_try1 {
	public String makeGood(String s) {

		for (int i = 0; i < s.length() - 1; i++) {

			// 'a' - "A" ~ 'z' -"Z" are always abs(32 ) ;
			if (Math.abs(s.charAt(i) - s.charAt(i + 1)) == 32) {

				// remove the 2 char s then "+" them together
				return makeGood(s.substring(0, i) + s.substring(i + 2));
			}

		}
		return s;

	}
}
