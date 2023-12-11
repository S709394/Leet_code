package com.leetcode;

public class Leetcode_2264_try1 {
	public String largestGoodInteger(String num) {
		
		String  ans = "" ;
		for (int i = 2; i < num.length(); i++) {
			// create a '3 in a row' str

			// make sure all char s in this len 3 subString is the same
			String subStr = num.substring(i - 2, i);
			if (num.charAt(i) == num.charAt(i - 1) && num.charAt(i - 1) == num.charAt(i - 2)) {
				// to compare the string using  compareTo() 
				 if(num.substring(i-2,i+1).compareTo(ans) > 0) {
	                    ans = num.substring(i-2,i+1);
	                }
			}

		}
		return ans ;
	}

//	// find the biggest , maybe 999
//	public int getNum(String subStr) {
//
//	}
}
