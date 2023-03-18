package com.leetcode;

import java.util.HashMap;

//import com.leetcode.Leetcode_129_try1.TreeNode;

public class Leetcode_106_try9_practise {
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

	public TreeNode buildTree(int[] inOrder, int[] postOrder) {
		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int i = 0; i < inOrder.length; i++) {
			hm.put(inOrder[i], i);
		}

		int rootVal = postorder[postorder.length - 1];
		//index of the 
		int index = hm.get( rootVal );
		
		int leftRootSize =  index;

	}
}
