package com.leetcode;

import java.util.LinkedList;

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
		
		public int max () {
			 
			 return q.getFirst() ;
		}

	}
}
