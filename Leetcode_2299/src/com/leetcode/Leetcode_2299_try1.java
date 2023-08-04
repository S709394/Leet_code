package com.leetcode;

public class Leetcode_2299_try1 {

	public static void main(String[] args) {

		String password = "IloveLe3tcode!";

		System.out.println(strongPasswordCheckerII(password));
	}

	public static boolean strongPasswordCheckerII(String pwd) {

		int len = pwd.length();
		// It has at least 8 characters.
		if (len < 8) {
			return false;
		}
		boolean hasLow = false;
		boolean hasUp = false;
		boolean hasDigit = false;
		// hasSpe
		boolean hasSpe = false;

//		following string: "!@#$%^&*()-+". (length = 12 )x 
		String speStr = "!@#$%^&*()-+";
		int speLen = speStr.length();
		int[] spe = new int[speLen];

		

		for (int j = 0; j < speLen; j++) {

			spe[j] = speStr.charAt(j);

//			System.out.println(spe[j]); //test 
		}

		
//		It does not contain 2 of the same character in adjacent positions (i.e., "aab" violates this condition, but "aba" does not).

		int curChar = -1; 
		
		
		for (int i = 0; i < len; i++) {
			
			

			int n = pwd.charAt(i);
			
			if (i == 0 ) {
				curChar =  n ;
			}else {
				if( n ==  curChar) {
					return false ;
				}
			}
			curChar= n;
//			It contains at least one lowercase letter.

			if (hasLow == false) {
				if (n >= 97 && n <= 122) {
					hasLow = true; 
				}
			}
//			It contains at least one uppercase letter.
			if (hasUp == false) {
				if (n >= 65 && n <= 90) {
					hasUp = true;
				}
			}
//			It contains at least one digit.
			if (hasDigit == false) {
				if (n >= 48 && n <= 57) {
					hasDigit = true;
				}
			}

//			It contains at least one special character. The special characters are the characters in the 
			// following string: "!@#$%^&*()-+". (length = 12 )

			if (hasSpe == false) {
				for (int j = 0; j < speLen; j++) {
					if (n == spe[j])
						hasSpe = true;
				}

			}

		}

		return  hasLow && hasUp&& hasDigit && hasSpe ;

	}
}
