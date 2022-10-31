//
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Element.
//Memory Usage: 41 MB, less than 86.93% of Java online submissions for Remove Element.

package com.leetcode;

public class Leetcode_27_try1 {
	public static void main(String[] args) {
		int [] nums = {3,2,2,3,3};
		int val = 3;
		System.out.println(removeElement(nums , val));
	}

	public static  int removeElement(int[] nums, int val) {
		 int len = nums.length;
//			int right = nums.length - 1;

			int left = 0;
			int cnt = len;
			for (int i = 0; i < len; i++) {
				
				if (val != nums[i]) {
					nums[left] = nums[i];
					left++;

					// System.out.println("left:" + left);
				} else {
//					i++;
					cnt--;
				}
//				left++;

			}
			return cnt;
	}
}
