//Runtime
//0 ms
//Beats
//100%
//Memory
//41.9 MB
//Beats
//34.1%



package com.leetcode;

public class Leetcode_434_try1 {
	public static void main(String[] args) {
//		String  s =  "                ";
		String  s =  "     Hello, my name is John     " ;
		
		System.out.println(countSegments (s));
	}
	
	
	public static int countSegments(String s) {
        s= s.trim();
        int len = s.length();
        System.out.println(len); //test 
        
        System.out.println("s: /" + s + "/");
        
        if(len == 0) {
        	return 0;
        }
        char [] cArr = s.toCharArray();
        int cnt = 1 ;
        for (int i = 0 ; i < len ; i ++) {
        	if(cArr [i]  ==' ') {
        		cnt++;
        		while (i+1 < len &&cArr [i+1]==' ' ) {
            		i++;
            	}
        	}
        	
        }
        return cnt ;
    }
}
