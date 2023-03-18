package com.leetcode;

import java.util.HashMap;

//import com.leetcode.Leetcode_105_try4_practise.TreeNode;

//import com.leetcode.Leetcode_105_try4_practise.TreeNode;


//Does not works
public class Leetcode_106_try3_move_base_to_build_practise {
	public class TreeNode {
		int val;
		TreeNode lRoot;
		TreeNode rRoot;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode lRoot, TreeNode rRoot) {
			this.val = val;
			this.lRoot = lRoot;
			this.rRoot = rRoot;
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
		
		

		int lRootSize = index - inStart;

		
		root.lRoot = build(inOrder, inStart, index - 1, 
				postOrder, posStart, posStart + lRootSize-1);
		root.rRoot = build(inOrder, index , inEnd, 
				postOrder, posStart + lRootSize , posEnd - 1);
		return root; 
	}

}
