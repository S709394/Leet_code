package com.leetcode;

import java.util.Stack;

import com.leetcode.Leetcode_try1_inOrder.TreeNode;

public class Leetcode_98_try2_inOrder {
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

		long min = (-Long.MAX_VALUE);

		while (root != null || !stack.isEmpty()) {

			while (root != null) {
				stack.push(root);
			}

			root = stack.pop();
//			if (root.val <= root.left.val) {//wrong
			if (root.val <= min) {
				return false;
			}
			min=root.val;
			
			root=root.right;
			

//			

		}

		return true;
	}

}
