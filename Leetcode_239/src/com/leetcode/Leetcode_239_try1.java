package com.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leetcode_239_try1 {
	// Monotonic queue
	class MonotonicQueue {
		LinkedList<Integer> q = new LinkedList<>();

		public void push(int n) {
			
			/// remove  all the elems   which  < n 
			while  (!q.isEmpty() && q.getLast() < n) {
				q.pollLast();
			}
			
			q.addLast(n);
			

		}
		
		/// max  to get the max elem
		public int max () {
			 
			 return q.getFirst() ;
		}
		
		public void pop (int n) {
			 if (n== q.getFirst()) {
				 q.pollFirst() ;
			 }
		}

	}
	 public int[] maxSlidingWindow(int[] nums, int k) {
		 
		 MonotonicQueue window  = new MonotonicQueue () ;
		 List <Integer > res = new ArrayList <> () ; 
		 
		 for ( int i = 0  ; i < nums.length ; i ++) {
			 if(  i < k-1 ) {
				 window .push(nums [i]);
			 }else {
				 window .push(nums [i]);
				 res .add(window.max()) ;
				 //remove the old nuw 
				 window .pop( i  - k +1 );
			 }
		 }
		 
		 int [] arr = new int [res.size()] ;  
		 
		 for (int i=  0 ; i < res.size() ; i ++) {
			 arr[i ] = res.get(i);
		 }
		 
		 return arr;
	 }
}
