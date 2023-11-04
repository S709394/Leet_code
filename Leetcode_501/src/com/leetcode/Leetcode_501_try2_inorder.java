package com.leetcode;

//import com.leetcode.Leetcode_501_try1_inorder.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Leetcode_501_try2_inorder {
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

	static int max = 0, cnt = 0;

	static TreeNode prev = null;

//	traverse

	// public static int[] findMode(TreeNode root) {
	public static int[] findMode(TreeNode root) {
		if (root == null) {
			return new int[0];
		}

		List<Integer> modes = new ArrayList<>();

		traverse(root, modes);

		int[] res = new int[modes.size()];
		for (int i = 0; i < modes.size(); i++) {
			modes.get(i);
		}

		return res;

	}

	public static void traverse(TreeNode node, List<Integer> modes) {
		if (node == null) {
			return;
		}
		traverse(node.left, modes);
		// The first one 
		if (prev != null) {
			cnt++;
		} else {
			cnt--;
		}
		
		if (cnt > max ) {
			max=cnt ;
			modes.clear();
			modes.add(node);
		}

		prev = node;

		traverse(node.right, modes);

	}
}
