package com.leetcode;

public class Leetcode_69_try2_binarySearch_practise {
	public static void main(String[] args) {
		int  x = 4 ; 
		
		System.out.println(mySqrt(x));
	}
	
	public static int mySqrt(int x) {
		if ( x== 0 ) {
			return  0 ; 
		}
		//start from 1 
//		int start = 0  , end = x ; // wrong 
		int start = 1  , end = x ; // wrong 
		
		while (start< end ) {
			int mid = start + (end-start )/2 ;
			
			//    mid * mid <= x   &&     (mid+1 )  * (mid+1 )  >x
			
			if(    mid<=x/mid  && (mid+1) > x/(mid+1)) { //right 
//			if(    mid >= x/mid  && (mid+1) <x/(mid+1))
				return mid ;
			}else if (mid > x/mid) {
				end = mid;
			}else {
				
				// not (mid-1)
				start = mid ;
			}
			
			
		}
		
		// left == right  , both them are ok
		return start;
		
	}
}
