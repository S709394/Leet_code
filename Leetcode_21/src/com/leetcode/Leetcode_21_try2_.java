/*21. Merge Two Sorted Lists
Easy

14782

1300

Add to List

Share
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

 

Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 

Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasOutg order.*/

/**Idea : 
 * 
 * 
 * Runtime: 1 ms, faster than 80.37% of Java online submissions for Merge Two Sorted Lists.
Memory Usage: 43.6 MB, less than 16.85% of Java online submissions for Merge Two Sorted Lists.
 * 
 * Runtime: 1 ms, faster than 80.37% of Java online submissions for Merge Two Sorted Lists.
Memory Usage: 43.6 MB, less than 16.85% of Java online submissions for Merge Two Sorted Lists.
 */
package com.leetcode;

public class Leetcode_21_try2_ {
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

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		
		//Dummy is a cool thing that in the index  (-1) ,going to return dummy.next at the end;
		
		
		ListNode dummy = new ListNode(-1) , p =dummy;
		
		ListNode p1 =list1 , p2 =list2 ;
		
		while (p1!=null &&p2!=null) {
			
			//Let the  smaller one become the "next"
			if(p1.val<p2.val) {
				p.next=p1;
				p1=p1.next;
			}else {
				p.next=p2;
				p2=p2.next;
			}
			
			//do not forget to move the pointer forward 
			
			p=p.next;

		}
		//  p1 or p2 reach the end
		if(p1==null) {
			p.next=p2;
		}
		if(p2==null) {
			p.next=p1;
		}
		
		
		//Skip the dummy , just return the dummy.next
		return dummy.next;
		
	}

}
