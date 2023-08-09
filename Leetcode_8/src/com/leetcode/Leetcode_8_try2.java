package com.leetcode;

public class Leetcode_8_try2 {
	public static void main(String[] args) {
		String s = "-91283472332";
		System.out.println(myAtoi(s));
	}

	public static int myAtoi(String s) {
		//base 
		if(s== null)  return 0 ;
		
		s= s.trim();
		
		if(s.length()==0) return 0 ;
		
		long sum = 0;
		int len = s.length();
		int sign= 1, start =0;
		// deal with the "+"  / "-";
		
		if(s.charAt(start)=='-') {
			sign=-1;
			start++;
		}else if (s.charAt(start)=='+'){
			sign=1;
			start++;
		}
		
		for (int i = start ; i <len ; i ++) {
			if( !Character.isDigit(s.charAt(i))) {
				
				return (int)(sum*sign);
			}
			
			sum = sum*10+ (s.charAt(i)-'0');
			
			if(sum>Integer.MAX_VALUE) {
				
				if(sign==1) {
					return Integer.MAX_VALUE;
				}else {
					return Integer.MIN_VALUE;
				}
			}
			
		}
		return (int) sum*sign;
		
	}
}
