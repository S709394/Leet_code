//For practise 

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Invert Binary Tree.
//Memory Usage: 40.8 MB, less than 82.05% of Java online submissions for Invert Binary Tree.

package com.leetcode;

public class Leetcode_try2_recursive {
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
	public TreeNode invertTree(TreeNode root) {
		if (root == null ) {
			return root ;
		}else {
			TreeNode  temp = new TreeNode ();
			
			
			temp = root.left ;
			
			root.left= root.right;
			root.right = temp;
			
			if (root .left!=null) {
				root.left = invertTree( root.left);
			}
			if (root .right!=null) {
				root.right = invertTree( root.right);
			}
			
		}
		
		
		
		
		return root ;
		
		
	}
	
}
