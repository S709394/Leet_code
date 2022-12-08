package com.leetcode;

//import com.leetcode.Leetcode_938_try1.TreeNode;

public class Leet_938_try3_recursive_detail {
	public int rangeSumBST(TreeNode root, int low, int high) {
		// base case
		if (root == null)
			return 0;
		
		if (root.val < low)
			return rangeSumBST(root.right, low, high);

		//If the value of the root is greater than the high value 
		//the values in the right subtree will be greater than the high value too
		if (root.val > high)
			return rangeSumBST(root.left, low, high);

		//If in the range between low and high
		//the values would be   root.val add these other 2 part.
		return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);

	}

}
