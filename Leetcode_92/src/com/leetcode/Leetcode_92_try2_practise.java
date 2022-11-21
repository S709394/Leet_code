//practise 

//Runtime
//0 ms
//Beats
//100%
//Memory
//42.2 MB
//Beats
//21.9%

package com.leetcode;

public class Leetcode_92_try2_practise {
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
	// reverseBetween
	// ListNode head, int left, int right

	public ListNode reverseBetween(ListNode head, int left, int right) {
		ListNode dummy = new ListNode(-1);
		dummy.next = head;

		ListNode start = dummy;
		for (int i = 0; i < left - 1; i++) {
			start = start.next;
		}

		ListNode end = start;
		for (int i = 0; i < right - left + 1; i++) {
			end = end.next;
		}

		// Tail is The start of the 3rd part
		// Mid is the part need to reverse

		ListNode mid = start.next;
		ListNode tail = end.next;

		// cut them

		start.next = null;
		end.next = null;

		reverseLinkedList(mid);

		start.next = end;
		mid.next = tail;
		return dummy.next;

	}

	// reverseLinkedList
	static void reverseLinkedList(ListNode head) {
		if (head == null || head.next == null) {
			return;
		}
		reverseLinkedList(head.next);

		head.next.next = head;
		head.next = null;

	}

}
