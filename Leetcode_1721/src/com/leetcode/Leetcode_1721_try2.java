package com.leetcode;

//import com.leetcode.Leetcode_1721_try1.ListNode;

public class Leetcode_1721_try2 {
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

		for (int i = 1; i < k; i++) {
			left = left.next;
		}
		
		ListNode cur = left ;
		
		while (cur .next!=null) {
			cur=cur.next;
			right =right.next;
		}
		
		int val = right .val;
		right.val=left .val;
		left .val =val;
		
	}
}
