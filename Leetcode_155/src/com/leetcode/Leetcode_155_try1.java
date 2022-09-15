/**/
/*Idea : Runtime: 7 ms, faster than 70.70% of Java online submissions for Min Stack.
Memory Usage: 48.3 MB, less than 69.23% of Java online submissions for Min Stack.*/
package com.leetcode;

public class Leetcode_155_try1 {
	private  Node head;
	private class Node{
		int val; 
		int min;
		Node next;
		
		private  Node(int val, int min, Node next) {
			this.val=val;
			this.min=min;
			this.next= next;
		}
		
		
		
	}
	
	public void push(int x) {
		if(head == null) {
			head = new Node (x , x , null);
		}else {
			head = new Node (x, Math.min (x, head.min),head);
		}
	}
	
	
	public void pop () {
		head = head .next;
	}
	
	public int top () {
		return head .val;
	}
	public int getMin() {
		return head.min;
	}
	
}
