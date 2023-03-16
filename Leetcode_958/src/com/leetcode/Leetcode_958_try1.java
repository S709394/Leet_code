package com.leetcode;

//import java.util.ArrayList;
import java.util.LinkedList;
//import java.util.List;
import java.util.Queue;

//import com.leetcode.Leetcode_129_try1.TreeNode;

public class Leetcode_958_try1 {
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

	// No idea so far
//	If depth is n , than the last lay has 2n-1 or 2n nodes

	// https://leetcode.cn/problems/check-completeness-of-a-binary-tree/solution/er-cha-shu-de-wan-quan-xing-jian-yan-by-leetcode/

	
	
	public boolean isCompleteTree(TreeNode root) {
		
		Queue<TreeNode> bfs =new LinkedList <> ();
		bfs .offer(root);
		
		while (bfs .peek()!=null ) {
			TreeNode node = bfs.poll();
			bfs.offer(node.left);
			bfs.offer(node.right);
			System.out.println( bfs.size()); //test code
		}
		
		while (!bfs.isEmpty()&&bfs.peek()==null) {
			bfs.poll();
			
//			System.out.println(bfs.peek().val);//test
		}
		
		return bfs.isEmpty();
		
		
		
	}

}
