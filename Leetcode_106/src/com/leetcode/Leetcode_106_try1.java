package com.leetcode;

import java.util.HashMap;

//import com.leetcode.Leetcode_105_try4_practise.TreeNode;

public class Leetcode_106_try1 {
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
		// A hashMap to store the val &&idx
	}

	HashMap<Integer, Integer> valToIdx = new HashMap<>();

	public TreeNode buildTree(int[] inorder, int[] postorder) {
		for (int i = 0; i < inorder.length; i++) {
			valToIdx.put(inorder[i], i);

		}
		return build(postorder, 0, postorder.length - 1, inorder, 0, inorder.length - 1);
	}

	public TreeNode build(int[] inOrder, int inStart, int inEnd, int[] postOrder, int postStart, int postEnd) {
		if (inStart > inEnd) {
			return null;
		}

		int rootVal = postOrder[postEnd];

		int index = valToIdx.get(rootVal);
		int leftSize = index - inStart;

		TreeNode root = new TreeNode(rootVal);

		root.left = build(inOrder, inStart, index - 1, 
				postOrder, postStart, leftSize + postStart-1);
		root.right = build(inOrder, index + 1, inEnd, postOrder, leftSize + postStart + 1, postEnd - 1);
		return root;
	}
}
