package com.leetcode;

//import com.leetcode.Leetcode_206_try2_dummyWay_practise.ListNode;

public class Leetcode_203_try2_practise_dummyway_practise extends Leetcode_203_try1 {
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
		if(head==null) return  head;
		
		ListNode dummy= new ListNode();
		dummy.next=head;
		ListNode cur = dummy;
		
		while (cur.next!=null) {
			if(cur.next.val== val) {
				
				cur.next= cur.next.next;
			}else {
				cur  = cur.next;
			}
			
				
			
		}
		return dummy.next;

	}
}
