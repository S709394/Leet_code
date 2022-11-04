package com.leetcode;

//import com.leetcode.Leetcode_110_try1_recursive.TreeNode;

public class Leetcode_110_try2_recusive_practise {
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

	public boolean isBalanced(TreeNode root) {
		if (root == null)
			return true;
		if (getHeight(root) == -1) {
			return false;
		}
		return true;
	}

	// getHeight
	public static int getHeight(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int leftHeight = getHeight(root.left);
		int rightHeight = getHeight(root.right);
		
		if (leftHeight ==-1 || rightHeight==-1) {
			return -1;
		}
		if (Math.abs(leftHeight -rightHeight) >1) {
			return -1 ;
		}
		

		return Math.max(leftHeight, rightHeight) + 1;
	}
}
