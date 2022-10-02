package com.leetcode;

public class Leetcode_61_try2_clearOne {
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

	public ListNode rotateRight(ListNode head, int k) {
		// base case length =1 || k= 0
		
		if(head == null  || head .next==null || k == 0 ) {
			return head ;
		}
		
		ListNode temp = head ; 
		ListNode startOfSecondeHalf =head; 
		
		// to get the length
		
		int len = 0 ; 
		while (temp!=null ) {
			temp= temp.next;
			len++;
//			System.out.println("len:" +len);
		}
		
		//reset 
		temp = head;
//		System.out.println("dummy = head:" +dummy.val); //test
		
		int remain = k % len;
		
		if(remain == 0) {
			return head;
		}
		while (remain>0) {
			remain--;
			temp= temp.next;
		}
//		System.out.println("temp:" +temp.val); //test
		while (temp.next!=null) {
			head=head.next;
			temp=temp.next;
//			System.out.println("head in while:" + head );// test
		}
		
		ListNode newHead = head.next;
		head.next=null;
//		System.out.println("newHead:" + newHead.val );// test
		
		temp.next=startOfSecondeHalf;
		
		return newHead;
	}
}
