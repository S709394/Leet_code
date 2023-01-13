package com.leetcode;

import java.util.Stack;

//import com.leetcode.Leetcode_897_try1.TreeNode;

//Runtime
//0 ms
//Beats
//100%
//Memory
//39.8 MB
//Beats
//93.18%
//https://leetcode.com/problems/increasing-order-search-tree/submissions/876170091/
public class Leetcode_897_try2 {
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

//	TreeNode cur ;
	public TreeNode increasingBST(TreeNode root) {

		TreeNode dummy = new TreeNode(-1);

		Stack<TreeNode> stack = new Stack<>();


		TreeNode prev = dummy;
		
		
		while (!stack.isEmpty() || root != null) { 
			// Not reach the very left Node yet 
			while (root !=null) {
				stack.push(root);
				root = root.left;
				
			}
			root= stack.pop();
			root.left = null ;
			
			//Add to the right node 
			prev .right = root  ; 
			prev=root ;
			
			//Start from the next level 
			root=root.right ;
			
		}
		return dummy .right;

	}
}
