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

/*Try2  practise 
 * 
 * Idea 
 *
 * use  deque  is better ,  use LinkedList is ok too  
 * */



package com.leetcode;

import java.util.LinkedList;

import com.leetcode.Leetcode_513_try1_linkedList.TreeNode;

public class Leetcode_513_try2_practise {
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
		if(root==null) return 0 ; 
		
//		LinkedList<Integer> ll = new LinkedList <Integer> ();//wrong 
		LinkedList<TreeNode> ll = new LinkedList <TreeNode> ();
		
		
		ll.add(root);
		
		int resCnts =0;
		
		while (!ll.isEmpty()) {
			int size = ll.size();
			
			for (int i = 0 ; i < size ; i ++) {
				
				
				//Ctrl- z the  parent node and paste into the 'node'  (put into after removed it )
				TreeNode node = ll.remove(0) ;
				
				if (i==0) {
					resCnts = node.val;;
				}
				
				// Must be  left go first and then right .
				if(node.left!=null) {
					ll.add(node.left);
				}
				if(node.right!=null) {
					ll.add(node.right);
				}
				
				
			}
			
			
			
		}
		
		return resCnts; 
	}
}
