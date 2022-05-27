package try1_349;

import java.util.HashSet;
import java.util.Set;

/*
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.

 

Constraints:

    1 <= nums1.length, nums2.length <= 1000
    0 <= nums1[i], nums2[i] <= 1000


 * */

/*note  
 * 
 * HashSet     // not   ordered
 * 
 * add ()    ;  contains() ;
 * 
 * 
 * */
public class Solution {
	public static void main(String[] args) {
//		nums1 = [1,2,2,1];
//		nums2 = [2,2];		
	}
	
	public static int[] intersection(int[] nums1, int[] nums2) {
        
		Set <Integer>  set1 = new HashSet <>();
		
		for  (int value : nums1 )
		{
			 set1.add(value);
		}
		Set <Integer>  set2 = new HashSet <>();
		
		for  (int value : nums2 )
		{
			 if (set1.contains (value)) {
				 set2.add(value);
			 }
		}
		
		int [] result =  new int [set2.size()];
//		for (int i = 0 ; i<set2.size() ; i++) {
//			result [i]= 
//		}
		
		int pos =0;
		for (int value : set2) {
			result[ pos++]= value;
		}			
		return  result;
    }
}
