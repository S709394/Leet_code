package com.leetcode;

public class Leetcode_744_try3 {
	public static void main(String[] args) {
		char[] l = { 'c', 'f', 'j' };

		char target = 'j';

		System.out.println(nextGreatestLetter(l, target));
	}

	public static char nextGreatestLetter(char[] letters, char target) {
		
		//try3 _practise
		
		int n = letters.length;

		int left = 0;
		int right = n - 1;
		if (letters[n - 1] <= target)
			return letters[0];

		while (left < right) {

			int mid = left + (right - left) / 2;
//			System.out.println("left :" + left + " /right : " + right + "  mid: " + mid);

			if (letters[mid] <= target) {
				left = mid + 1;
			} else {
				right = mid;
			}

		}
		
		return letters[left];
	}
}
