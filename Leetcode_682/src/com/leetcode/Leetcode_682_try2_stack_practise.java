package com.leetcode;

import java.util.Stack;

public class Leetcode_682_try2_stack_practise {
	public static void main(String[] args) {
		String []ops = {"5","2","C","D","+"}; 
		
	  System.out.println(calPoints (ops));
	}
	
	//calPoints(String[] ops)
	
	public static int calPoints(String[] ops) {
		Stack <Integer> stack =  new Stack <> ();
		
		int total = 0  ,temp;
		for (String op : ops) {			
			if (op.equals("C")) {
//				
//				temp = 
//				total -=  temp;
				
				total -=stack.pop(); 
				
			}else if (op.equals("D")) {
				temp = 2*stack.peek();
				stack.push(temp);
				total += temp;
			}else if (op.equals("+")) {
				
				temp= stack.pop();
				
				int tempSum = temp;
				tempSum += stack.peek();
				
				stack.push(temp);
				stack.push(tempSum);
				
				total+= tempSum;
				
			}else {
				temp= Integer.parseInt(op);
				
				// do not forget this 
				stack.push(temp);
				total += temp;
			}
		}
		return total;
	}
}
