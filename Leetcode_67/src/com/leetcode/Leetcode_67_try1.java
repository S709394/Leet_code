/*67. Add Binary
Easy

5832

620

Add to List

Share
Given two binary strings a and b, return their sum as a binary string.

 

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 

Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
Accepted
924,775
Submissions
1,809,011*/
/*Idea :
 * Runtime: 3 ms, faster than 70.80% of Java online submissions for Add Binary.
Memory Usage: 42.8 MB, less than 62.20% of Java online submissions for Add Binary.*/

package com.leetcode;

public class Leetcode_67_try1 {

	public static void main(String[] args) {
		String a = "11", b = "1";
		System.out.println(addBinary(a, b));
	}

	public static String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder();
		int i = a.length() - 1;
		System.out.println(i); // test
		int j = b.length() - 1;
		System.out.println(j); // test

		int carry = 0;

		while (i >= 0 && j >= 0) {
			int sum = carry;

			if (i >= 0)
				sum += a.charAt(i) - '0';
			if (j >= 0)
				sum += b.charAt(j) - '0';
			
			i--;
			j--;
			sb.append(sum % 2);

			carry = sum / 2;
		}
		// 
		if(carry!=0) {
			sb.append(carry);
		}
		return sb.reverse().toString();

	}
}
