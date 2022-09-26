/*Idea 
 * 
 * new ListNode()Dummy .next = head
 * 
 * */
package com.leetcode;

public class Leetcode_203_try1 {
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

	public ListNode removeElements(ListNode head, int val) {
//		if (head == null) {
//			return head; // to do
//		}
		ListNode dummy = new ListNode();
		dummy.next = head;
		ListNode cur = dummy;
		
		
		
		while (cur.next != null) {
			if (cur.next.val == val) {
				cur.next = cur.next.next;
			} else {
				cur = cur.next;
			}

		}
		
		
		return dummy.next;

//		ListNode res=head;
//		if (head == null) {
//			return null;
//		} else {
//			ListNode dummy = head;
////			ListNode res=head;
//			while (head.next != null) {
//
//				if (val == head.next.val) {
//
////					head.next = head.next.next;
//					dummy = head.next.next;
//				}
//				head=head.next.next;
//				
//				head.next = dummy;
//			}
//
//		}
//		return res;
	}
}
