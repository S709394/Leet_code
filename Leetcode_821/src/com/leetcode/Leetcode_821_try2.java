package com.leetcode;

import java.util.Arrays;

public class Leetcode_821_try2 {

		public static void main(String[] args) {
			
//			//test code 0.1 // print an Array 
//			int []arrA  =   {1,2,3,4,5};
//			System.out.println( Arrays .toString(returnAnIntArr(arrA)));
//		
			System.out.println(Arrays .toString(shortestToChar("loveleetcode",  'e')));
//			
//			System.out.println(Arrays .toString(shortestToChar("abaaabaaabba",  'b')));
		}
	public static int[] shortestToChar(String str, char c) {
		String s = str;
        int len= s.length();
        int [] result = new int[len] ;
        
        
        for (int i = 0 ; i< len ; i++) {
        	if(s.charAt(i)==c) {
        		result[i]=0;
        	}else {
        		result[i]= 10001;
        	}
        }
		
        ////2 
        //2  from left to right
//      	2. scan from left to right, if =max, skip, else dist[i+1] = Math.min(dp[i] + 1, dp[i+1]), 
//      		 *     we can get [max, max, max, 0, 1, 0, 0, 1, 2, 3, 4, 0]
//     
        for (int i = 0; i <len-1; i++) {
//	        	
//	        	System.out.println(s.charAt(i));//test
        	
//	        	if (s.charAt(i)==c) {
        		
//	        		System.out.println("i:" +i);
//	        		
//	        		System.out.println("result[i+1]:" +result[i+1] + "\n result[i]+1:" +(result[i]+1)+"\n");
        		result[i+1]=Math.min(result[i+1],(result[i]+1) );
//	        	}
        	
        	
        	
        }
        
////	       // *  3. scan from right to left, use dp[i-1] = Math.min(dp[i] + 1, dp[i-1])
//////	       		 *     we will get[3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0] 
////	        
        for (int i = len-1; i >0; i--) {
//	        	System.out.println(s.charAt(i));//test
        	result[i-1]=Math.min(result[i-1],result[i]+1 );  
        }
//	        
        
        	 return result;
	}
	
	
	//for test 0.1
	public static int [] returnAnIntArr(int [] arr) {
		arr[0]=20;
		
		return arr;
	}
	
	//JESS Jun 6th
		
}


