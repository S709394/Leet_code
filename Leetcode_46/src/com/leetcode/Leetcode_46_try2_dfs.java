package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_46_try2_dfs {
	public List<List<Integer>> permute(int[] nums) {

		List<List<Integer>> res = new ArrayList<List<Integer>>();

//		int sum=0;
//		for (int i : nums) {
//			sum+= i;
//		}

		dfs(res, new ArrayList<Integer>(), nums);
		return res;
	}

	static void dfs(List<List<Integer>> res, List<Integer> list,  int[] nums) {
		if (list.size() == nums.length) {
			res.add(new ArrayList<Integer>(list));
//			return;
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (list.contains(nums[i]))
					continue;
				else {
					list.add(nums[i]);
					dfs(res, list, nums);

					list.remove(list.size() - 1);

				}
			}
		}
	};

}
