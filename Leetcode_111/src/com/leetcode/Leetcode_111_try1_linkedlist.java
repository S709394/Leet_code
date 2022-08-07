/*111. Minimum Depth of Binary Tree
Easy

4499

978

Add to List

Share
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: 2
Example 2:

Input: root = [2,null,3,null,4,null,5,null,6]
Output: 5
 

Constraints:

The number of nodes in the tree is in the range [0, 105].
-1000 <= Node.val <= 1000
*/

/*Idea 
 * use Linked List 
 * 
 * */
package com.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Leetcode_111_try1_linkedlist {

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

	public int minDepth(TreeNode root) {
		if (root==null) return 0 ;
		List<TreeNode> ll = new LinkedList<TreeNode>();
		int depth = 1;
		
		// 
		ll.add(root);

		while (!ll.isEmpty()) {	
			int len = ll.size();
			for (int i = 0; i < len; i++) {
				TreeNode node = ll.remove(0);
				
				System.out.println("Node.value :" +node.val); //test
				
				System.out.println("ll.size() :" +ll.size());
				if (node.left == null && node.right == null) {
					return depth;
				}
				if (node.left != null) {
					ll.add(node.left);
				}
				if (node.right != null) {
					ll.add(node.right);
				}
			}
			depth++;
			System.out.println("depth :" + depth); //test
		}
		return 0;
	}

}
