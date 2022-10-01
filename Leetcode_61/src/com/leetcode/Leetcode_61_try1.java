//works well  
//61

package com.leetcode;

public class Leetcode_61_try1 {
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
		if (head == null|| head.next == null ||k == 0) {
			return head;
		}
		//	
		ListNode dummy = head;
		ListNode startOfSecondHalf = head;
		
		// to get the length // and dummy reach the pos (-1)
		int len = 0;
		while (dummy != null) {
			dummy = dummy.next;
			len++;
//			System.out.println("len:" +len);
		}

//		ListNode newTail = dummy;
		// store the head
		dummy = head;
		
		System.out.println("dummy = head:" +dummy.val); //test
		int remain = k % len;

		if (remain == 0) {
			return head;
		}

		while (remain > 0) {
			remain--;
			dummy = dummy.next;
		}
		
		
		//use head as "new Tail"    //  move  ( n - remain )
		while (dummy.next != null) {
			head = head.next;
			dummy = dummy.next;
			System.out.println("head in while:" + head );

		}
		
		System.out.println("After dummy reach the null"); //test
		//The new head is "head.next now "
		ListNode res = head.next;

		head.next = null;
		
		System.out.println("res :" + res.val); //test
		
		System.out.println("head :" + head.val); //test

		
		// Linked the 1st part with the second part
		dummy.next = startOfSecondHalf;

		return res;

	}
}
