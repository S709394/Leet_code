package com.leetcode;

public class Leetcode_2483_try1 {
		public static void main(String[] args) {
			
		}
		public int bestClosingTime(String customers) {
			
//			/ try1
			int max_score = 0 ;  int   score = 0 ,  best_hour = -1 ;
			
			int len = customers .length() ;
			
			for (int i = 0 ; i < len ; i ++) {
				
				//when we meet "Y"
				if ( customers .charAt(i) == 'Y') {
					 score +=1 ;
				}else {
					score -=1 ;
				}
				
				if(score > max_score) {
					max_score = score ;
					best_hour= i ;
				}
			}
			return best_hour +1 ;
		}
}
