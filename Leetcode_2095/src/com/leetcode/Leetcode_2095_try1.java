// does not works well , redo it again 

package com.leetcode;

public class Leetcode_2095_try1 {

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

	public ListNode deleteMiddle(ListNode head) {
		// base
		if (head.next == null) {
			return null;
		}
		if (head.next.next == null) {
			head.next = null;
			return head;
		}
		ListNode fast = head.next.next;
		ListNode slow = head.next;

		while (fast.next!=null&&fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		
		slow .next = slow.next.next;
		
//		//wrong 
//		slow.next.next = slow.next;

		return head;

	}
}
