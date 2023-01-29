package com.leetcode;

public class Leetcpde_509_try2_loop {
	
	
	//not loop.  but a recursive 
	static int[] memo;

	public int fib(int n) {

		memo = new int[n + 1];
		return helper(n);
	}

	public   int helper(int n) {
		if (n == 0 || n == 1)
			return n;

		//make sure not recalculate  memo[n];
		if (memo[n] != 0)
			return memo[n];

		memo[n] = helper(n - 1) + helper(n - 2);
		return memo[n];

	}
}
