package com.leetcode;

public class Leeetcode_222_try1 {
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

	public int countNodes(TreeNode root) {
		TreeNode  l = root  , r= root;
//		leftHeight  /  rightHegit
		int lHeight =0 , rHeight =0 ;
		
		while (l!=null) {
			l=l.left;
			lHeight++;
		}
		while (r!=null) {
			r=r.right;
			rHeight++;
		}
		
		if(rHeight == lHeight) {
			System.out.println((int)Math.pow(2,rHeight)-1); //test
			return (int)Math.pow(2,rHeight)-1;
		}
		
		return countNodes(root.left)+ countNodes(root.right) +1;
		
		
		
	}
}
