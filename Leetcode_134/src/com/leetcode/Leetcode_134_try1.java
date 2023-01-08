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

//GptAPI:
//This is a method that takes in two arrays of integers called gas and cost. It returns an integer representing the starting index of a circular array of gas stations such that a car can travel around the circuit once and end up at the starting index.
//
//The method first initializes a variable sum to 0 and a variable minSum to the second element of the gas array. It then iterates through the elements of the gas array and for each element, it adds the difference between the corresponding element in the gas array and the corresponding element in the cost array to sum.
//
//If sum is less than minSum, it updates minSum to be equal to sum and updates the start variable to be the current index plus 1.
//
//After the loop finishes, if sum is less than 0, the method returns -1, indicating that it is not possible to complete the circuit. Otherwise, it returns start, which is the starting index of the gas station such that the circuit can be completed. If start is equal to the length of the gas array, it sets start to 0.

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
		
		
		//sum less than 0 mean     "a car can NOT  travel around the circuit once" 
		if(sum < 0 ) {
			return -1 ;
		}
		
		
//		in a true circuit    (pos n ==  pos 0)
		if (start == gas.length) {
			start = 0;
		}
		return start ;
	}
}
