package com.leetcode;

import com.leetcode.Leetcode_938_try1.TreeNode;

public class Leetcode_938_try2_practise {
	 public   int rangeSumBST(TreeNode root, int low, int high) {
		 if(root==null) return 0 ;
		 if (root.val>high) {
			 return rangeSumBST (root.left,low,root.val);
		 }
		 if (root.val<low) {
			 return rangeSumBST (root.right,root.val,high);
			 
			 
		 }
		 return root.val+  rangeSumBST  (root.left,low,high) +rangeSumBST(root.right,low,high);
		
	 }
}
