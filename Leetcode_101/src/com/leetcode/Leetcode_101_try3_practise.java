package com.leetcode;

//import com.leetcode.Leetcode_101_try2_practise.TreeNode;

//import com.leetcode.Leetcode_101_try2_practise.TreeNode;

public class Leetcode_101_try3_practise {
	// Try 3 Mar 13 2023 Leetcode daily
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
		if (root == null)
			return true;

		return isSymmetric(root.left, root.right);
	}

	public boolean isSymmetric(TreeNode lRoot, TreeNode rRoot) {
		if (lRoot ==null &&rRoot == null) return true ;
		
		if (rRoot ==null || lRoot ==null  || rRoot .val!= lRoot.val)  return false ;
		return    isSymmetric(rRoot.right, lRoot.left) &&  isSymmetric( rRoot.left, lRoot.right ) ;
		
	}
}
