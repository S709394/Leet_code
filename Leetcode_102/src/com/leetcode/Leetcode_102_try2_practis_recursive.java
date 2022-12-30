package com.leetcode;

import java.util.List;

import java.util.ArrayList;

//import com.leetcode.Leetcode_102_try1_recursion.TreeNode;

public class Leetcode_102_try2_practis_recursive {
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

	public List<List<Integer>> levelOrder(TreeNode root) {

	}

	public void dfs(TreeNode root, List<List<Integer>> res, List<Integer> list, int level) {
		if (root == null) {
			return;
		}
		if (level == list.size()) {
			res.add(new ArrayList<Integer>());
		}
	}
}
