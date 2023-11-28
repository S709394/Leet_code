package com.leetcode;

public class Leetcode572_try1 {
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

	public static void main(String[] args) {

	}

	public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
		// works well 
		boolean isValid = false;
		if (root == null && subRoot == null) {
			return true;
		}

		if (isSame(root, subRoot)) {
			return true;
		}

		else if (root.left != null && isSubtree(root.left, subRoot)) {
			isValid = true;
		} else if (root.right != null && isSubtree(root.right, subRoot)) {
			isValid = true;
		}

//			if (isSame(root, subRoot)) {
//				return true;
//			}

//		if (root.val != subRoot.val) {
//			return false;
//		}
//		if (root.left != root.left || root.right != root.right) {
//			return false;
//		} else {
//
//		}

		return isValid;

	}

	// subRoot
	public static boolean isSame(TreeNode root, TreeNode subRoot) {
		if (root == null && subRoot == null) {
			return true;
		} else if (root == null || subRoot == null) {
//			System.out.println("a2567");
			return false;
		}

		if (root.val != subRoot.val) {
//			System.out.println("a1231");
			return false;
			
		}
		return isSame(root.left, subRoot.left) && isSame(root.right, subRoot.right);
	}

}
