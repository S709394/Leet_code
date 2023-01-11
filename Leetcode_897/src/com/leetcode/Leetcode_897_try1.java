package com.leetcode;

//import java.util.Stack;

//import com.leetcode.Leetcode_100_try2_practise.TreeNode;

//Official : No idea what is going on  , 
// going to use stack in try2 

public class Leetcode_897_try1 {
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
	TreeNode cur ;
	public TreeNode increasingBST(TreeNode root) {
		TreeNode ans = new TreeNode(0);
		
		cur = ans ;
		inorder(root);

		return ans.right;

	}

	public void inorder(TreeNode node) {
		if (node == null) {
			return;
		}
		inorder(node.left);
		cur .left = null ;
		cur.right  = node  ;
		cur  = node  ;
		inorder (node.right ) ;
//		cur.left = null ;
		
		
	}
}
