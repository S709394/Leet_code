//works but slow 

package com.leetcode;

import java.util.Arrays;

public class Leetcode_204_try1 {
	
	public static void main(String[] args) {
		 int num = 10; 
		 
		System.out.println(countPrimes(num));
	}
	
	
	public  static int countPrimes(int n) {
		boolean [] isPrimes  =  new boolean [n] ;
		Arrays.fill(isPrimes, true);
		
		
        if (n < 2) return 0;
        
        
        
        
        for (int i= 2 ; i *i< n ;  i ++) {
        	
        	
        	
        	for (int j =i ; j *i < n ; j++) {
        		if (isPrimes [i*j] ) {
        			isPrimes [i*j]=false;
        		}
        		
        	}
        }
        
        // for loop to count 
		int cnt = 0 ;
        
        for (int i = 2; i< n ; i ++) {
        	if (isPrimes[i]) {
        		cnt ++;
        	}
        	
        }
		return cnt ;
    }
}
