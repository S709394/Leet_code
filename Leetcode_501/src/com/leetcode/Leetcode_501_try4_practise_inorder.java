package com.leetcode;

import java.util.ArrayList;
import java.util.List;

//import com.leetcode.Leetcode_501_try3_inorder.TreeNode;

//import com.leetcode.Leetcode_501_try3_inorder.TreeNode;

public class Leetcode_501_try4_practise_inorder {
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

	// the max of the node val the count ( numbers) of how many the "max val " in
	// the bst

	// int prev int cnt int max
	Integer prev = null;
	int cnt = 1;
	int max = 0;

	public int[] findMode(TreeNode root) {
		if (root == null) {
			return new int[0];
		}
		List<Integer> res = new ArrayList<Integer>();
		traverse(root, res);

		int size = res.size();
		int[] ans = new int[size];
		for (int i = 0; i < size; i++) {
			ans[i] = res.get(i);
		}

		return ans;
	}

	private void traverse(TreeNode root, List<Integer> list) {
		if (root == null) {
			return;
		}
		traverse(root.left, list);

		if (prev != null) {
			if (root.val == prev) {
				cnt++;
			} else {
				cnt = 1;
			}

		}

		if (cnt > max) {

			max = cnt;
			list.clear();
			list.add(root.val);

		} else if (cnt == max) {
			list.add(root.val);
		}

		prev = root.val;

		traverse(root.right, list);

	}

}
