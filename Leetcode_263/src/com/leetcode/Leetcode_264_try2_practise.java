package com.leetcode;

public class Leetcode_264_try2_practise {
	public boolean isUgly(int n) {
        if(n>0) {
        	int [] fts = {1,2,3};
        	
        	for (int i = 0 ; i < 3 ; i ++) {
        		while (n % fts[i] ==0) {
        			n/=fts[i];
        		}
        		
        	}
        	
        	

        }
        
        return (n == 1)  ;
    }
}
