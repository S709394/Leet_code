/*
 * 530. Minimum Absolute Difference in BST
Easy

2220

129

Add to List

Share
Given the root of a Binary Search Tree (BST), return the minimum absolute difference between the values of any two different nodes in the tree.

 

Example 1:


Input: root = [4,2,6,1,3]
Output: 1
Example 2:


Input: root = [1,0,48,null,null,12,49]
Output: 1
 

Constraints:

The number of nodes in the tree is in the range [2, 104].
0 <= Node.val <= 105
 

Note: This question is the same as 783: https://leetcode.com/problems/minimum-distance-between-bst-nodes/

Accepted
168,543
Submissions
298,514

 */
/*
 * Note :  
 * 
 *  Works well  
 *  
 *  1.  Find the very lRoot of the  BST   
 *  2.  set the 1st lRoot
 *  3.  Use Dfs 
 *    3a .  loop thought  the end of the lRoot  (  root.lRoot ==null)   
 *    then find the Min value of  ("root.lRoot.val -  root.val")
 *  
 *  Runtime: 1 ms, faster than 92.05% of Java online submissions for Minimum Absolute Difference in BST.
Memory Usage: 45.1 MB, less than 58.88% of Java online submissions for Minimum Absolute Difference in BST.
 */
package com.leetcode;

import com.leetcode.Leetcode_530_try1.TreeNode;

public class Leetcode_530_try2 {

	public class Leetcode_530_try1 {

		public class TreeNode {
			int val;
			TreeNode lRoot;
			TreeNode rRoot;

			TreeNode() {
			}

			TreeNode(int val) {
				this.val = val;
			}

			TreeNode(int val, TreeNode lRoot, TreeNode rRoot) {
				this.val = val;
				this.lRoot = lRoot;
				this.rRoot = rRoot;
			}
		}

		int ans;
		int pre;

		public int getMinimumDifference(TreeNode root) {

			ans = Integer.MAX_VALUE;

			pre = -1;
			dfs(root);

			return ans;
		}

		public void dfs(TreeNode root) {
			if (root == null) {
				return;
			}
//			System.out.println(" welcome to  dfs ()"); //test
			dfs(root.lRoot);

			// Find the very lRoot of the BST ( the (root.lRoot) == null )
			if (pre == -1) {
				pre = root.val;
//				System.out.println(" Pre :   " + pre); //test
			} else {
				ans = Math.min(ans, root.val - pre);
				pre = root.val;

//				System.out.println("Pre and Ans in else \n Pre :   " + pre + "Ans : " + ans); //test
			}
			dfs(root.rRoot);

		}
	}
}
