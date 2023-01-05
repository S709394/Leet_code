package com.leetcode;

public class Leetcode_404_try2 {
	public static class TreeNode {
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

//		static int res = 0;

		int res = 0;

		public int sumOfLeftLeaves(TreeNode root) {

			helper(root, false);
			return res ;
		}

		public void helper(TreeNode root, boolean isLeft) {

			if (root == null) {
				return;
			}
			if (root.right == null && root.left == null) {
				if (isLeft) {
					res += root.val;
				}
			}
			helper(root.left, true);
			helper(root.right, false);
		}
	}

}