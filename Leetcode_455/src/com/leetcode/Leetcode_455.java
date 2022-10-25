package com.leetcode;

import java.util.Arrays;

public class Leetcode_455 {
	public static void main(String[] args) {
		int[] g = {1,2,3};
		int[] s = {1,1};
		
		System.out.println( findContentChildren (g,s));
	}
	
	
	// g is the needs of a kid ,  s is represent the cookies
	public static int findContentChildren(int[] g, int[] s) {
		
		if (s.length==0) {
			return 0;
		}
		
        Arrays.sort(g);
        Arrays.sort(s);
		
        int childGotCookie = 0 ;
        
        for (int i = 0 ; childGotCookie<g.length &&  childGotCookie<s.length &&i<s.length ;i++) {
//        for (int i = 0 ; i<g.length &&  childGotCookie<s.length &&i<s.length ;i++) {
        	System.out.println("i:" + i );
        	if(s[i]   >= g[childGotCookie]) {
        		childGotCookie++;
        		System.out.println("childGotCookie:" +childGotCookie); //test 
        	}
        }
        return  childGotCookie ;
        
		
    }
}
