
/*Steps:
 * 
 * 
 * // 0.  Take care it when the nums.length too short
 * // 1. sort
 * // 2.  for loop for the num[i],using (long) for overload
 *   2a skip the same nums[i]
 *    2b. when the sum too big , do sth  , (all else not going to work)
 *    2c. nums[i] too small,  need a bigger one 
 *    
 *    3. inner for loop 
 *     3a  skip the same j 
 *     3b using two points windows way
 *     
 *     	3b1 . add in to the ArrayList into it when meet the target
 *     	3b1a    skips some same 'left'   and 'right'
 *     
 *     4 the end 
 * */

/* This one works well 
 * 
 * 
 */

package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_18_try2 {
	public static void main(String[] args) {

	}

	public List<List<Integer>> fourSum(int[] nums, int target) {

		List<List<Integer>> ll = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		int length = nums.length;
		if (nums == null || nums.length < 4) {
			return ll;
		}

		for (int i = 0; i < nums.length - 3; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			// too big
			if ((long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) {
				break;
			}
			// too small
			if ((long) nums[i] + nums[length - 3] + nums[length - 2] + nums[length - 1] < target) {
				continue;
			}

//			 int j = i+1;
			for (int j = i + 1; j < length - 2; j++) {
				if (j > i + 1 && nums[j] == nums[j - 1]) {
					continue;
				}

				// xxxx : add sth // make sure the nums[j] is not that big

				if ((long) nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) {
					break;
				}
				/// xxx : nums[j] two small
				if ((long) nums[i] + nums[j] + nums[length - 1] + nums[length - 2] < target) {
					continue;
				}

				// whileloop for 2 pointers way
				int left = j + 1, right = length - 1;
				while (left < right) {

					int sum = nums[i] + nums[j] + nums[left] + nums[right];
					if (sum == target) {
						ll.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

//						while (left > j + 1 && nums[left - 1] == nums[left]) { //wrong
						while (left <right && nums[left]==nums[left +1]  ){
							left++;
						}
						left++;

//						while (right < length - 1 && nums[right] == nums[right - 1]) {//wrong
						while (left <right && nums[right] == nums[right - 1]) {
							right--;
						}
						right--;

					} else if (sum < target) {
						left++;
					} else {
						right--;
					}
				}

			}

		}
		return ll;
	}

}
