package com.leetcode;

import java.util.LinkedList;
import java.util.List;

import com.leetcode.Leetcode_513_try1_linkedList.TreeNode;

public class Leetcode_513_try1_1_linkedList {
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

	public static int findBottomLeftValue(TreeNode root) {
		
		List <TreeNode> ll= new LinkedList<TreeNode> ();
		
		
		
		ll.add(root);
		int resCnts =0;
		while (!ll.isEmpty()) {
			
			
			
			int size = ll.size();
			for (int i=0 ; i < size ; i ++) {
				TreeNode node = ll.remove(0);
				
				
				System.out.println("node.val:" +node.val);
				if (i==0) {
					resCnts = node.val;
				}
				if(node.left!=null) {
					ll.add(node.left);
					
				}
				if(node.right!=null) {
					ll.add(node.right);
				}
				
			}
			
				
			
		}
		
		
		return resCnts ; 
	}

}
