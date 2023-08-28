//Runtime: 7 ms, faster than 78.29% of Java online submissions for Find the Duplicate Number.
//Memory Usage: 76.1 MB, less than 37.27% of Java online submissions for Find the Duplicate Number.


//No idea how it works so far 
//

/*Solving this in linear time and constant space requiresCnts Floyd's Tortoise and Hare algorithm.

It's a simple cycle detection algorithm, where one pointer traverses twice as fast as another, once two pointers meet, we can trace back to where the cycle begins.

Time complexity: , where n is the number of elements in the array

Space complexity: */
package com.leetcode;

public class Leetcode_287_try2_fastSlowPointers {
	public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        fast = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
