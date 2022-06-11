/*
 * 263. Ugly Number
Easy

1442

1032

Add to List

Share
An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.

Given an integer n, return true if n is an ugly number.

 

Example 1:

Input: n = 6
Output: true
Explanation: 6 = 2 × 3
Example 2:

Input: n = 1
Output: true
Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
Example 3:

Input: n = 14
Output: false
Explanation: 14 is not ugly since it includes the prime factor 7.
 

Constraints:

-231 <= n <= 231 - 1*/


/*Idea :
 * 
 * Just divide the prime factors till it become 1 
*/
package com.leetcode;

public class Leetcode_263_try1 {
	public static void main(String[] args) {
		
		System.out.println(isUgly ( 15));
		System.out.println(isUgly ( 1));
		System.out.println(isUgly ( -1));
		
	}
	
	 public static boolean isUgly(int n) {
	        
		 
		 if ( n >0) {
			 int factors [] = {2,3,5};
			 for ( int i =0; i <3 ; i ++) {
				 while (n% factors[i] ==0) {
					 n/= factors[i];
				 }
				 
			 }
			 
		 }
		 return n ==1;
		 
		 
    }
	
	
	
}
