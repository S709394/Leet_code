/*Leetcode 98
 * 
 * */

/* Idea: 
 * 
 * 
 * */

package com.leetcode;

import java.util.Stack;

import com.leetcode.Leetcode_98_try3_practise.TreeNode;



public class Leetcode_try4_practise2 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	 public boolean isValidBST(TreeNode root) {
		 Stack <TreeNode> stack = new Stack<TreeNode> ();
			
			
			long  min_left_child= ( - Long.MAX_VALUE);
			
			while (root!=null || !stack.isEmpty()) {
				
				
				//put the lefts till the   inOrder pos 0(very
				while (root!=null) {
					stack.push(root);
					root=root.left;
				}
				
				root = stack.pop();
				if(root.val<=min_left_child) {
					return false;
				}
				min_left_child = root.val;
				
				root= root.right;
				
			}
			
			return true;
	      
    }
}
