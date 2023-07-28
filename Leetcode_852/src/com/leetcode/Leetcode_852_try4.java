package com.leetcode;

public class Leetcode_852_try4 {
	public static void main(String[] args) {
		// try2
//		int[] arr = { 0, 1, 2, 0 };   
		int[] arr = { 0, 1, 5, 2, 1, 0 };
		System.out.println(peakIndexInMountainArray(arr));
	}

	public static int peakIndexInMountainArray(int[] arr) {
		int n = arr.length ;
		
		int left = 0 , right = n-1 ;
		
		while (left < right ) {
			int mid = left + (right -left)/2;
			if( arr[ mid]> arr[mid+1]) {
				right = mid ;
			}else {
				left = mid +1 ;
			}
		}
		return left ;
	}
}
