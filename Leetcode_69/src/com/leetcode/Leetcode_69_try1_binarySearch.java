package com.leetcode;

public class Leetcode_69_try1_binarySearch {
	public static void main(String[] args) {
		int  x = 4 ; 
		
		System.out.println(mySqrt(x));
	}
	
	public static int mySqrt(int x) {
		if (x== 0) {
			return 0;
		}
		if (x==1) {
			return 1 ;
		}
		
		int left = 1 ;  int right = x ;
		
		
		
		while (left < right) {
			int mid = left + (right -left) /2 ;
//			if(   (mid *mid ) <=x   && (mid +1)*(mid+1) > x    ) {
			if(   (mid  ) <=x/mid   && (mid +1) > x /(mid+1)   ) {
				return mid ;
			} else if (mid >x/mid ) {
				right= mid;
			}else {
				left = mid+1 ;
			}
			
		}
		//not going to reach this 
		return left;
        
    }
}
