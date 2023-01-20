package com.leetcode;

import java.util.HashMap;

//import com.leetcode.Leetcode_105_try1.TreeNode;

//import com.leetcode.Leetcode_105_try1.TreeNode;



//Runtime
//2 ms
//Beats
//98.45%
//Memory
//42.1 MB
//Beats
//74.1%
public class Leetcode_105_try3 {
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

		HashMap<Integer, Integer> valToIdx = new HashMap<>();

		public TreeNode buildTree(int[] preorder, int[] inorder) {
			// a for loop to fill the HashMap
			int pLen = preorder.length;
			int iLen = inorder.length;
			for (int i = 0; i < pLen; i++) {
				valToIdx.put(inorder[i], i);
			}
			return build(preorder, 0, pLen-1, inorder, 0, iLen-1);

		}

		public TreeNode build(int[] preOrder, int preStart, int preEnd, int[] inOrder, int inStart, int inEnd) {
			if (preStart > preEnd) {
				return null;
			}
			// rootVal
			int rootVal = preOrder[preStart];
			// index
			int index = valToIdx.get(rootVal);
			// leftSize  
			int leftSize = index - inStart;  //not preStart

			TreeNode root = new TreeNode(rootVal);

			root.left = build(preOrder, preStart + 1, preStart + leftSize, inOrder, 
					inStart, index - 1);
			root.right = build(preOrder, preStart + leftSize + 1, preEnd,
					inOrder, index + 1, inEnd);

			return root;
		}

	}
}
