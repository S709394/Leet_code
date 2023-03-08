package com.leetcode;

public class Leetcode_1283_try2_fromOther {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 5, 9 };
		int threshold = 6;
		System.out.println(smallestDivisor(nums, threshold));
	}

	public static int smallestDivisor(int[] nums, int threshold) {
		int left = 1;
        int right = 0;
        
        for(int num:nums){
            right = Math.max(num,right);
        }

        while(left<right){
            int mid = (right-left)/2+left;
            System.out.println("mid xxx : " + mid );
            int sum = 0;
            for(int num:nums){
            	System.out.println("num xxx : " + num );
                sum += (num+mid-1)/mid;
                System.out.println("num+mid-1:" +( num+mid-1));
                
                System.out.println("sum : " + sum );
            }
            System.out.println("mid : " + mid );
            if(sum<=threshold){
                right = mid;
            }else{
                left = mid+1;
            }
            System.out.println("right : " + right );
            System.out.println("left : " + left );
        }

        return right;
//
//yu-niang-niang
//https://leetcode.cn/problems/find-the-smallest-divisor-given-a-threshold/solution/-by-yu-niang-niang-63pj/
//LeetCode

	}
}
