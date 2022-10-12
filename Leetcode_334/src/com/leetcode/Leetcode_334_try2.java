package com.leetcode;

public class Leetcode_334_try2 {
	public static void main(String[] args) {

		// 20,100,10,12,5,13
//		int[] nums = { 20, 100, 10, 12, 5, 13 };
		
		//[5,1,5,5,2,5,4]
		int[] nums = {5,1,5,5,2,5,4};

//		int []  nums = {2,1,5,0,4,6};
		System.out.println(increasingTriplet(nums));

	}

	public static boolean increasingTriplet(int[] nums) {
		int smallest = Integer.MAX_VALUE, smaller = Integer.MAX_VALUE;

		for (int i : nums) {
			if (i <= smallest) {
				smallest = i;
				System.out.println("smallest" + smallest);
			} else if (i <= smaller) {
				smaller = i;
				System.out.println("smaller " + smaller);
			} else if (i > smaller){
				return true ;
			};

		}

		return false;
	}
}
