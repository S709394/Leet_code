package com.leetcode;

import com.leetcode.Leetcode_206_try1.ListNode;

public class Leetcode_234_fastSlow2Pointers {
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

	public boolean isPalindrome(ListNode head) {
		ListNode endOfFirstHalf = FirstHalfEnd(head);

		ListNode secondHalfStart = reverser(endOfFirstHalf.next);
		//compare
		boolean res = true;
		ListNode p1 = head;
		ListNode p2 = secondHalfStart;
		while (p2!=null && res ) { // todo
			if (p1.val != p2.val) {
				res = false;
			}
			// Compair  1 by 1;
			p1 =p1.next;
			p2=p2.next;
		}
		// fix the LinkedList back to normal
		endOfFirstHalf.next=reverser(secondHalfStart);
		
		return res;

	}

	public static ListNode reverser(ListNode head) {
		if (head == null || head.next == null)
			return head;

		ListNode last = reverser(head.next);

		head.next.next = head;

		head.next = null;

		return last;
	}
	// the Node at the Fist Half end
		public static ListNode FirstHalfEnd(ListNode head) {

			ListNode fast = head;
			ListNode slow = head;

			while (fast.next != null & fast.next.next != null) {
				fast = fast.next.next;
				slow = slow.next;
			}

			return slow;
		}
}
