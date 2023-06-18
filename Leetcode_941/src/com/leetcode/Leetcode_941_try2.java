package com.leetcode;

public class Leetcode_941_try2 {
	public static void main(String[] args) {
//		int arr[] = { 1, 2, 3, 4, 3, 2, 1, 0 };

//		int arr[] = {2,1};
//		int arr[] = { 3, 5, 5 };
//		int arr[] = { 0,3, 2, 1 };
		int arr[] = { 1, 2, 3, 0 };

		System.out.println(validMountainArray(arr));
	}

	public static boolean validMountainArray(int[] arr) {
		int len = arr.length;

		if (len == 2)
			return false;

		int left = 0;

		while (left <len-1 &&arr[left] < arr[left + 1]) {
			left++;
		}

		int mid = left;
		
		System.out.println("mid :" + mid);// test

		
		while (mid <len-1&&arr [ mid]> arr[mid +1]) {
			mid++ ;
		}
		
		if(mid == len-1) {
			return true;
		}
		return false;
	}
}
