package com.leetcode;

//The same as try1 

//Runtime
//1 ms
//Beats
//100%
//Memory
//50.1 MB
//Beats
//98.53%

public class Leetcode_238_try2_practise {
	public static void main(String[] args) {
		int []  nums =  {1,2,3,4};
		for (int i : productExceptSelf( nums)) {
			System.out.println(i);
		}
		
		
	}
	
	public  static int[] productExceptSelf(int[] nums) {
		int len = nums.length;
		int[] res = new int[len];
		int k = 1;
		for (int i = 0; i < len; i++) {
			res[i] = k;
			k *= nums[i];
		}
		k = 1;
		for (int i = len - 1; i >= 0; i--) {
			res[i]*=k;
			k*=nums[i];
		}
		return res ;
	}

}
