package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_501_try1_inorder {
	
	//works in try3
	//https://leetcode.com/problems/find-mode-in-binary-search-tree/solutions/98100/java-4ms-beats-100-extra-o-1-solution-no-map/
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

	static Integer prev = null;
	static int count = 1;
	static int max = 0;

	public static int[] findMode(TreeNode root) {
		if (root == null) {
			return new int[0];
		}

		List<Integer> modes = new ArrayList<>();

		traverse(root, modes);

		int[] res = new int[modes.size()];

		for (int i = 0; i < modes.size(); i++) {
			res[i] = modes.get(i);
		}
		return res;
	}

	public static void traverse(TreeNode root, List<Integer> modes) {
		if (root == null) {
			return;
		}
		traverse(root.left, modes);
		if (prev!= null) {
			count++;
		} else {
			count--;
		}

		if (count > max) {
			max = count;
			modes.clear();
			modes.add(root.val);

		} else if (count == max) {
			modes.add(root.val);
		}
		prev = root.val;
		traverse(root.right, modes);

	}
}
