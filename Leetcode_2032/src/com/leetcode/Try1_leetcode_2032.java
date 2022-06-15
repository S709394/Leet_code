/*
 * 2032. Two Out of Three
Easy

302

28

Add to List

Share
Given three integer arrays nums1, nums2, and nums3, return a distinct array containing all the values that are present in at least two out of the three arrays. You may return the values in any order.
 

Example 1:

Input: nums1 = [1,1,3,2], nums2 = [2,3], nums3 = [3]
Output: [3,2]
Explanation: The values that are present in at least two arrays are:
- 3, in all three arrays.
- 2, in nums1 and nums2.
Example 2:

Input: nums1 = [3,1], nums2 = [2,3], nums3 = [1,2]
Output: [2,3,1]
Explanation: The values that are present in at least two arrays are:
- 2, in nums2 and nums3.
- 3, in nums1 and nums2.
- 1, in nums1 and nums3.
Example 3:

Input: nums1 = [1,2,2], nums2 = [4,3,3], nums3 = [5]
Output: []
Explanation: No value is present in at least two arrays.
 

Constraints:

1 <= nums1.length, nums2.length, nums3.length <= 100
1 <= nums1[i], nums2[j], nums3[k] <= 100*/

/*Idea  :  HashSet   
 * 
 * use for each loop
 * contains ()  and  add ()
 *  */
package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Try1_leetcode_2032 {
	
	public static void main(String[] args) {
		
	}
	
	public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set <Integer> set1=new HashSet<>(), 
        		set2=new HashSet<>(), 
        		set3=new HashSet<>(), 
        		set=new HashSet<>();
        
        
        
        for  (int num : nums1 ) {set1.add(num); set.add(num);};
        for  (int num : nums2 ) {set2.add(num);set.add(num);};
        for  (int num : nums3 ) {set3.add(num);set.add(num);};
        
        
        //2 out if 3
        List <Integer> result=  new ArrayList<Integer>();
        for (int num : set) {
        	if (set1.contains(num)&&set2.contains(num)||set1.contains(num)&&set3.contains(num)||set3.contains(num)&&set2.contains(num)) {
        		result.add(num);
        	}
        }
		return result;
    }
	
}
