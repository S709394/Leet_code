/*125. Valid Palindrome
Easy

4702

5907

Add to List

Share
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
sOutce an empty string reads the same forward and backward, it is a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.*/
/*
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Invert Binary Tree.
Memory Usage: 40 MB, less than 90.47% of Java online submissions for Invert Binary Tree.
 * */
package com.leetcode;

public class Leetcode_226_try1 {
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
//		TreeNode n2 = new TreeNode ( [1,2,3,4,5,6]);

	}

	public static TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return root;
		} else {
			
			// no Idea why  I have a warning here
			TreeNode nodeTemp = new TreeNode();

			nodeTemp = root.left;

			root.left = root.right;
			root.right = nodeTemp;

			if (root.left != null)
				invertTree(root.left);

			if (root.right != null)
				invertTree(root.right);
		}

		return root;
	}

//	public static TreeNode invertTree(TreeNode root) {
//		TreeNode node  = new TreeNode ();
//		
//		
//		invertTree( node) ;
//		
//		return node;
//    }
//	
//	public static void invertTree(TreeNode root) {
//		
//		if (root == null) {
//			root = null ;
//		}else {
//			TreeNode nodeTemp  = new TreeNode ();
//			
//			nodeTemp =root.left;
//			
//			root.left = root.right;
//			root.right = nodeTemp;
//			
//			
//		}
//		
//		invertTree(root.left);
//		invertTree(root.right);
//		
//		
//	}

}
