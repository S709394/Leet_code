package com.leetcode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
public class Leetcode_530_try1 {

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

	int diff;

	public int getMinimumDifference(TreeNode root) {
		diff = Integer.MAX_VALUE;
		
		get_min_diff(root);
		return diff;

	}

	public void get_min_diff(TreeNode root) {
		if (root != null) {
			if (root.left != null) {
				if (root.val > root.left.val) {
					diff = Math.min(diff, root.val - root.left.val);
				} else {
					diff = Math.min(diff, root.left.val - root.val);
				}
				
				get_min_diff(root.left) ;
			}
			if (root.right != null) {
				if (root.val > root.right.val) {
					diff = Math.min(diff, root.val - root.right.val);
				} else {
					diff = Math.min(diff, root.right.val - root.val);
				}
				get_min_diff(root.right) ;
			}
			
			
		}
	}
}
