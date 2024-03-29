/*100. Same Tree
Easy

6473

147

Add to List

Share
Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

 

Example 1:


Input: p = [1,2,3], q = [1,2,3]
Output: true
Example 2:


Input: p = [1,2], q = [1,null,2]
Output: false
Example 3:


Input: p = [1,2,1], q = [1,1,2]
Output: false
 

Constraints:

The number of nodes in both trees is in the range [0, 100].
-104 <= Node.val <= 104*/

/*Idea  : 
 * Recursion
 * 	 Runtime: 0 ms, faster than 100.00% of Java online submissions for Same Tree.
Memory Usage: 41.3 MB, less than 68.70% of Java online submissions for Same Tree.
 * 
 * */

package com.leetcode;

import com.leetcode.Leetcode_100_try1_recu.TreeNode;

public class Leetcode_100_recursion_try2_practise {
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
		if(p==null && q==null) {
			return true;
		}
		if(p==null || q== null) {
			return false ;
		}
		if(p.val!=q.val) {
			return false;
		}
		
		
		return isSameTree( p.left,q.left) && isSameTree(p.right,q.right);
	}
}
