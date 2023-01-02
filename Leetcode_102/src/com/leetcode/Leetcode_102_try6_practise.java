package com.leetcode;

import java.util.List;
import java.util.Queue;

//import com.leetcode.Leetcode_102_try5_practise.TreeNode;

//import java.util.ArrayList;
import java.util.LinkedList;

public class Leetcode_102_try6_practise {
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
		List<List<Integer>> res = new LinkedList<>();
		if (root == null)
			return res;
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()) {
			List<Integer> list = new LinkedList<>();
			int size = q.size();
			
			for (int i = 0; i < size; i++) {
				TreeNode curr = q.poll();
				list.add(curr.val);
				if (curr.left != null) {
					q.offer(curr.left);
				}
				if (curr.right != null) {
					q.offer(curr.right);
				}
			}
			
			res.add(list);
		}
		return res;
	}
}
