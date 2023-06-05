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
		// try 2 works well
		ListNode smallDummy = new ListNode(-101);
		ListNode bigDummy = new ListNode(-101);

		ListNode p = head;
		ListNode p1 = smallDummy;
		ListNode p2 = bigDummy;

		while (p != null) {

			if (p.val < x) {
				p1.next = p;
				p1 = p1.next;
			} else {
				p2.next = p;
				p2 = p2.next;
			}

			// cut it
			ListNode temp = p.next;
			p.next = null;
			p = temp;
		}
		p1.next = bigDummy.next;

		return smallDummy.next;
	}

}
