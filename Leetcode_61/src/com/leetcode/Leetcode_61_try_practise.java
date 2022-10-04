//try3 

package com.leetcode;

//import com.leetcode.Leetcode_61_try1.ListNode;

public class Leetcode_61_try_practise {
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
		if (head == null || head.next == null || k == 0)
			return head;

		int len = 0;
		ListNode temp = head;
		ListNode oldHead = head;
		while (temp.next != null) {
			temp = temp.next;
			len++;
		}

		int remain = k % len;
		if (remain == 0)
			return head;

		temp = head;

		while (remain > 0) {
			temp = temp.next;
			remain--;
		}
//		ListNode newHead = temp;

		while (temp.next != null) {
			head = head.next;
			temp = temp.next;
		}
//		ListNode startOfP2 = head;

		ListNode newHead = head.next;
//		System.out.println("newHead: " + newHead.val); // test;

		// Linked them
		temp.next = oldHead;
		
		head.next=null;

		return newHead;
	}
}
