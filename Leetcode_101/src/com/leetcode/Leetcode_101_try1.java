package com.leetcode;

public class Leetcode_101_try1 {

	public class TreeNode {
		int val;
		TreeNode lRoot;
		TreeNode rRoot;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode lRoot, TreeNode rRoot) {
			this.val = val;
			this.lRoot = lRoot;
			this.rRoot = rRoot;
		}
	}

	public boolean isSymmetric(TreeNode root) {
		if (root == null ) {
			return true ;
		}
		
		return isMirror (root.lRoot ,root.rRoot);
	}

	public static boolean isMirror(TreeNode lRoot, TreeNode rRoot) {
		if (lRoot==null && rRoot==null) return true ;
		
		if (lRoot==null || rRoot==null||lRoot.val!=rRoot.val) return false;
		
		
		return  isMirror (lRoot.lRoot ,rRoot.rRoot) && isMirror (rRoot.lRoot ,lRoot.rRoot)
	}
}
