//does not work

package com.leetcode;

public class Leetcode_415_try1 {
	public String addStrings(String num1, String num2) {
		// base case
		if (num1 == "0") {
			return num2;
		}

		int fLen = num1.length(), sLen = num2.length();
		
		int minLen = Math.min(fLen, sLen);
		
		StringBuilder resSB = new StringBuilder ();
		int carry = 0;
		for (int i = 0; i <minLen ; i++) { // here
			
			int sum =carry;
			sum+=		num1.charAt(fLen-i-1)-'0';
			sum+=num2.charAt(sLen-i-1)-'0';
			
			carry =sum/10;
			int remain= sum%10;
			
//			resSB=  resSB.append(Strint int(remain))
		}

	}
}
