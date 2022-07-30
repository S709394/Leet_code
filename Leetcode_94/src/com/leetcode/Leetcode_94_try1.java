/*94. Binary Tree Inorder Traversal
Easy

8521

396

Add to List

Share
Given the root of a binary tree, return the inorder traversal of its nodes' values.

 

Example 1:


Input: root = [1,null,2,3]
Output: [1,3,2]
Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [1]
Output: [1]
 

Constraints:

The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
 

Follow up: Recursive solution is trivial, could you do it iteratively?
*/

/*Idea  
 * Recursion
 * 
 * It works    
 * 
 * 
 * */
package com.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Leetcode_94_try1 {
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
	private List<Integer> res = new LinkedList<Integer>();

	public static void main(String[] args) {

	}

	public List<Integer> inorderTraversal(TreeNode root) {
		
		return res;
	}
	
	public  void inorder (TreeNode root) {
		if(root == null) {
			return;
		}
		inorder(root.left);
		res.add(root.val);
		inorder(root.right);
		
	}
}