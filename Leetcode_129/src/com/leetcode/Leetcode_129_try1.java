package com.leetcode;

//import com.leetcode.Leetcode_101_try2_practise.TreeNode;

public class Leetcode_129_try1 {
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

	public int sumNumbers(TreeNode root) {

		return getSum(root, 0);
	}

	public int getSum(TreeNode root, int curSum) {
		if (root == null)
			return 0;

		curSum = curSum * 10 + root.val;

		if (root.left == null && root.right == null) {
			return curSum; 
			
		}
		
		int leftSum =  getSum(root.left, curSum  );
		
		int rightSum = getSum (root.right,curSum);

		return leftSum +rightSum ;
//		return (getSum(root.left, curSum) + getSum(root.right, curSum ));
	}
}
