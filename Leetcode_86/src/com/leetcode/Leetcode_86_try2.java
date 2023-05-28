package com.leetcode;

//import com.leetcode.Leetcode_86_try1.ListNode;

public class Leetcode_86_try2 {
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
		ListNode  p1 = new ListNode ( -101);
		ListNode p2 = new ListNode (-101);
		
		ListNode  p = head;
		
		while (p!=null) {
			
			if(p.val<x) {
				p1.next = p;
				p1=p1.next;
			}{
				p2.next=p;
				p2=p2.next;
			}
			
			//cut it 
			p
			
		}
	}
}
