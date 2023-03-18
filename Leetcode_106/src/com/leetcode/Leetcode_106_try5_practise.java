package com.leetcode;

import java.util.HashMap;


//import com.leetcode.Leetcode_106_try2_practise.TreeNode;

//Runtime
//2 ms
//Beats
//97.22%
//Memory
//42 MB
//Beats
//77.81%

public class Leetcode_106_try5_practise {
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

		HashMap<Integer, Integer> valToIdx = new HashMap<>();
	
		public TreeNode buildTree(int[] inOrder, int[] postOrder) {
			for (int i = 0 ; i < inOrder.length  ;  i ++) {
				valToIdx.put(inOrder[i],i);
			}
			
			return build (inOrder ,0,inOrder.length-1 ,postOrder , 0 , postOrder.length-1) ;
		}
		
		public TreeNode build (int [] inOrder , int inStart , int inEnd , int [] postOrder , int postStart , int postEnd) {
			
			if(inStart> inEnd ) {
				return null ;
			}
			int rootVal = postOrder [postEnd];
			int index = valToIdx.get(rootVal);
			int lRootSize = index - inStart;
			
			TreeNode root = new TreeNode (rootVal) ;
			root.lRoot =  build ( inOrder , inStart ,index-1 , 
					postOrder, postStart ,postStart +lRootSize-1) ;
			root.rRoot  = build ( inOrder , index +1 , inEnd , 
					postOrder, postStart +lRootSize ,postEnd-1);
			
			return root;
			
		}
}
