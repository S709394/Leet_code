package com.leetcode;

//import com.leetcode.Leetcode_21_try5_practise.ListNode;

public class Leetcode_86_try1 {

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
//		ListNode dummy = new ListNode(-101);
		ListNode smallerDummy = new ListNode(-101);
		ListNode bigDummy = new ListNode(-101);
		
		ListNode p1 = smallerDummy;
		ListNode p2 = bigDummy;
//		dummy.next = head;
		ListNode p = head;
//		dummy.next=head;
		while (p != null) {
			if (p.val < x) {
				p1.next = p;
				p1 = p1.next;

			} else {
				p2.next = p;
				p2 = p2.next;
			}
			p = p.next;
		}
		dummy.next = smallerDummy.next;
		smaller.next = bigDummy.next;

		return dummy.next;
	}
}
