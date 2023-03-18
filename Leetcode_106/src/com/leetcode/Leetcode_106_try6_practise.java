package com.leetcode;

import java.util.HashMap;

//import com.leetcode.Leetcode_106_try2_practise.TreeNode;

//import com.leetcode.Leetcode_106_try2_practise.TreeNode;

public class Leetcode_106_try6_practise {
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
	HashMap <Integer, Integer> valToIdx = new HashMap <> () ;
	
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		
		for (int i = 0 ; i < inorder .length  ; i ++) {
			valToIdx .put(inorder[i], i);
		}
		
		return build (inorder ,0 , inorder.length-1 , postorder ,0, postorder.length-1);
		
	}
	
	public TreeNode  build ( int [] inOrder , int inStart  , int inEnd
			,int [] postOrder ,int postStart , int postEnd) {
		
		if (inStart > inEnd)
		 return null;
		int rootVal = postOrder [postEnd] ;
		int index  = valToIdx.get(rootVal) ;
		
		int lRootSize =  index - inStart ;
		
		TreeNode root = new TreeNode (rootVal) ;
		
		root.lRoot = build  (inOrder , inStart , index-1 , postOrder ,
				postStart ,postStart+lRootSize-1 );
		root.rRoot = build (inOrder , index +1 ,inEnd , postOrder,postStart+lRootSize, postEnd-1);
				
		
		return root ;
		
	}
	
}
