package com.leetcode;

public class Leetcode_1295_try1 {
	
	public static void main(String[] args) {
		int nums[] = {555,901,482,1771 };

		System.out.println(findEvenNumbers(nums));
	}

	public static  int findEvenNumbers(int[] nums) { 
		
		//A normal way

		int cnt = 0;
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]); //test 
			String numStr = nums[i] + "";

			System.out.println(  "strLen : "+numStr.length() ); //test
			if (numStr.length() % 2 == 0) {
				cnt++;
			}
			
			System.out.println( cnt );
		}

		return cnt;
	}
}
