package com.leetcode;

import com.leetcode.Leetcode572_try1.TreeNode;

public class Leetcode_572_try2_practise {
	public static void main(String[] args) {

	}

	public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
		//try2
//		boolean isValid = false;

		if (root == null && subRoot == null) {
			return true;
		}
		if (isSame(root, subRoot)) {
			return true;
		}

		if (root.left != null && isSubtree(root.left, subRoot)) {
			return true;
		}

		if (root.right != null && isSubtree(root.right, subRoot)) {

			return true;

		}

		return false;
	}

	// subRoot
	public static boolean isSame(TreeNode root, TreeNode subRoot) {
		if (root == null && subRoot == null) {
			return true;
		}

		if (root == null || subRoot == null) {
			return false;
		}

		if (root.val != subRoot.val) {
			return false;
		}

		return isSame(root.left, subRoot.left) && isSame(root.right, subRoot.right);
	}
}
