package com.leetcode;

import java.util.ArrayList;
import java.util.List;

//import javax.swing.tree.TreeNode;

public class Leetcode_515_try1 {
	// https://leetcode.com/problems/find-largest-value-in-each-tree-row/solutions/1368671/java-easy-approach-with-expanation-recursive-preorder/?envType=daily-question&envId=2023-10-24d
	
//	private List<Integer> ansList = new ArrayList<>();\
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

	public static List<Integer> largestValues(TreeNode root) {
		/// try1
		List<Integer> res = new ArrayList<>();

		helper(root, res, 0);
		return res;
	}

	public static void helper(TreeNode node, List<Integer> res, int d) {

		if (node == null)
			return;

		// the new level of the nodes
		if (res.size() == d) {
			res.add(node.val);

		} else {
			res.set(d, Math.max(res.get(d), node.val));
		}
		helper(node.left, res, d + 1);
		helper(node.right, res, d + 1);
		
	}
}
