package com.leetcode;

public class Leetcode_557_try3_no_stack {
	public static void main(String[] args) {
		String s = "let us go";
		System.out.println(reverseWords(s));

	}
	public static String reverseWords(String s) {
		char [] cArr = s.toCharArray();
		
		int len = s.length();
		int l=0; 
		int r=0;
		for (int i = 0 ; i < len ; i++) {
			
			
			if (cArr[i]!=' ') {
				r++;
			}else {
				//or i-1?    *****
				System.out.println( "r-1 :" + (r-1) );
				reverse_C_Arr (l, r-1,cArr);
				l=i+1;
				r++;
			}
		}
		reverse_C_Arr (l, len-1,cArr);
		
		return new String (cArr);
		
		
	}
	public static void reverse_C_Arr (int l , int r , char []cArr) {
		char temp ;
		while (l<r) {
			temp = cArr[l];
			cArr[l] = cArr[r];
			cArr[r] = temp;
			l++;
			r--;
		}
		
	}
}
