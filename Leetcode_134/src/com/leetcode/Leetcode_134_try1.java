package com.leetcode;

//Works well
//
//Runtime
//1 ms
//Beats
//100%
//Memory
//62.6 MB
//Beats
//72.1%
public class Leetcode_134_try1 {
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int sum = 0;
		int minSum = gas[1];

		int start = 0;
		for (int i = 0; i < gas.length; i++) {

			sum += gas[i] - cost[i];

			if (sum < minSum) {
				minSum = sum;
				start = i + 1;
			}

		}
		
		if(sum < 0 ) {
			return -1 ;
		}

		if (start == gas.length) {
			start = 0;
		}
		return start ;
	}
}
