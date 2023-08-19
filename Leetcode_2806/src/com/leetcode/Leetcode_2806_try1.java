package com.leetcode;

public class Leetcode_2806_try1 {
	public static void main(String[] args) {

	}

	public int accountBalanceAfterPurchase(int pA) {
		
		//try1 
		 int res = 0 ;
		 int remain=  pA%10 ;
		 
		 if ( remain >= 5  && remain != 0) {
			 
			 
			 res = (100 -  ((pA /10 ) +1)*10  )  ;
		 }else {
			 res = (100 -  (pA /10 ) *10 );
		 }
		 
		 return res ;
	}
}
