//It is a hashSet , not fast slow pointers   
package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_202_try1_fastSlowPointers {
	public static void main(String[] args) {
		int n = 19 ;
		
		
	}
	public static boolean isHappy(int n) {
        Set <Integer> seen = new HashSet<>();
        
        while (n!=1  && !seen.contains(n)) {
        	seen.add(n);
        	n=getNext(n);
        }
        return n ==1 ;
    }
	
	public static int getNext (int n) {
		int totalSum = 0 ;
		while (n>0) {
			
			int d= n% 10 ;
			
//			System.out.println("d:" +d);//test 
			n=n/10;
//			System.out.println( "n:" +n); //test
			totalSum += d*d;
			
//			System.out.println( "totalSum"+totalSum);
		
		}
		return totalSum;
	}
}	
