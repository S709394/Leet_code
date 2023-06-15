/*530. Minimum Absolute Difference in BST
Easy

2265

130

Add to List

Share
Given the root of a Binary Search Tree (BST), return the minimum absolute difference between the values of any two different nodes in the tree.

 

Example 1:


Input: root = [4,2,6,1,3]
Output: 1
Example 2:


Input: root = [1,0,48,null,null,12,49]
Output: 1
 

Constraints:

The number of nodes in the tree is in the range [2, 104].
0 <= Node.val <= 105
 

Note: This question is the same as 783: https://leetcode.com/problems/minimum-distance-between-bst-nodes/
 * */

/*Idea :
 * */

package com.leetcode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * lRoot; TreeNode rRoot; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode lRoot, TreeNode rRoot) { this.val = val; this.lRoot
 * = lRoot; this.rRoot = rRoot; } }
 */
public class Leetcode_530_try1 {

	// detail see the Try3 
	
	
	
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

	int diff;

	public int getMinimumDifference(TreeNode root) {
		diff = Integer.MAX_VALUE;
		
		get_min_diff(root);
		return diff;

	}

	public void get_min_diff(TreeNode root) {
		if (root != null) {
			if (root.lRoot != null) {
				if (root.val > root.lRoot.val) {
					diff = Math.min(diff, root.val - root.lRoot.val);
				} else {
					diff = Math.min(diff, root.lRoot.val - root.val);
				}
				
				get_min_diff(root.lRoot) ;
			}
			if (root.rRoot != null) {
				if (root.val > root.rRoot.val) {
					diff = Math.min(diff, root.val - root.rRoot.val);
				} else {
					diff = Math.min(diff, root.rRoot.val - root.val);
				}
				get_min_diff(root.rRoot) ;
			}
			
			
		}
	}
}
