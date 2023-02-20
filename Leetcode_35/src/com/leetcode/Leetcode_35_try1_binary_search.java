/*Idea:
 * Binary search
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
Memory Usage: 41.8 MB, less than 92.99% of Java online submissions for Search Insert Position.
 * 
 * */
package com.leetcode;

public class Leetcode_35_try1_binary_search {
	public static void main(String[] args) {
		int[] nums = { 2, 3, 5, 6 }; //demo 1 
		
//		int[] nums = { 1, 2, 3,  6  ,11,13,15,17,19}; //demo 
		int target = 1;
		System.out.println( "ans"+searchInsert(nums,target));
	}

	public static int searchInsert(int[] nums, int target) {
		int len = nums.length;
//		System.out.println(len);
		
//		if(len==0) return ;   //do not need this 
		
		
		int left = 0  , mid=  len/2 , right = len-1;
		if (nums[right]<target)  return len;
			
		
//		System.out.println(mid);
		while (left<right) {
			if(nums[mid]==target) {return mid;}
			
			
			else if(nums[mid]<target) {
				left = mid+1;
//				mid= (right-left)/2+left;
//				System.out.println("mid"+mid);
				
			}else {
				right =mid;
//				System.out.println("right"+ right);
				mid= (right-left)/2+left;
//				System.out.println("mid"+ mid);
			}
			mid= (right-left)/2+left;
//			System.out.println(mid);
		}
		return right;
		
	}
}
