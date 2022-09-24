/*Idea :
 * 
 * use a DFS way to go through the whole root
 * 
 * https://www.youtube.com/watch?v=0Rk6Rty9bFo
 * 
 * 
 * */

package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_102_try1_recursion {
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
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		
		helper (res , new ArrayList <Integer> (),root, 0 );
		return res ;
    } 
	
	public static void helper ( List<List<Integer>> res , ArrayList<Integer> list ,TreeNode root, int level) {
		if (root ==null) {
			return ;
		}
		if (res.size()==level) {
			res.add(new ArrayList <Integer>(list));
		}
		
		res.get(level).add(root.val);
		
	
		helper (res , new ArrayList <Integer> (),root.left, level+1 );
		helper (res , new ArrayList <Integer> (),root.right, level+1 );
	
	}
}
