
/*938. Range Sum of BST
Easy

4400

333

Add to List

Share
Given the root node of a binary search tree and two integers low and high, return the sum of values of all nodes with a value in the inclusive range [low, high].

 

Example 1:


Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
Output: 32
Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.
Example 2:


Input: root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
Output: 23
Explanation: Nodes 6, 7, and 10 are in the range [6, 10]. 6 + 7 + 10 = 23.
 

Constraints:

The number of nodes in the tree is in the range [1, 2 * 104].
1 <= Node.val <= 105
1 <= low <= high <= 105
All Node.val are unique.

*/

//Idea: try the normal way 

//  try to add the L when  .val < R   to the left 
// and R when .val on the right.

//  something we know  "All Node.val are unique."

package com.leetcode;

//import com.leetcode.Leetcode_653_try1.TreeNode;

public class Leetcode_938_try1 {
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
//				int sum = 0 ; 
////				sum += rangeSumBST (root , 7,15);

	}

	private int range_sum;

	public int rangeSumBST(TreeNode root, int low, int high) {
		range_sum = 0;
		get_range_sum (root, low, high);
		return range_sum;
	}

	public void get_range_sum(TreeNode root, int low, int high) {
		if (root != null) {
			if (root.val > low && root.val < high) {
				range_sum += root.val;
			}
			if (root.val > low) {
				get_range_sum(root.left, low, high);
			}
			if (root.val < high) {
				get_range_sum(root.right, low, high);
			}
		}

	}
}
