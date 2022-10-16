package com.leetcode;

import java.util.Stack;

//Idea  : 

//String .equals
//Integer.parseInt ()
/*s.peek ();      //  read the last of the stack ()   LIFO
 * s.pop  ()       //  read  and remove  //  the last of the stack ()   LIFO
 * 
// * */
//Runtime: 5 ms, faster than 60.84% of Java online submissions for Baseball Game.
//Memory Usage: 42.5 MB, less than 35.50% of Java online submissions for Baseball Game.

public class Leetcode_682_try1_stack_or_arrayList {
	public static void main(String[] args) {
		String []ops = {"5","2","C","D","+"}; 
		
	  System.out.println(calPoints (ops));
	}
	
	public static int calPoints(String[] ops) {
        Stack <Integer> stack = new Stack <> ();
		int total = 0  ,temp;  
		for (String op  : ops) {
			
			// +
			
			////D  for double 
			if(op.equals("C")) {  // "C" for cancel
				
				total -= stack.pop();
				
			}else if (op.equals("+")) {
				temp = stack.pop();
				int sum=0;
				sum+= temp;
				sum+= stack.peek();
				stack.push(temp);
				stack.push(sum);
				
				total += (sum);
			
			}else if (op.equals("D")) {
				temp = stack.peek()*2;
				stack.push(temp);
				total += (temp);
//				total-= stack.pop();
				
			}else { //nums 
				temp = Integer.parseInt(op);
				stack.push(temp);
				total += temp;
			}
			
		}
		return  total ;
    }
}
