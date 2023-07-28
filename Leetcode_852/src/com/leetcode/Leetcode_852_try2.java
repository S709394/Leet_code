package com.leetcode;

public class Leetcode_852_try2 {
	public static void main(String[] args) {
		//try2
//		int[] arr = { 0, 1, 2, 0 };   
		int[] arr = { 0, 1, 5,2 ,1, 0 };
		System.out.println(peakIndexInMountainArray(arr));
	}

	public static int peakIndexInMountainArray(int[] arr) {
		
		//tr2
		int  n = arr.length ;
		
		int left = 0  , right = n-1;
//		if(arr[right ] )
		
		while (left <right ) {
			int mid = left + (right -left ) /2;
			System.out.println("left :" + left + " /right : " + right + "  mid: " + mid);

			if(arr[mid]> arr [mid+1]) {
//				System.out.println("r :");
				right = mid  ;
				
			}else {
//				System.out.println("l :");
				left  = mid+1;
			}
 			
		}
		return left ;
	}

}
