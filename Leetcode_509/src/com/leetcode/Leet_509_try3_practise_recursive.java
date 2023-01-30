package com.leetcode;

public class Leet_509_try3_practise_recursive {
	
	//try3 recursive 
	static int[] memo;

	public int fib(int n) {
		memo = new int[n + 1];

		return helper(n);
	}

	static int helper(int n) {
		if (n == 1 || n == 0)
			return n;

		if (memo[n] != 0)
			return memo[n];
		
		memo [n] = helper (n-1) +helper (n-2);
		return memo [n] ;
	}
}
