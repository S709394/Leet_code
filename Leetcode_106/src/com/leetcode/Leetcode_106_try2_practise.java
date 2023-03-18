package com.leetcode;

import java.util.HashMap;

//import com.leetcode.Leetcode_105_try4_practise.TreeNode;

public class Leetcode_106_try2_practise {
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

	}

	// HashMap

	HashMap<Integer, Integer> valToIdx = new HashMap<>();

	public TreeNode buildTree(int[] inorder, int[] postorder) {
		// inOrder to fill the HashMap
		for (int i = 0; i < inorder.length; i++) {
			valToIdx.put(inorder[i], i);
		}

		return build(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
	}

	TreeNode build(int[] inorder, int inStart, int inEnd, int[] postOrder, int posStart, int postEnd) {
		//base case
		
		if(inStart>inEnd ||posStart > postEnd)
		{
			return null;
		}
		// rootVal
		int rootVal = postOrder[postEnd];
		// index
		int index = valToIdx.get(rootVal);

		int lRootSize = index - inStart;

		TreeNode root = new TreeNode(rootVal);
		
		root.lRoot = build (inorder , inStart , index -1  ,
				postOrder  , posStart ,posStart+lRootSize-1);
		root.rRoot = build (inorder,index+1, inEnd ,
				postOrder , posStart+lRootSize ,postEnd-1) ;
		return root ;
	}

}
