//try3

package com.leetcode;


public class Leetcode_61_try3_practise {
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
		//1. base
		
		if (head == null || head.next==null||k==0) return head ;
		
		
		
		
		//2b  mark the oldHead
		ListNode temp = head;
		ListNode oldHead = head ;
		
		int len =0 ;
		while (temp != null) {
			temp=temp.next;
			len ++;
		}
		
		//2 .   use k % n  find the remind 
		int remain = k% len;
		//another base case 
		if(remain==0)  return head;
		
		//reset 
		temp=head;
		
		//3a.    right shift     'remind' times 
		while (remain>0) {		
			temp= temp.next;
			remain--;
		}
		
		
		//3b.   Find the newHead  head shift   (n- 'remind') times
//		ListNode newHead= head;
		while (temp.next!=null) {		
			temp= temp.next;
			head= head.next;
		}
		
//		System.out.println("newHead :" +newHead.val); //test
		
		ListNode newHead= head.next;
		
		//4Lined them together
		temp.next=oldHead;
		
		head.next = null;
		
//		newHead.next=null;
		
		
		
		
		
		return  newHead;
	}
	
}
