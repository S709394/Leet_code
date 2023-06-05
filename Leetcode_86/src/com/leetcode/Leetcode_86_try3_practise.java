package com.leetcode;

//import com.leetcode.Leetcode_86_try2.ListNode;

public class Leetcode_86_try3_practise {
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

	public  ListNode partition(ListNode head, int x) {
		
		//try3
		ListNode smallDummy = new ListNode(-101), bigDummy = new ListNode(-101);

		ListNode p = head, p1 = smallDummy, p2 = bigDummy;

		while (p != null) {
			if (p.val < x) {
				p1.next = p;
				p1 = p1.next;
			} else {
				p2.next = p;
				p2.next = p2;
			}
			ListNode temp = p.next;

			p.next = null;

			p = temp;
		}
		p1.next = bigDummy.next;

//		return;
		return smallDummy.next ;
	}

}
