package com.leetcode;

public class Leetcode_374_try1_binarySearch {
	public int guessNumber(int n) {
        //using Guess someWhere 
		 
		int low =1 ; 
		int high =n ;
		
		
		
		while (low <=high ) {
			int mid =  low + (high -low) /2 ;
			 
			if( guess(mid)==0) {
				return mid;
			}else if(guess (mid)==1){
				low=mid+1;
			}else {
				high=mid-1;
			}
			
			
		}
		
		
		
		return -1 ;
		
    }
}
