/*
 * 
 * 219. Contains Duplicate II
Easy

2540

1913

Add to List

Share
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

 

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
0 <= k <= 105
 * */
/*Idea  :
 * Use  hashmap 
 * 
 * containKey()
 * get()
 * 
 * put
 * 
 * 
 * */
package com.leetcode;

import java.util.HashMap;

public class Leetcode_219_try1 {
	public static void main(String[] args) {
		int [] nums = {1,2,3,1};
		System.out.println(containsNearbyDuplicate(nums,3));
	}
	
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		
		//Hasmap make sure   the  1.0 works
        HashMap<Integer,Integer>  hm= new HashMap<Integer, Integer>();
        for (int i = 0 ;i <nums.length;i++) {
        	if (hm.containsKey(nums[i])==true){
        		
//        		System.out.println("hm.containsKey(nums[i])==true"); // test  the number shows more than onces
        		//
        		if(i-hm.get(nums[i])<=k) {
        			///
        			
        			return true;
        		}
        	}
        	
        	
        	//1.0 if that number do not exits , than put (add) it in hm   
        	
        	//1.1  example :  
        	//[1,0,1,1]
        	//1
        	//
        	//It will always return 2, because map.put(nums[i], i);will update (nums[i],0) from (1,0) to (1,2)
        	
        	
        	hm.put(nums[i],i);
        	
        	System.out.println("hm length" +hm.size());//test 
        }
        return false;
    }
}
