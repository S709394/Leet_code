package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_645_try2_HashSet {
	public static void main(String[] args) {
		int []  nums   =  {1,2,4,5,5,6,7,8,9,10};
		System.out.println(findErrorNums (nums));
	}
	
	 public  static int[] findErrorNums(int[] nums) {
		 Set <Integer> set= new HashSet<> ();
		 
		 int n = nums.length;
		 int  duplicated = -1; 
		 
		 int sum = (1 +  n+1)  * n /2;
		 for (int i  : nums) {
			 
			 if (set.contains(i) ) {
				 duplicated = i;
				 //skin one of the loop
				 continue;
			 }
			 
			 set.add(i);
			 sum -= i;
		 }
		 int   []  res  =  new int []{  duplicated, sum };
		 
		 return res;
	 }
}
