package com.leetcode;


//Should be try3 , not try2 
public class Leetcode_100_try2_practise {
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

	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p==null && q ==null ) {
			return true ;
		}
		
		if (p==null &&  q!=null ) {
			return false ;
		}
		if (q==null &&  p!=null ) {
			return false ;
		}
		
		if (p!= null  && q != null) {
			
			
			return( p.val== q.val )&&isSameTree(p.left, q.left) && isSameTree (p.right,q.right);
			
			
			
		}
		return true;
		
	}
}
