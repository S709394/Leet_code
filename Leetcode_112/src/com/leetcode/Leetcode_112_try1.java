/*112. Path Sum
Easy

5646

797

Add to List

Share
Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

A leaf is a node with no children.

 

Example 1:


Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
Output: true
Explanation: The root-to-leaf path with the target sum is shown.
Example 2:


Input: root = [1,2,3], targetSum = 5
Output: false
Explanation: There two root-to-leaf paths in the tree:
(1 --> 2): The sum is 3.
(1 --> 3): The sum is 4.
There is no root-to-leaf path with sum = 5.
Example 3:

Input: root = [], targetSum = 0
Output: false
Explanation: Since the tree is empty, there are no root-to-leaf paths.
 

Constraints:

The number of nodes in the tree is in the range [0, 5000].
-1000 <= Node.val <= 1000
-1000 <= targetSum <= 1000
Accepted
897,942
Submissions
1,959,706
 * */

/*Idea  , use recurse methods to   ' -  '  them  1 by 1 */


package com.leetcode;

public class Leetcode_112_try1 {
	
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
	
	public static void main(String[] args) {
		
	}
	
	
	public static boolean hasPathSum(TreeNode root, int targetSum) {
        	if (root==null) return false;
        	
        	int  sum = targetSum;
        	sum = sum- root.val;
        	if ( (root.left ==null )&& (root.right ==null)      ) {
        		if(sum == 0 ) {
        			return true ;
        			
        		}else {
        			return false;
        		}
        	};
        	
        	
//        	//wrong 
//        	if ( (root.left.val==sum)|| (root.right.val==sum)) {
//        		return true ;
//        	}else {
//        		return false
//        	}
        	
        	Boolean l =  hasPathSum(root.left , sum);
        	Boolean r =  hasPathSum(root.right , sum);
        	
        	return  l ||r;
        	
    }
	
	
}
