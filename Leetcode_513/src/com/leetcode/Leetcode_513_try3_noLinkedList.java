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

/*Try3  recursion
 * 
 * Idea 
 *
 *   resCnts [0] store the val we want to return   o
 *   resCnts [1]  to store the  depth ; ( to make sure the  val  in the  deepest  lay of trees
 *    
 *    Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Bottom Left Tree Value.
 *	  Memory Usage: 41.7 MB, less than 96.61% of Java online submissions for Find Bottom Left Tree Value.
 * */

package com.leetcode;

//import com.leetcode.Leetcode_513_try2_practise.TreeNode;

public class Leetcode_513_try3_noLinkedList {

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

	public static int findBottomLeftValue(TreeNode root) {
		return findBottomLeftValue(root, 1, new int[] { 0, 0 });
	}

	public static int findBottomLeftValue(TreeNode root, int depth, int[] resCnts) {

		if (resCnts[1] < depth) {
			resCnts[0] = root.val;
			resCnts[1] = depth; 
		}
		if (root.left != null) {

			findBottomLeftValue(root.left, depth + 1, resCnts);
		}
		if (root.right != null) {

			findBottomLeftValue(root.right, depth + 1, resCnts);
		}

		return resCnts[0];
	}
}
