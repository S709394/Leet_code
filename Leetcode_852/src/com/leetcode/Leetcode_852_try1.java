package com.leetcode;

public class Leetcode_852_try1 {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 0 };
		System.out.println(peakIndexInMountainArray(arr));
	}

	public static int peakIndexInMountainArray(int[] arr) {
		//try1
		int n = arr.length;

		int left = 0;

		int right = n - 1;

		while (left < right) {
			int mid = left + (right - left) / 2;
//			System.out.println("left :" + left + " /right : " + right + "  mid: " + mid);

			if (arr[mid] > arr[mid + 1]) {
				right = mid;
			} else {
				left = mid+1;
			}

		}
		return right;
	}
}
