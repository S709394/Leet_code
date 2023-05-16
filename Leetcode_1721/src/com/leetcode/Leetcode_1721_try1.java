package com.leetcode;

public class Leetcode_1721_try1 {
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

	public ListNode swapNodes(ListNode head, int k) {

		ListNode left = head, right = head;

		for (int i = 0; i < k; i++) {
			left = left.next;

		}
		ListNode cur = left;

		// 2 pointers
		while (cur.next != null) {
			cur = cur.next;
			right = right.next;
		}

		// swap
		int val = right.val;
		right.val = left.val;
		left.val = val;

		return head;

	}
}
