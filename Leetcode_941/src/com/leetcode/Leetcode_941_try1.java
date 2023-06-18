package com.leetcode;

public class Leetcode_941_try1 {
	public static void main(String[] args) {
//		int arr[] = { 1, 2, 3, 4, 3, 2, 1, 0 };

//		int arr[] = {2,1};
//		int arr[] = { 3, 5, 5 };
//		int arr[] = { 0,3, 2, 1 };
		int arr[] = { 1,2,3,0 };

		System.out.println(validMountainArray(arr));
	}

	public static boolean validMountainArray(int[] arr) {
		//does not works sofar 

		int len = arr.length;
		if (len == 2)
			return false;
		int left = 0;
		int right = len - 1;

		while (left < len - 2 && right > 1 && left != right) {

			if (arr[left] < arr[left + 1]) {
				System.out.println("left:" + left);// test
				left++;
			}

			if (arr[right] < arr[right - 1]) {
				right--;
				System.out.println("right:" + right);// test
			}

//			if (right == 0 || left == len - 1) {
//				return false;
//			};
//			
//			if(right ==len-1||left ==1) {
//				return false;
//			}
////
			if(right == left  && right !=len-1&& left !=0) {
				return true ;
			}
//			if (right == 0 || left == len - 1) {
//				return false ;
//			}

		}

//		int idx = 0;
//		
//
//		int mid = 0;
//
//		while (idx < len - 1 || arr[idx] >= arr[idx + 1]) {
//
//			idx++;
//
//			System.out.println("idx: " + idx);// test
//		}
//		if (idx == arr.length - 1) {
//			return false;
//		}
//
//		mid = idx;
//		System.out.println("mid :" + mid);

		return false;
	}
}
