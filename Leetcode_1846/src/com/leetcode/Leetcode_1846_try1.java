package com.leetcode;

import java.util.Arrays;

public class Leetcode_1846_try1 {
	public int maximumElementAfterDecrementingAndRearranging(int[] A) {
		//https://leetcode.com/problems/maximum-element-after-decreasing-and-rearranging/solutions/1185804/java-c-python-sort-and-one-pass/
		Arrays.sort(A); 
		
		 int  prer = 0 ;
		for ( int i: A) {
			prer = Math.min(i, prer+1);
		}
	}
}
