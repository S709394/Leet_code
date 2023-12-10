package com.leetcode;

import com.leetcode.Leetcode_try2_recursive.TreeNode;

public class Leetcode_try3_practise {
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

	public TreeNode invertTree(TreeNode root) {

		if (root == null) {
			return null;
		}

		if (root.left != null) {
			root.left = invertTree (root.left);
		}

		if (root.right != null) {
			root.right = invertTree (root.right);
		}
		
		TreeNode temp = new TreeNode () ;
		
		temp = root.left;
		root.left=root.right;
		root.right= temp;
		
		return root;

	}
	
}
