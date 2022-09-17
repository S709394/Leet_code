
/*Idea :
 * Runtime: 3 ms, faster than 96.58% of Java online submissions for Combinations.
Memory Usage: 54.9 MB, less than 53.04% of Java online submissions for Combinations.

 * */
package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_77_try3 {
	public static List<List<Integer>> combine(int maxInt, int arrayLen) {
		List<List<Integer>> listOfList = new ArrayList<List<Integer>>();

		backtrack(listOfList, new ArrayList<Integer>(), 1, maxInt, arrayLen);
		return listOfList;

	}

	public static void backtrack(List<List<Integer>> listOfList, List<Integer> list, int start, int maxInt, int cnt) {

		// when the cnt ==0 , mean the the ArrayList .size = k;
		if (cnt == 0) {
			listOfList.add(new ArrayList<Integer>(list));
			return;
		}
//Take combine(4, 2) as an example, the program does not need to try the combination 
		// starting with 4, because it has been covered by those starting with 1, 2 and
		// 3. The same applies for each sub-problem in the recursions.
//		similary take another example of combine(4,3) the sol 
		// does not need to take in to account combination starting with 3 and 4 since
		// they have already been covered by combination starting with 1, 2
//
		for (int i = start; i <= maxInt - cnt + 1; i++) {
//		for(int i = 0 ; i <maxInt; i++) {
			list.add(i);
			backtrack(listOfList, list, i + 1, maxInt, cnt - 1);

			list.remove(list.size() - 1);
		}

	}
}
