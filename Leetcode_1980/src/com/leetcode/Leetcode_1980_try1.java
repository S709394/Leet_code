package com.leetcode;

public class Leetcode_1980_try1 {
	public String findDifferentBinaryString(String[] nums) {
		// https://leetcode.com/problems/find-unique-binary-string/solutions/4292653/beats-100-explained-with-video-simplest-solution-2-3-lines-visualized-too/?envType=daily-question&envId=2023-11-16

		// Chat gpt
//         The idea behind this solution is to generate a new binary string that is guaranteed to be different from each binary string in the nums array by flipping each bit. Since it appends the opposite bit at the same index for each binary string, the resulting binary string will be unique and not present in the original array.

// This solution relies on the fact that there are only two possible characters in a binary string ('0' and '1'), and flipping each bit will result in a binary string that is not in the input array.
		
		//try1 
		StringBuilder sb = new StringBuilder();
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			sb.append(nums[i].charAt(i) == '0' ? 1 : 0);
		}
		return sb.toString();
	}
}
