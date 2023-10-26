package com.leetcode;

import java.util.ArrayList;
import java.util.List;

//import com.leetcode.Leetcode_515_try1.TreeNode;

public class Leetcode_515_try2_practise {
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

//	static List<Integer> res = new ArrayList<>();

	public static List<Integer> largestValues(TreeNode root) {
		
		//try 2 
		List<Integer> res = new ArrayList<>();
		helper(root, res, 0);

		return res;

	}

	public static void helper(TreeNode root, List<Integer> res, int d) {
		if (root == null) {   
			return;
		}
		if (d == res.size()) {  // start the new depth of the root 
			res.add(root.val);
		} else {   // update the Max num of each depth
			res.set(d, Math.max(res.get(d), root.val));

		}

		// do not forget do the same thing to left and right 
		helper(root.left, res, d + 1);
		helper(root.right, res, d + 1);

	}
}
