/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */


//Runtime: 17 ms, faster than 90.64% of Java online submissions for First Bad Version.
//Memory Usage: 38.7 MB, less than 98.42% of Java online submissions for First Bad Version.
package com.leetcode;

public class Leetcode_278_binary_search_try1 {
	public int firstBadVersion(int n) {
        int left = 1  , right = n , ans = -1;
        
        while (left<=right){
            int mid = left + (right-left)/2;
            if(isBadVersion(mid)){
                right = mid-1;
            }else{
                left=mid+1;
            }
            ans=left;
        }
        return ans;
    }
}
