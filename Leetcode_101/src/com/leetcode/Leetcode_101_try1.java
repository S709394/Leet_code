package com.leetcode;

public class Leetcode_101_try1 {

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

	public boolean isSymmetric(TreeNode root) {
		if (root == null ) {
			return true ;
		}
		
		return isMirror (root.left ,root.right);
	}

	public static boolean isMirror(TreeNode lRoot, TreeNode rRoot) {
		if (lRoot==null && rRoot==null) return true ;
		
		if (lRoot==null || rRoot==null||lRoot.val!=rRoot.val) return false;
		
		
		return  isMirror (lRoot.left ,rRoot.right) && isMirror (rRoot.left ,lRoot.right)
	}
}
