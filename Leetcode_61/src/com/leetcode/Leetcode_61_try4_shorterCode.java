package com.leetcode;

//import com.leetcode.Leetcode_61_try3_practise.ListNode;

public class Leetcode_61_try4_shorterCode {

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
		// 1. base

		if (head == null || head.next == null || k == 0)
			return head;

		// 2b mark the oldHead
		ListNode temp = head;
		ListNode oldHead = head;

		int len = 0;
		while (temp.next != null) {
			temp = temp.next;
			len++;
		}
//		System.out.println("len :" + len);// test

		// 2 . use k % n find the remind
		int remain = k % len;
		// another base case
		if (remain == 0) {
			return head;
		}

		for (int i = len - remain; i > 0; i--) {
			head = head.next;
		}

		ListNode newHead = head.next;
		System.out.println("newHead :" + newHead.val);// test

		//3.Lined them together
		temp.next = oldHead;
		head.next = null;
		
		return newHead;
	}
}
