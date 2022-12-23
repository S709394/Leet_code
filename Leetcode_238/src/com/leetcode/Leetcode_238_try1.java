package com.leetcode;


//Do not know what is the meaning so far 


////Runtime
//1 ms
//Beats
//100%
//Memory
//50.3 MB
//Beats
//94.20%
public class Leetcode_238_try1 {
	public int[] productExceptSelf(int[] nums) {
		int res[] = new int [nums.length];
		
		int k = 1; 
		for (int i = 0 ; i < res.length; i++) {
			// Store the product of all elements before the current element in the result array
			res [i ] = k ;
			// store the product from it to the  left ( not include the current elem )
			k= k* nums [i] ;
		}
		
		k =1 ;
		
		for (int i = res.length -1 ; i >=0; i--) {
			
			res[i] *= k ;
			// Multiply the product of all elements before the current element by the product 
			//of all elements after the current element
			
			// Update the product of all elements after the current element
			k *= nums[i];
		}
		return res ;
	}
}
