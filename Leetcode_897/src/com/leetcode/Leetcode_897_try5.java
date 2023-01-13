package com.leetcode;

import java.util.Stack;

//import com.leetcode.Leetcode_897_try4.TreeNode;

public class Leetcode_897_try5 {
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
	
	
//	TreeNode cur ;
	public TreeNode increasingBST(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();

		TreeNode dummy = new TreeNode(-1);

		TreeNode pre = dummy;
		while (!stack.isEmpty() || root != null) {
			while (root != null) {
				stack.push(root);
				root = root.left;
			}

			root = stack.pop();
			pre.left = null;
			pre.right = root;

			pre = root;

			root = root.right;

		}
		return dummy.right;
	}
}
