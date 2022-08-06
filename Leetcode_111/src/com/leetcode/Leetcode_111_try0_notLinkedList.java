
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
 * It is slower than LinkedList ,  so let it go   
 * 
 * Does NOT  work so far. 
 * 
 * */
package com.leetcode;

//import com.leetcode.Leetcode_111_try1_linkedlist.TreeNode;

public class Leetcode_111_try0_notLinkedList {
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

	private int depth;

	public static void main(String[] args) {

	}

	public int minDepth(TreeNode root) {
		depth = 0;

		if (root == null)
			return depth;
		
		int minDepth= Integer.MAX_VALUE;

		return minDepth(root, depth,0);

	}

	public int minDepth(TreeNode root, int minDepth , int depthCount) {

		if(root==null) {
			return minDepth;
		}
		if (root.right == null && root.left == null) {
			return  Math.min(minDepth, depthCount);
			
		} else {

			if (root.left != null) {
//				System.out.println("depth:bbb " + depth);
				minDepth(root.left, minDepth,depthCount);
			}

			if (root.right != null) {
//				System.out.println("depth:bbb " + depth);
				minDepth(root.right, minDepth,depthCount);
			}
		}

//		if(root.left!=null) {
//			minDepth (root.left,depth+1,res);
//		}
//		if(root.right!=null) {
//			minDepth (root.right,depth+1,res);
//		}

		return depth;
	}
	
}
