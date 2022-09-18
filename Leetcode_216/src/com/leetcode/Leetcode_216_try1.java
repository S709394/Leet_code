/*Idea :
 * 
 * Backtrack  (depth first search);
 * 
 * v:1.0
 * Runtime: 1 ms, faster than 87.42% of Java online submissions for Combination Sum III.
Memory Usage: 42.1 MB, less than 18.94% of Java online submissions for Combination Sum III.


v2.0   add this part 

else if (list.size() == k) {
			return;  }
			
	Runtime: 1 ms, faster than 87.42% of Java online submissions for Combination Sum III.
Memory Usage: 41.5 MB, less than 61.53% of Java online submissions for Combination Sum III.		



 * */

package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_216_try1 {
	public List<List<Integer>> combinationSum3(int k, int target) {

		List<List<Integer>> res = new ArrayList<>();

		// base we can cut some time here ;
		if (k > target)
			return res;

		dfs(res, new ArrayList<Integer>(), k, target, 1);
		return res;
	}

	static void dfs(List<List<Integer>> res, ArrayList<Integer> list, int k, int remain, int start) {
		if (remain < 0) {
			return;
		} else if (remain == 0 && list.size() == k) {
			res.add(new ArrayList<Integer>(list));
			return;
//  cut somt time here   
		} else if (list.size() == k) {
			return;
		} else {

			for (int i = start; i <= 9; i++) {
				list.add(i);
				dfs(res, list, k - 1, remain - i, i + 1);
				list.remove(list.size() - 1);
			}
		}
	};
}
