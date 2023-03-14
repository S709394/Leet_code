//Idea : recursive 
package com.leetcode;

public class Leetcode_101_try2_practise {

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

	public boolean isSymmetric(TreeNode root) {
		if(root==null) return true ;
		
		return isSymmetric (root.lRoot,root.rRoot);
		
	}
	public boolean isSymmetric (TreeNode lRoot , TreeNode rRoot) {
		if(lRoot==null &&rRoot==null) return true;
		if(lRoot==null ||rRoot==null || lRoot.val!=rRoot.val) return false ;
		
		return  isSymmetric (lRoot.lRoot , rRoot.rRoot) &&  isSymmetric(lRoot.rRoot,rRoot.lRoot);
		
	}
	
}
