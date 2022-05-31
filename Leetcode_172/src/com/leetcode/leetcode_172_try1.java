/*172. Factorial Trailing Zeroes
Medium

2000

1672

Add to List

Share
Given an integer n, return the number of trailing zeroes in n!.

Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.

 

Example 1:

Input: n = 3
Output: 0
Explanation: 3! = 6, no trailing zero.
Example 2:

Input: n = 5
Output: 1
Explanation: 5! = 120, one trailing zero.
Example 3:

Input: n = 0
Output: 0
 

Constraints:

0 <= n <= 104
 * */

/*Idea :   
 * 
 * (Math Part)
 * 
 * 
 * 
 * 
 * 7! =  1*2*3*4*5*6*7
 *  
  
 * 
 *  every "0"   Trailing Zero means   one "5" and  one "2"
 *  we have much more 2 s than 5s 
 * 
 *  So we need to count  how many  5s in here  
 *  
 *  But we know    25     50    ,   has  two "5"s 
 *   n=25
 * 25!  =   ....   *24*25  
 * 
 * So  
 * To count the "5"s 
 * 
 * It is   
 * f(n) = n/5 +n/ 25 + n/125 +  ...
 * 
 * f(n) = n/5 +n/ 5^2 + n/5^3 +  ...
 * 
 * 
 * */
package com.leetcode;

public class leetcode_172_try1 {
	public static void main(String[] args) {
		
		
		System.out.println(trailingZeroes (25) );
		
	}
	
	
	
	public static int trailingZeroes(int n) {
        int result =0;
        
        while (n >=5) {
        	n/=5;
        	result += n;
        	
        	System.out.println("result"+result );
        }
		return result;
    }
}
