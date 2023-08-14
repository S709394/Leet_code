package com.leetcode;

import java.util.PriorityQueue;

public class Leetcode_215_try1 {
	public int findKthLargest(int[] nums, int k) {
		PriorityQueue <Integer> pq = new  PriorityQueue <> () ;
		for ( int e  : nums ) {
			pq.offer(e) ;
			
			if(pq.size()> k) {
				pq.poll();
			}
		}
		
		return pq.peek();
	}
}
