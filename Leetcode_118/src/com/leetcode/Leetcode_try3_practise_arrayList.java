package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_try3_practise_arrayList {  
	
	public static void main(String[] args) {
		 System.out.println( generate  (2));
	}
	 public static List<List<Integer>> generate(int n) {
		 //try3 works well 
		 List <  List <Integer>>  ll = new ArrayList <> () ;
		 
		 for ( int i = 0 ; i < n  ; i ++) {
			 List <Integer>  list = new ArrayList <>  () ;
			 System.out.println( "i");
			 for (int  j = 0 ; j < i +1 ; j ++) {
				 System.out.println( "j");
				 
				 if (j==0|| j ==i) {
					 list .add(1) ;
					 System.out.println( "add");
				 }else {
					 
					 // the prep lines 's sum of the 2 nums 
					 list .add(  ll.get(i-1) .get(j-1) +  ll.get(i-1) .get(j)    );
				 }
			 }
			 
			 ll .add(  new ArrayList (list) );
			
			 
			 
		 }
		 return ll ; // 
	 }
}
