package com.leetcode;

public class Leetcode_1822_try1 {

	//

	public static void main(String[] args) {
		int[] nums = { -1, -2, -3, -4, 3, 2, 1,0 };
System.out.println( arraySign (nums));
	}

	public static int arraySign(int[] nums) {
		
		int negtiveCnt = 0 ;
		
		for (  int n :nums) {
			if (n == 0) return 0 ;
			
			if (n< 0 ) {
				negtiveCnt ++;
			}
			
		}
		int res =   negtiveCnt %2  ==1  ? -1:1 ;
		
		return res;
		
	}
}
