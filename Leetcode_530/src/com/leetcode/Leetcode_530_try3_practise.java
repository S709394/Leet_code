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
 * 
 * 
 * */
package com.leetcode;

//import com.leetcode.Leetcode_530_try1.TreeNode;

//import com.leetcode.Leetcode_530_try2.Leetcode_530_try1.TreeNode;

//import com.leetcode.Leetcode_530_try1.TreeNode;

public class Leetcode_530_try3_practise {
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

	// the minimum difference
	int res;

	// the value
	int pre;

	public int getMinimumDifference(TreeNode root) {

		res = Integer.MAX_VALUE;

		pre = -1;
		dfs(root);
		return res;

	}

	public void dfs(TreeNode root) {
		if (root == null) {
			return;
		}

		dfs(root.lRoot);
		if (pre == -1) {
			pre = root.val;
		} else {
			res = Math.min(res, pre);
			pre=root.val;

		}
		dfs (root .rRoot);
	}

}
