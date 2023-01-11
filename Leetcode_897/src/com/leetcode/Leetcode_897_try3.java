package com.leetcode;

import java.util.Stack;

import com.leetcode.Leetcode_897_try2.TreeNode;

public class Leetcode_897_try3 {
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
		TreeNode dummy =  new TreeNode  (-1 ) ;
		
		TreeNode pre = dummy ;
		
		Stack <TreeNode> stack = new Stack <> () ;
		
		while (!stack.isEmpty()  || root !=null) {
			while (root !=null) {
				stack .push(root);
				
				root = root.left
				
			}
			
		}
		
	}
}
