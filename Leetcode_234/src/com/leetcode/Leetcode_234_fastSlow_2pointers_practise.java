/*Idea :
 *  10 ms, faster than 51.38% of Java online submissions for Palindrome Linked List.
Memory Usage: 56.6 MB, less than 93.86% of Java online submissions for Palindrome Linked List.*/

package com.leetcode;

import com.leetcode.Leetcode_234_fastSlow2Pointers.ListNode;

public class Leetcode_234_fastSlow_2pointers_practise {
	public boolean isPalindrome(ListNode head) {

		if (head == null || head.next == null) {
			return true;
		}
		boolean res = true;
		ListNode endOfFirstHalf = firstHalfEnd(head);
		ListNode startOf2ndPart = endOfFirstHalf.next;
		
		ListNode p1 = head;
		ListNode p2 = reverse(startOf2ndPart);
		while (p2 != null &&res) {
//		while (p2.next != null) { //wrong
			if (p1.val != p2.val) {
				res = false;
			}
			p1 = p1.next;
			p2 = p2.next;
		}
		// fix the 2nd part   
		startOf2ndPart =  reverse(startOf2ndPart );
		

		return res;
	}

	public static ListNode reverse(ListNode head) {
		
		
//		if (head.next != null || head != null) {//wrong
		if(head.next==null ||head==null) {
			return head;
		}
		ListNode res = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return res;
	}

	// use fast-slow-pointers
	public static ListNode firstHalfEnd(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;

		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;

		}
		return slow;
	}
}
