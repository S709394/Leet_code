package com.leetcode;

import java.util.HashMap;

//import com.leetcode.Leetcode_105_try4_practise.TreeNode;

//import com.leetcode.Leetcode_105_try4_practise.TreeNode;


//Does not works
public class Leetcode_106_try3_move_base_to_build_practise {
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

//	HashMap<Integer, Integer> valToIdx = new HashMap<>();

	public TreeNode buildTree(int[] postorder, int[] inorder) {

		return build(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);

	}

	public TreeNode build(int[] inOrder, int inStart, int inEnd, int[] postOrder, int posStart, int posEnd) {
		if (inStart > inEnd || posStart > posEnd) {
			return null;
		}
//		for (int i = 0; i < inOrder.length; i++) {
//			valToIdx.put(inOrder[i], i);
		
		
//		}
		TreeNode root = new TreeNode(postOrder[posEnd]);

//		int rootVal = postOrder[posEnd];

//		int index = valToIdx.get(rootVal);
		int index = 0;
		
		for (int i = 0 ; i < inOrder.length  ; i ++) {
			if(root.val==inOrder[i]) {
				index = i ;
				break;
			}
		}
		
		

		int leftSize = index - inStart;

		
		root.left = build(inOrder, inStart, index - 1, 
				postOrder, posStart, posStart + leftSize-1);
		root.right = build(inOrder, index , inEnd, 
				postOrder, posStart + leftSize , posEnd - 1);
		return root; 
	}

}
