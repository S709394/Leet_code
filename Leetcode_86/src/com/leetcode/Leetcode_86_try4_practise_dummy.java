package com.leetcode;

import com.leetcode.Leetcode_86_try1.ListNode;

public class Leetcode_86_try4_practise_dummy {
	
	//  set 2 dummy 
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

	public ListNode partition(ListNode head, int x) {
		
		//try4
		
	//  set 2 dummy 
		ListNode dummyS = new ListNode ( -101 ); 
		ListNode dummyL = new ListNode ( -101 ); 
		
		ListNode p1 = dummyS;
		ListNode p2 = dummyL;
		ListNode p = head ;
		
		
		while (p != null) {
			if( p .val < x ) {
				p1.next = p ;
				
				p1  = p1.next ;
			}else {
				p2.next = p  ;
				p2  = p2 .next;
			}
			
//			head = head.next;
			ListNode temp = p.next; 
			
			p .next = null ;
			
			p = temp ;
		}
		
		
		
		
		p1 .next = dummyL.next  ;
		
		return dummyS.next;
	}
	

}
