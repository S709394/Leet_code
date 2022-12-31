package com.leetcode;

import java.util.List;

import java.util.ArrayList;

//import com.leetcode.Leetcode_102_try1_recursion.TreeNode;

/*Idea :
 * 
 * use a DFS way to go through the whole root
 * 
 * https://www.youtube.com/watch?v=0Rk6Rty9bFo
 * 
 * 
 * */

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
		ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
		dfs(root, res, new ArrayList<Integer>(), 0);
		return res;

	}

	public void dfs(TreeNode root, List<List<Integer>> res, List<Integer> list, int level) {
		if (root == null) {
			return;
		}
		
		//Add a list when reach a new level
		if (level == res.size()) {
			res.add(new ArrayList<Integer>());
		}

		res.get(level).add(root.val);
//		list.add(root.val);  //wrong 

//		dfs(root.left, res, list, level + 1); //wrong 
//		dfs(root.right, res, list, level + 1); //wrong 
		dfs(root.left, res, new ArrayList<Integer>(), level + 1); // wrong
		dfs(root.right, res, new ArrayList<Integer>(), level + 1); // wrong

	}
}
