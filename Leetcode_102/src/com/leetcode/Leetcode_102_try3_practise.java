package com.leetcode;

import java.util.List;
import java.util.ArrayList;

//Runtime
//0 ms
//Beats
//100%
//Memory
//42.7 MB
//Beats
//68.26%

/*Idea :
 * 
 * use a DFS way to go through the whole root
 * 
 * https://www.youtube.com/watch?v=0Rk6Rty9bFo
 * 
 * 
 * */

public class Leetcode_102_try3_practise {
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
		List<List<Integer>> res = new ArrayList<>();
		dfs(res, new ArrayList<Integer>(), 0, root);
		return res;
	}

	static void dfs(List<List<Integer>> res, ArrayList<Integer> list, int level, TreeNode root) {
		if (root == null) {
			return;
		}

		if (level == res.size()) {
			res.add(new ArrayList<Integer>());
		}

		res.get(level).add(root.val);

		dfs(res, new ArrayList<Integer>(), level + 1, root.left);
		dfs(res, new ArrayList<Integer>(), level + 1, root.right);
//		return res ;

	}
}
