package com.leetcode;

public class Leetcode_342_try1 {
	public static boolean isPowerOfFour(int n) {
		//Recursive 
		if (n == 1)
			return true;
		if (n % 4 != 0) {
			return false;
		} else {
			n /= 4;
			isPowerOfFour(n);
		}
return true ;
	}
}
