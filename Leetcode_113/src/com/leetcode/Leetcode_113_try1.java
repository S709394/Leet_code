/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

/*113. Path Sum II
Medium

4874

109

Add to List

Share
Given the root of a binary tree and an integer targetSum, return all root-to-leaf paths where the sum of the node values in the path equals targetSum. Each path should be returned as a list of the node values, not node references.

A root-to-leaf path is a path starting from the root and ending at any leaf node. A leaf is a node with no children.

 

Example 1:


Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
Output: [[5,4,11,2],[5,8,4,5]]
Explanation: There are two paths whose sum equals targetSum:
5 + 4 + 11 + 2 = 22
5 + 8 + 4 + 5 = 22
Example 2:


Input: root = [1,2,3], targetSum = 5
Output: []
Example 3:

Input: root = [1,2], targetSum = 0
Output: []
 

Constraints:

The number of nodes in the tree is in the range [0, 5000].
-1000 <= Node.val <= 1000
-1000 <= targetSum <= 1000
Accepted
589,116
Submissions
1,083,811
 * */


/*Idea: does not fully understand so far ,  70% finished
 * 
 *   https://leetcode.com/problems/path-sum-ii/discuss/36683/DFS-with-one-LinkedList-accepted-java-solution
 * */ 

package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_113_try1 {
	public class TreeNode {
		     int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode() {}
		      TreeNode(int val) { this.val = val; }
		      TreeNode(int val, TreeNode left, TreeNode right) {
		          this.val = val;
		          this.left = left;
		          this.right = right;
		      }
		  }
		 
	// this is a solution from @xi11  https://leetcode.com/problems/path-sum-ii/discuss/36683/DFS-with-one-LinkedList-accepted-java-solution
	public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List <List<Integer>> result = new ArrayList() ;
        List<Integer> cur =new ArrayList();
        
        pathSum(root,sum,cur,result);
        
        return result;
    }
	
	public static void pathSum(TreeNode root, int sum,List<Integer>cur, List<List<Integer>>ret) {
			if(root ==null) {
				return;
			}
			cur .add(root.val);
			if(root.left ==null && root.right==null &&root.val==sum) {
				ret.add(new ArrayList(cur));
			}else {
				pathSum(root.left,sum-root.val,cur,ret);
				pathSum(root.right,sum-root.val,cur,ret);
			}
			cur.remove(cur.size()-1);
	}
}
