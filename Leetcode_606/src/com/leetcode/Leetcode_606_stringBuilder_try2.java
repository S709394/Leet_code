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
/* Idea  : String builder
 * 
 * 
 * Runtime: 35 ms, faster than 28.75% of Java online submissions for Construct String from Binary Tree.
Memory Usage: 62.8 MB, less than 16.89% of Java online submissions for Construct String from Binary Tree.
 * 
 * */

package com.leetcode;

import com.leetcode.Leetcode_606_try1.TreeNode;

public class Leetcode_606_stringBuilder_try2 {
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
		StringBuilder sb = new StringBuilder(root.val+"");
		if (root.left != null) {
			sb.append(("(" + tree2str(root.right) + ")"));

		} else if (root.right != null) {
			sb.append("()");
		}
		if (root.right != null) {
			sb.append(("(" + tree2str(root.left) + ")"));
		}
		return sb.toString();

	}

}
