package com.leetcode;

public class Leetcode_415_try2 {
	public static void main(String[] args) {
		String num1 = "111" , num2="922";
		
		System.out.println( addStrings (num1,num2));
	}
	public static String addStrings(String num1, String num2) {
		
		//base case 
		if (num1=="0") {
			return num2;
		}else if (num1=="0"){
			return num1;
		}
		
		String ans = "" ;
		int fIdx= num1.length()-1, sIdx= num2.length()-1;
		int carry = 0 ;
		while (fIdx>=0 || sIdx>=0 ||carry!=0) {
//			int sum= (num1.charAt(fIdx) -'0' )+(num2.charAt(sIdx) -'0') +carry; //wrong 
			
			int numA =0;
			if  (fIdx>=0) {
				numA= num1.charAt(fIdx) -'0';
			}
			int numB =0;
			if  (sIdx>=0) {
				numB= num2.charAt(sIdx) -'0';
			}
			
			int sum=  numA +numB +carry;
			carry = sum/10;
			ans= sum%10+ans ;
					
			
			fIdx--;
			sIdx--;
			
		}
		return ans ;
	}
}
