package com.leetcode;

import java.util.HashMap;

//Runtime
//2 ms
//Beats
//98.57%
//Memory
//41.9 MB
//Beats
//90.70%


//import com.leetcode.Leetcode_513_try6_practise.TreeNode;

//Idea from https://labuladong.github.io/algo/di-yi-zhan-da78c/shou-ba-sh-66994/dong-ge-da-172f0/
//No idea  so far 

public class Leetcode_105_try1 {
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

	HashMap<Integer, Integer> valToIndex = new HashMap<>();

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		for (int i = 0; i < inorder.length; i++) {
			valToIndex.put(inorder[i], i);
		}
		return build(preorder, 0, preorder.length - 1,
				inorder, 0, inorder.length - 1);

	}
	
	public TreeNode build ( int []  preorder , int preStart , int preEnd,
			int [] inorder ,  int inStart  , int inEnd) {
		
		//???
		if (preStart > preEnd) {
			return null ;
		}
		//root here 
		int rootVal = preorder[preStart] ;
		
		//Index in 
		int index = valToIndex .get(rootVal);
		
		int leftSize = index - inStart ;
		
		//Start to build 
		TreeNode root = new TreeNode (rootVal);
		
		//Build the left and right using recursive 
		root.left = build (preorder , preStart+1 ,preStart+leftSize 
				,inorder,inStart , index -1);
		root.right =build (preorder , preStart+leftSize+1 ,preEnd,
				inorder,index+1 , inEnd);
		
		return root ;
	}
	
	
}
