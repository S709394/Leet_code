package com.leetcode;
/*Runtime
2 ms
Beats
97.94%
Memory
42.7 MB
Beats
91.99%
 * */


//https://leetcode.cn/problems/di-string-match/solution/by-fuxuemingzhu-20do/

//Time complexity is O(n) 		:because the loop runs for n iterations, where n is the length of the input string s.
//Space  complexity   is O (n)  : it creates an array of size n + 1 to store the results.
public class Leetcode_942_try1 {
	public int[] diStringMatch(String s) {
		int len = s.length();

		int[] intArr = new int[len + 1];
		
		int min = 0 ;
		int max = len  ;
		
		for ( int i = 0 ;  i <  len ; i ++) {
			if (s.charAt(i)=='I') {
				intArr [i]  = min ;
				min ++ ;
			}else {   // 'D' 
				intArr [i] = max ;
				max--;
				
			}
			
			 
			
		}
//		System.out.println( max + ' ' + min ); //test 
		intArr [len ] = max ;  // ******
			
			return intArr ;
	}
}
