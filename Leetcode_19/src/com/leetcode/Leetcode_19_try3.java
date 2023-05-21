package com.leetcode;

//import com.leetcode.Leetcode_19_try2.ListNode;

public class Leetcode_19_try3 {
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
		// 1 . dummy
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode right = head, left = head;

		ListNode x = findFromEnd(dummy, n + 1);

		x.next = x.next.next;
		return dummy.next;

	}
	// findFromEnd : find from the k elem from the end

	public ListNode findFromEnd(ListNode head, int k) {
		for (int i = 0 ; i <  k ; i ++) {
			
		}
		
	}
}
