package com.leetcode;

public class Leetcode_1459_try1 {
	 public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
		 
		 int cnt = 0 ; 
		 for (int i = 0 ;  i < startTime.length ;i ++) {
			 if (queryTime >=startTime[i] && queryTime <=endTime [i]) {
				 cnt ++ ;
			 }
		 }
		 
		 return cnt ;
	 }
}
