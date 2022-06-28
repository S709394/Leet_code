/*29. Divide Two Integers
Medium

3205

10944

Add to List

Share
Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.

The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.

Return the quotient after dividing dividend by divisor.

Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231, 231 − 1]. For this problem, if the quotient is strictly greater than 231 - 1, then return 231 - 1, and if the quotient is strictly less than -231, then return -231.

 

Example 1:

Input: dividend = 10, divisor = 3
Output: 3
Explanation: 10/3 = 3.33333.. which is truncated to 3.
Example 2:

Input: dividend = 7, divisor = -3
Output: -2
Explanation: 7/-3 = -2.33333.. which is truncated to -2.
 

Constraints:

-231 <= dividend, divisor <= 231 - 1
divisor != 0
Accepted
514,277
Submissions
2,939,615
 * */

/*  Idea  :  (80%  finished   ,  can not handle the Integer.Max )
 * 
 *  Can not pass this so far  (2147483647 ,2)  output: 1073741823
 * */

package com.leetcode;

public class Leetcode_29_try1 {
	public static void main(String[] args) {
		
		
//		int ansA= divide (-1,-1);
		int ansA= divide (2147483647,2);
		int ansB= divide (7 ,-3);
		
		System.out.println(ansA);
		System.out.println(ansB);
		
	}
	static public int divide(int dividend, int divisor) {
		
		if (dividend == 0) {
			return 0 ;
		}
		
		if(dividend==Integer.MIN_VALUE&&divisor==-1)
            return Integer.MAX_VALUE;
		
		
		System.out.println(Integer.MAX_VALUE);
		
		int res = 0;
		
		if(dividend * divisor >0) 
		{
			
		
		 if (dividend>=0) 
			 {
				 int afterMius =dividend-divisor;
				 
					while( afterMius>=0) 
					{
						res++;
						afterMius =afterMius-divisor;
					}
			 }else
			 {
				 int afterMius =dividend-divisor;
				
				 while( afterMius<=0) 
					 {
							res++;
							afterMius =afterMius-divisor;
					 }
			
			 }
			
		}else {
			if (dividend>=0) {
				 int afterPlus =dividend+divisor;
				 while( afterPlus>=0  ) {
					 res--;
					 afterPlus=afterPlus + divisor;
				 }
			}else {
				int afterPlus =dividend+divisor;
				
				// (-7 ,3)
				 while( afterPlus<=  0) {
					 res--;
					 afterPlus=afterPlus + divisor;
				 }
			}
		}
		return res;
		}
}
