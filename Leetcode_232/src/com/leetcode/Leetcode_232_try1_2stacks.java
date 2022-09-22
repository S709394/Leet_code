/*Idea 
 * Video  : https://leetcode.cn/problems/implement-queue-using-stacks/solution/232-yong-zhan-shi-xian-dui-lie-liang-ge-zhan-lai-m/
 * 
 * 
 * */package com.leetcode;

import java.util.Stack;

public class Leetcode_232_try1_2stacks {
	private  Stack<Integer>  sOut , sIn;
	
	public MyQueue() {
        sOut= new Stack <Integer>();
        sIn= new Stack <Integer>();
    }

	public void push(int x) {
		sOut.push(x);
	}

	public int pop() {
		peek();
		return sIn.pop();
	}

	public int peek() {
		
		// When we need to peek()   , check if it is empty  and   push all the elem into  another stack
		if(sIn.isEmpty()) {
			while(!sOut.isEmpty()) {
				sIn.push(sOut.pop());
			}
		}
		
		return  sIn.peek();
	}

	public boolean empty() {
		return sOut.isEmpty()&& sIn.isEmpty();
	}
	
	/**
	 * Your MyQueue object will be instantiated and called as such:
	 * MyQueue obj = new MyQueue();
	 * obj.push(x);
	 * int param_2 = obj.pop();
	 * int param_3 = obj.peek();
	 * boolean param_4 = obj.empty();
	 */
}
