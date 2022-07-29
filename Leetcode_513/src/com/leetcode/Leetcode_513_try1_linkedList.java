/*513. Find Bottom Left Tree Value
Medium

2335

224

Add to List

Share
Given the root of a binary tree, return the leftmost value in the last row of the tree.

 

Example 1:


Input: root = [2,1,3]
Output: 1
Example 2:


Input: root = [1,2,3,4,null,5,6,null,null,7]
Output: 7
 

Constraints:

The number of nodes in the tree is in the range [1, 104].
-231 <= Node.val <= 231 - 1
 * */

/*Idea 
 *
 * use  deque  is better ,  use LinkedList is ok too  
 * 
 * 
 * Runtime: 3 ms, faster than 25.85% of Java online submissions for Find Bottom Left Tree Value.
Memory Usage: 44.1 MB, less than 38.14% of Java online submissions for Find Bottom Left Tree Value.

Not that fast 
 * */

package com.leetcode;

import java.util.LinkedList;

public class Leetcode_513_try1_linkedList {
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

	public int findBottomLeftValue(TreeNode root) {
		if (root == null)
			return 0;
		
		LinkedList<TreeNode> ll = new LinkedList<>();

		ll.add(root);
		int res = 0;
		while (!ll.isEmpty()) {
			int size = ll.size();
			System.out.println("size :" + size);
			for (int i = 0; i < size; i++) {

//	                TreeNode node = ll.pollFirst(); 

				TreeNode node = ll.remove(0);
				if (i == 0) {
					res = node.val;
				}
//	                if (node.left != null)ll.addLast(node.left);
//	                if (node.right != null)ll.addLast(node.right);
				if (node.left != null)
					ll.add(node.left);
				
//				System.out.println("added left + node.val" + node.left.val);
				if (node.right != null)
					ll.add(node.right);
//				System.out.println("added right + node.val" + node.right.val);

			}
		}
		return res;  
	}
}
