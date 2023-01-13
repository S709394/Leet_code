package com.leetcode;

//import com.leetcode.Leetcode_513_try3_noLinkedList.TreeNode;

public class Leetcode_513_try4_practise {
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

	static int[] res = new int[2];

	public int findBottomLeftValue(TreeNode root) {

		return helper(res, root, 1);
	}

	public static int helper(int[] res, TreeNode node, int depth) {

		if (depth > res[0]) {
			res[0] = depth;
			res[1] = node.val;

		}

		if (node.left != null) {
			helper(res, node.left, depth + 1);
		}
		if (node.right != null) {
			helper(res, node.right, depth + 1);
		}
		return res[1];

//		if (node == null) {
//			return;
//		}
//
//		if (level > res[0]) {
//			res[0] = level;
//			res[1] = node.val;
//		}
//
////		if (node != null) {
////			res [0] = level ;
//		if (node.left != null) {
//			helper(res, node.left, level + 1);
//		}
//		if (node.right != null) {
//			helper(res, node.left, level + 1);
//		}
//		
//		
	}

}
