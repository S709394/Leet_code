//Idea  : 
//https://leetcode.com/problems/balanced-binary-tree/discuss/2428871/Very-Easy-oror-100-oror-Fully-Explained-(C%2B%2B-Java-Python-JavaScript-Python3)

package com.leetcode;

public class Leetcode_110_try1_recursive {
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

	public boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;

		}

		if (getHeight(root) == -1) {
			return false;
		}

		return true;
	}
// if the the Height > than 1   ,return  -1   else  return it's height 
	public int getHeight(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int leftHeight = getHeight(root.left);
		int rightHeight = getHeight(root.right);

		if (leftHeight == -1 || rightHeight == -1) {
			return -1;
		}

		//  The  difference between  rightHeight and leftHeight should  <= 1
		if (Math.abs(rightHeight - leftHeight) > 1) {
			return -1;
		}

		return Math.max(leftHeight, rightHeight) + 1;
	}
}
