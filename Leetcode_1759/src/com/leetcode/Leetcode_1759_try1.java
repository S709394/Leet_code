package com.leetcode;

public class Leetcode_1759_try1 {
	public static void main(String[] args) {
		System.out.println( countHomogenous ( "101"));
	}
	public static int countHomogenous(String s) {
		//try1 
		/// 1_000_000_007  is  a  /prime number  /  big enough to prevern the num bigger than the Max of the int 
		int res =0 ,cur=0, count=0 ,mod = 1_000_000_007 ;
//		int mod2 =1000000007 ;
		
		for ( int i = 0 ;i <s.length() ; i++) {
			count = s.charAt(i ) ==cur? count +1 : 1  ;
			cur = s.charAt(i) ;
			res = (res + count ) % mod ;
		}
		return res  ;
	}
}
