package com.leetcode;

//import com.leetcode.Leetcode_1721_try2.ListNode;

public class Leetcode_19_try1 {
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

	public ListNode removeNthFromEnd(ListNode head, int n) {

		ListNode dum = new ListNode(0);
		ListNode left = dum;
		ListNode right = dum;
		
		left .next = head ;

		for (int i = 1; i < n+2; i++) {
			right = right.next;
			System.out.println("right : " + right.val);//test

		}

		while (right != null) {
			left = left.next;
			right = right.next;
		}

		left.next = left .next .next;

		return dum.next;
	}
}
