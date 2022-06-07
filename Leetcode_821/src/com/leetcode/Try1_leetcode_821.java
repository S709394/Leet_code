
/*
 * 821. Shortest Distance to a Character
Easy

2199

120

Add to List

Share
Given a string s and a character c that occurs in s, return an array of integers answer where answer.length == s.length and answer[i] is the distance from index i to the closest occurrence of character c in s.

The distance between two indices i and j is abs(i - j), where abs is the absolute value function.

 

Example 1:

Input: s = "loveleetcode", c = "e"
Output: [3,2,1,0,1,0,0,1,2,2,1,0]
Explanation: The character 'e' appears at indices 3, 5, 6, and 11 (0-indexed).
The closest occurrence of 'e' for index 0 is at index 3, so the distance is abs(0 - 3) = 3.
The closest occurrence of 'e' for index 1 is at index 3, so the distance is abs(1 - 3) = 2.
For index 4, there is a tie between the 'e' at index 3 and the 'e' at index 5, but the distance is still the same: abs(4 - 3) == abs(4 - 5) = 1.
The closest occurrence of 'e' for index 8 is at index 6, so the distance is abs(8 - 6) = 2.
Example 2:

Input: s = "aaab", c = "b"
Output: [3,2,1,0]
 

Constraints:

1 <= s.length <= 104
s[i] and c are lowercase English letters.
It is guaranteed that c occurs at least once in s.*/


package com.leetcode;

import java.util.Arrays;

//import java.util.Arrays;

public class Try1_leetcode_821 {
	public static void main(String[] args) {
		
		
		//does not works well
//		System.out.println(numSquares(4));
//		int [] arr=shortestToChar("loveleetcode",  'e').clone();
		
//		int []arr2 = Arrays.copyOf(shortestToChar("loveleetcode",  'e'), shortestToChar("loveleetcode",  'e').length);
		
		int []arr  =   {1,2,3,4,5};
//		int []arr3 =arr.clone();	 //works well 
		
//		int []arr3 =  (shortestToChar("loveleetcode",  'e')); //bad
		
		System.out.println(
				Arrays .toString(shortestToChar("loveleetcode",  'e'))
				);
				
		
// 		int []arr2 =shortestToChar("loveleetcode",  'e').clone();		
////		System.out.println(arr.length);
//		
//
////		System.out.println(arr[2]);	
//		System.out.println(arr2.length);	
//		
//		for ( int elem : arr2) {
//			
//			System.out.print( elem + ",");
//		}
		
//		for (int i =0; i < arr2.length; i++) {
//			System.out.print(arr2[i]);
//		}
		
	}
	public static int[] shortestToChar(String str, char c) {
		
		String s = str;
        int len= s.length();
        int [] result = new int[len] ;
        
               
        //1. 1. put 0 at all position equals to e, and max at all other position
        //*     we will get [max, max, max, 0, max, 0, 0, max, max, max, max, 0]
        for (int i = 0; i <len; i++) {
        	if (s.charAt(i)==c) {
        		
//        		System.out.println(s.charAt(i));//test
        		result[i]=0;
        	}else {
        		result[i]=10001;  //  10^4  Constraints:  1 <= s.length <= 10^4
        	}
        }
        //2  from left to right
//        2. scan from left to right, if =max, skip, else dist[i+1] = Math.min(dp[i] + 1, dp[i+1]), 
//        		 *     we can get [max, max, max, 0, 1, 0, 0, 1, 2, 3, 4, 0]
//        		
        for (int i = 0; i <len-1; i++) {
        	if (s.charAt(i)==c) {
        		continue;
        	}else {
        		System.out.println(s.charAt(i));//test
        		result[i+1]=Math.min(result[i+1],result[i]+1 );  
    		}
        }
        
       // *  3. scan from right to left, use dp[i-1] = Math.min(dp[i] + 1, dp[i-1])
//       		 *     we will get[3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0] 
        
        for (int i = len-1; i >0; i--) {
        	System.out.println(s.charAt(i));//test
        	result[i-1]=Math.min(result[i],result[i]+1 );  
        }
        
//        System.out.println(result);//test
        return result;
    }
	
	
	
	
}
