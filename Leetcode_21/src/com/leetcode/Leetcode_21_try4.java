package com.leetcode;

//import com.leetcode.Leetcode_21_try2_.ListNode;

public class Leetcode_21_try4 {
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

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		// try4

		ListNode dummy = new ListNode(-1);
		ListNode p1 = list1, p2 = list2;
		ListNode p = dummy;

		while (p1 != null && p2 != null) {
			if (p1.val < p2.val) {
				p.next = p1;
				p1 = p1.next;
			} else {
				p.next = p2;
				p2 = p2.next;

			}
			p = p.next;

		}
		if (p1 != null) {
			p.next = p1;
			p = p.next;
		}
		if (p2 != null) {
			p.next = p2;
			p = p.next;
		}

		return dummy.next;
	}
}