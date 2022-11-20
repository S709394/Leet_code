//Recusive 
//Time: O (N)    N is the number of nodes in the binary tree. 
//				In the worst case we might be visiting all the nodes of the binary tree.
//Space O (N)    The  worst case is that the  ( Skewed binary tree)Height == the counts of the TreeNode
				// N  equal  the number of nodes 
package com.leetcode;

public class Leetcode_236_try1_recursive {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root == null || root==p||root==q) {
			return root;
		}
		TreeNode left = lowestCommonAncestor (root.left , p , q);
		TreeNode right = lowestCommonAncestor (root.right , p , q);
		if(left == null ) return right ;
		if(right == null )  return left;
		
		return root;
	}
}
