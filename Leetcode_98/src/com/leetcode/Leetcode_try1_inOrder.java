
/*Idea :
 *  Inorder way 
 *  Stack <TreeNode>
 * */
package com.leetcode;

import java.util.Stack;

public class Leetcode_try1_inOrder {
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
		Stack<TreeNode> stack = new Stack<TreeNode>();

		//do long better ?
		//long left_child_val = -Long.MAX_VALUE;	
		double left_child_val = -Double.MAX_VALUE; 
		
		while (!stack.isEmpty() || root != null) {		
			
			//Pushing till the "very beginning of the inOrder Left one"
			while (root != null) {
				stack.push(root);
				root =root.left;  /// miss here
			}

			//Start to take care of "right node"
			root = stack.pop();
			if (root.val <= left_child_val) {
				return false;
			}

			left_child_val = root.val;
			root = root.right;
		}
		return true;	
	}
}
