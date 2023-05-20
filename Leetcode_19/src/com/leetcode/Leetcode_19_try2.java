package com.leetcode;

//import com.leetcode.Leetcode_19_try1.ListNode;

//import com.leetcode.Leetcode_19_try1.ListNode;

public class Leetcode_19_try2 {

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
		//https://labuladong.github.io/algo/di-yi-zhan-da78c/shou-ba-sh-8f30d/shuang-zhi-0f7cc/

		ListNode dummy = new ListNode(-1);
		dummy.next = head;

		ListNode x = findFromEnd(dummy, n + 1);

		x.next = x.next.next;

		return dummy.next;

	}

	public ListNode findFromEnd(ListNode head, int k) {
		ListNode right = head;
		ListNode left = head;
		for (int i = 0; i < k; i++) {
			right = right.next;
		}
		while (right.next != null) {
			right = right.next;
			left = left.next;
			System.out.println("left " + left.val);
		}
		return left;

	}
}
