package com.leetcode;
//

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//import Leetcode_103_try1.TreeNode;

//Using queue but not recursive 

public class Leetcode_102_try4 {
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

	public static List<List<Integer>> levelOrder(TreeNode root) {
		ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
		if (root == null) {
			return res;
		}
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()) {
			int size = q.size();

			// mark the curr level as LinedList
			List<Integer> level = new LinkedList<>();
			for (int i = 0; i < size; i++) {
				TreeNode curr = q.poll();
				level.add(curr.val);
				if (curr.left != null) {
					q.offer(curr.left);
				}
				if (curr.right != null) {
					q.offer(curr.right);
				}

			}
			res.add(level);
		}
		return res;

	}
}
