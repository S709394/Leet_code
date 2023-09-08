package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_725_try1 {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static ListNode[] splitListToParts(ListNode head, int k) {
		   int len = 0 ;
		   ListNode cur =  head ;
		   List<ListNode > parts =  new ArrayList <> ()  ;
		   
		   while  (cur != null) {
			   len ++ ;
			   cur = cur .next;
		   }
		   
		   int base_size = len / k ;  int extra = len % k ;
		   
		   for ( int i = 0   ;i  < k ; i ++) {
			    int part_size = base_size  +  (extra > 0 ?1 : 0 ); 
			    ListNode part_head = null, part_tail = null;
			    
			    System.out.println( "part_size : " + part_size); //test 
			    for ( int j= 0 ; j < part_size ; j ++) {
			       	// the 0 
			    	
			    	if ( part_head ==null ) {
			    		part_head = part_tail = cur;
			    		
			    	}else {
			    		part_tail.next = cur ;
			    		
			    		part_tail = part_tail .next;
			    	}
			    	
			    	if( cur != null) {
			    		cur = cur.next;
			    	}
			    	
			    	
			    }
			    
			    /// cut it 
			    if( part_tail!= null ) {
			    	part_tail.next = null ;
			    }
		   }
	}
}
