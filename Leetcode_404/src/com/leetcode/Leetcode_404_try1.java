package com.leetcode;

public class Leetcode_404_try1 {
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

		public  int sumOfLeftLeaves(TreeNode root) {
			helper(root, false);
			return res;
		}
		
		
		// isLeft means this root is the left root  of it's parent root
		public  void helper(TreeNode root, boolean isLeft) {
			if (root == null) {
				return;
			}

			if (root.left == null && root.left == null) {

				if (isLeft) {
					res += root.val;
				}
			}
//			if (root.left != null && root.right != null) {
//				res -= root.val;
//			}
			helper(root.left, true);
			helper(root.right, false);

		}
	}

}
