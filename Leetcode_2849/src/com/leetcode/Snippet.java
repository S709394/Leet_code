package com.leetcode;

public class Snippet {
	Integer prev = null;
		int cnt = 0;
		int max = 0;
	
		public int[] findMode(TreeNode root) {
			if (root == null) {
				return new int[0];
			}
			List<Integer> res = new ArrayList<Integer>();
			traverse(root, res);
	
			int size = res.size();
			int[] ans = new int[size];
			for (int i = 0; i < size; i++) {
				ans[i] = res.get(i);
			}
	
			return ans;
		}
	
		private void traverse(TreeNode root, List<Integer> list) {
			if (root == null) {
				return;
			}
			traverse(root.left, list);
	
			if (prev != null) {
				if (root.val == prev) {
					cnt++;
				} else {
					cnt = 1;
				}
	
			}
	
			if (cnt > max) {
	
				max = cnt;
				list.clear();
				list.add(root.val);
	
			} else if (cnt == max) {
				list.add(root.val);
			}
	
			prev = root.val;
	
			traverse(root.right, list);
	
		}
}

