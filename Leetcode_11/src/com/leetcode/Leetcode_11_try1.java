/*11. Container With Most Water
Medium

17590

969

Add to List

Share
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

 

Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
 

Constraints:

n == height.length
2 <= n <= 105
0 <= height[i] <= 104
 * 
 * */

// a solution from 
//https://leetcode.com/problems/container-with-most-water/discuss/1069746/JS-Python-Java-C%2B%2B-or-2-Pointer-Solution-w-Visual-Explanation-or-beats-100
package com.leetcode;

public class Leetcode_11_try1 {
	public static void main(String[] args) {
		
	}
	
	public static int maxArea(int[] H) {
		
		//  Ans  :  the MaxArea  
        int ans= 0 , i = 0 , j = H.length-1, res=0;
        
        while (i<j) {
        	 if (H[i]<= H[j]) {
        		 res=H[i] *(j-i);
        		 i++;
        	 }else {
        		 res=H[j]*(j-i);
        		 j--;
        	 }
        	 if(res>ans) ans=res;
        }
        return ans;
    }
}
