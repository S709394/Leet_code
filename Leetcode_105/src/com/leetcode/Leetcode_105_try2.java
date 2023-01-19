package com.leetcode;

import java.util.HashMap;

//import com.leetcode.Leetcode_105_try1.TreeNode;

public class Leetcode_105_try2 {
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

	HashMap<Integer, Integer> valToIdx = new HashMap<>();

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		int pLen = preorder.length;
		int iLen = inorder.length;

		// *** try pre length
		for (int i = 0; i < pLen; i++) {
			valToIdx.put(preorder[i], i);
		}

		return build(preorder, 0, pLen, inorder, 0, iLen);
	}

	public TreeNode build(int[] preorder, int preStart, int preEnd,
			int[] inorder, int inStart, int inEnd) {
		// root val

		// 
		if (preStart > preEnd) {
			return null;
		}

		int rootVal = preorder[preStart];
		// index (of the root)

		int index = valToIdx.get(rootVal);

		// leftSize

		int leftSize = index - inStart;

		TreeNode root = new TreeNode(rootVal);

		root.left = build(preorder, preStart + 1, preStart + leftSize, inorder, inStart, index - 1);

		root.right = build(preorder, preStart + leftSize + 1, preEnd, inorder, index + 1, inEnd);

		return root;
	}

}
