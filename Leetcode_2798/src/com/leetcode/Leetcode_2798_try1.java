package com.leetcode;

public class Leetcode_2798_try1 {

	public static void main(String[] args) {
		int[] hours = { 0, 1, 2, 3, 4 }; int target = 2 ;
		
		System.out.println( numberOfEmployeesWhoMetTarget (hours , target));
	}

	public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
		int cnt = 0 ;
		for ( int x : hours) {
			if( x >= target) {
				cnt ++ ;
			}
		}
		return cnt ;
	}
}
