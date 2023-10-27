/*
 * 
 * 20. Valid Parentheses
Easy

13709

625

Add to List

Share
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 * 
 * */

/*Idea :
 * 
 * Use Stack,  to  make sure they are pairs
 * 
 * 
 * String.toCharArray
 * 
 * stack.push ()
 * stack.pop ()
 
 Example 4 :      

	s=  "{[()]}";
	
	Dry run 
	
	Stack : 
	
	}
	}]
	}])
	}]
	}
	stack size()=0
	
 * */


package com.leetcode;
import java.util.Stack;

public class Leetcode_20_try1 {
	
	public static void main(String[] args) {
//		String s = "(){}";
//		String s = "})}";
		
		String s = "({()})";
//		String s1 = "({))";
		
		boolean b = isVaild (s);
		System.out.println(b);
		
		System.out.println("b1");
//		boolean b1 = isVaild (s1);
//		System.out.println(b1);
		
//		String s3 = "({))";
	}
	
	public static boolean isVaild (String s ) {
		Stack <Character> stack = new Stack<Character> ();
		
		for( char c : s.toCharArray()) {
			if (c =='('){
			stack .push(')');
//			System.out.println(stack);
			
//			System.out.println("here is push ')' "); //test
			}
			else if (c =='{') {
				stack .push('}');
//				System.out.println(stack);
//				System.out.println("here is push '}' "); //test
//				
			}else if (c=='[')  {
				stack .push(']');
			}else if (stack.isEmpty() || stack.pop() != c) {
//				System.out.println("here is  empty || pop ");
//				System.out.println ("stack.pop()  : ||"+stack.pop()+ "||");// if size () is 0 ,  error jumps out 
				
				
				return false;			
			}
//			System.out.println("stack . size() : "+stack.size()); // test
		}
//		System.out.println("here is 'stack is empty' ");
		return stack.isEmpty();
	}
	
}
