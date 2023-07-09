package com.leetcode;

public class Leetcode_2024_try1 {

	public static void main(String[] args) {
		String s = "TTFF";
		int k = 2;

	}

	public static  int maxConsecutiveAnswers(String answerKey, int k) {
		
		//no idea so far
		 
//		int []  cntArr = new  int [] ;
		
		char [] chars  =answerKey  .toCharArray();
		
		
		int res = 0 , max = 0  ,  count  [] = new int [128] ;
		
		
		for ( int i = 0 ; i < chars.length ; i ++) {
			if( res - (max =Math.max(max,  ++ count [chars [ i]])) < k ) {
				
			}else {
				count [chars[i-res]]-- ;
			}
		}
		
		
	}

}
