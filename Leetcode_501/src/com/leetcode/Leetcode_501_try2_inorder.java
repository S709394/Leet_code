package com.leetcode;

//import com.leetcode.Leetcode_501_try1_inorder.TreeNode;

public class Leetcode_501_try2_inorder {
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

	static int max = 0, cnt = 0;

	static TreeNode prev = null;

//	traverse

	// public static int[] findMode(TreeNode root) {
	public static int[] findMode(TreeNode root) {
		if (root == null) {
			return new int[0];
		}

		traverse(root.left);

		
		
		prev = root ;
		traverse(root.right);

	}

	public static void traverse(TreeNode node) {

	}
}
