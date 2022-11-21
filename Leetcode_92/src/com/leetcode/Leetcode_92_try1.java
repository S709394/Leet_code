//Idea :https://leetcode.cn/problems/reverse-linked-list-ii/solution/fan-zhuan-lian-biao-ii-by-leetcode-solut-teyq/
//Way 1 : 

//Runtime
//0 ms
//Beats
//100%
//Memory
//42.1 MB
//Beats
//28.8%



//Another way : https://labuladong.github.io/algo/2/19/19/
//  Runtime
//0 ms
//Beats
//100%
//Memory
//42.2 MB
//Beats
//21.9%

package com.leetcode;

public class Leetcode_92_try1 {
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
	public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyNode = new ListNode (-1);
        dummyNode.next=head;
        ListNode pre =dummyNode;
        
//        ListNode pre =dummyNode ;
        
        for (int i = 0  ; i < left-1 ; i++) {
        	pre= pre.next;
        }
        
        //start of the tail  (right part
        ListNode rightNode = pre;
        
        for (int i = 0  ; i < right -left+1 ; i++) {
        	rightNode= rightNode.next;
        }
        
        ListNode leftNode =pre.next;
        
        ListNode curr =rightNode.next;
        
        //cut them 
        pre.next=null;
        rightNode.next = null ;
        
        //reverse
        reverseLinkedList(leftNode) ;
        
        pre.next=rightNode;
        leftNode.next=curr;
        return dummyNode.next;
    }
	static void reverseLinkedList(ListNode node) {
		if(node== null || node.next==null) {
			return ;
			
		}
		ListNode res = reverseLinkedList (node.next) ;
		
		node.next.next= node ;
		node.next=null;
//		return res ;
	}
}
