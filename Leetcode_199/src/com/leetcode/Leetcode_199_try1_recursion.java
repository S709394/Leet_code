package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_199_try1_recursion {

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
	
	
	public static List<Integer> rightSideView(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		
		
		 rightSideView( root,0 ,list) ;
		
		return list ;
	}
	
	public static List<Integer> rightSideView(TreeNode root, int level ,List<Integer>list) {
		if(root == null) {
			return list;
		}
		if(list.size()==level) {
			list.add(root.val);
		}
		rightSideView( root.right,level+1 ,list) ;
		rightSideView( root.left,level+1 ,list) ;
		
		return list;
	}

	

}
