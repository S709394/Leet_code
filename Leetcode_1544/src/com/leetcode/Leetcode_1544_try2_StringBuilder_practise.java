//https://leetcode.com/problems/make-the-string-great/solutions/2628805/make-the-string-great/ 
//
//Runtime
//3 ms
//Beats
//88.89%
//Memory
//40.9 MB
//Beats
//97.14%

//Idea : Stack  
// abs  ('A' - 'a'  ) always 32    (ASC II)
//  Using     (for each )  and   stack.lastElement()   to get them and compare 


//Let's suppose that we find a pair in step i in the iteration, it means that the characterss[i] and s[i - 1] make a pair. We should ignore the s[i] and remove s[i - 1] from the end of the good string. Otherwise, we should add s[i] to the end of the good string.

//Complexity Analysis
//Let n  be the length of the input string s.
//
//Time complexity: O(n)
//
//We only need one iteration over s.
//At each step, we either remove the last character from stack, or add a character to stack, both of which take constant time.
//Therefore, the overall time complexity is O(n)

//Space complexity: O(n)
//
//We use a stack to store all the characters we encounter. 
//Since we only pop characters when finding a pair, in worst-case scenario, 
//we may have O(n)  characters stored in stack. Thus the space complexity is O(n).

package com.leetcode;

import java.util.Stack;

public class Leetcode_1544_try2_StringBuilder_practise {
	public String makeGood(String s) {
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (!stack .isEmpty()&& Math.abs(stack.lastElement()-c)==32 ) {
				stack.pop();
			}else {
				stack.add(c);
			}
		}
		StringBuilder  sb = new StringBuilder    () ;
		for (char c : stack) {
			sb.append(c);
		}
		
		return sb.toString();
	}
}
