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

	HashMap<Integer, Integer> hm = new HashMap<>();

	public TreeNode buildTree(int[] inOrder, int[] postOrder) {

		int inLength = inOrder.length, postLength = postOrder.length;
		for (int i = 0; i < inOrder.length; i++) {
			hm.put(inOrder[i], i);
		}

		return buildTree(inOrder, 0, inLength - 1, postOrder, 0, postLength - 1);
	}

	public TreeNode buildTree(int[] inOrder, int inStart, int inEnd, int[] postOrder, int postStart, int postEnd) {

		if (inStart > inEnd) {
			return null;
		}

//		int rootVal = postOrder[postOrder.length - 1];//wrong  
		int rootVal = postOrder[postEnd];// wrong
		// index of the
		int index = hm.get(rootVal);

		int leftRootSize = index - inStart;
		TreeNode node = new TreeNode(rootVal);
		node.left = buildTree(inOrder, inStart, index - 1, postOrder, postStart, postStart + leftRootSize - 1);
		node.right = buildTree(inOrder, index + 1, inEnd, postOrder, postStart + leftRootSize, postEnd - 1);
		return node;
	}
}
