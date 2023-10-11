package com.leetcode;

import java.util.LinkedList;
import java.util.List;

//import com.leetcode.Leetcode_111_try1_linkedlist.TreeNode;

public class Leetcode_111_try2_linkedlist_practise {
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

	public static void main(String[] args) {

	}
	public int minDepth(TreeNode root) {
		
		//try2
		if (root==null) return 0 ;
		List<TreeNode> ll = new LinkedList<TreeNode>();
		int depth = 1;
		
		// 
		ll.add(root);

		while (!ll.isEmpty()) {	
			int len = ll.size();
			for (int i = 0; i < len; i++) {
				TreeNode node = ll.remove(0);
				
				System.out.println("Node.value :" +node.val); //test
				
				System.out.println("ll.size() :" +ll.size());
				if (node.left == null && node.right == null) {
					return depth;
				}
				if (node.left != null) {
					ll.add(node.left);
				}
				if (node.right != null) {
					ll.add(node.right);
				}
			}
			depth++;
			System.out.println("depth :" + depth); //test
		}
		return 0;
	}
	
}
