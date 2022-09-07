/*606. Construct String from Binary Tree
Easy

2170

2698

Add to List

Share
Given the root of a binary tree, construct a string consisting of parenthesis and integers from a binary tree with the preorder traversal way, and return it.

Omit all the empty parenthesis pairs that do not affect the one-to-one mapping relationship between the string and the original binary tree.

 

Example 1:


Input: root = [1,2,3,4]
Output: "1(2(4))(3)"
Explanation: Originally, it needs to be "1(2(4)())(3()())", but you need to omit all the unnecessary empty parenthesis pairs. And it will be "1(2(4))(3)"
Example 2:


Input: root = [1,2,3,null,4]
Output: "1(2()(4))(3)"
Explanation: Almost the same as the first example, except we cannot omit the first parenthesis pair to break the one-to-one mapping relationship between the input and the output.
 

Constraints:

The number of nodes in the tree is in the range [1, 104].
-1000 <= Node.val <= 1000
 * */
/* Idea  : use string and also  the recursion
 * 
 * (should try string builder in try2 
 * */

package com.leetcode;

public class Leetcode_606_try1 {
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

	public String tree2str(TreeNode root) {

		if (root == null) {
			return "";
		}
		String s = new String(root.val + "");
		if (root.left != null) {
			s += ("(" + tree2str(root.left) + ")");
		} else if (root.right != null) {
			s += ("()");
		}
		if (root.right != null) {
			s += ("(" + tree2str(root.right) + ")");
		}

		return s;

	}

}
