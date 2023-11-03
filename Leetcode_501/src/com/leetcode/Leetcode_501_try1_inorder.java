package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_501_try1_inorder {
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

	static TreeNode prev = null;
	static int count = 1;
	static int max = 0;

	public static int[] findMode(TreeNode root) {
		if (root == null) {
			return new int[0];
		}

		List<Integer> modes = new ArrayList<>();

		traverse(root, modes);

	}

	public static void traverse(TreeNode root, List<Integer> modes) {
		if (root == null) {
			return;
		}
		traverse(root.left, modes);
		if (root.val == prev.val) {
			count ++ ;
		}else {
			count --;
		}
		
		if ( count > max ) {
			max=count ;
			modes.clear();
			modes.add(root.val);
				
		}else if (count ==max) {
			modes.add(root.val);
		}
		prev = root;
		traverse(root.right, modes);

	

	}
}
