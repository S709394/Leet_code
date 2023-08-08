package com.leetcode;

public class Leetcode_33_try3_practise {
	 public int search(int[] nums, int target) {
		 
		 //try3 
         
	       if (nums== null || nums.length==0) {
				  return -1;
			  }
			  
			  int left = 0 ; int right = nums.length-1;
			  
			  while (left<right) {
				  int midPoint = left +  (right -left)/2;
				  
				  if (nums[midPoint]>nums[right]) {
					  left =midPoint+1;
				  }else {
					  right = midPoint;
				  }
				  
			  }
			  
			  int start = left ; 
			  left = 0 ; 
			  right = nums.length-1;
			  
			  
			  if ( target > nums[right]) {
				  right = start-1;
			  }else {
				  left= start;
			  }
			  
			  //2nd binary search
			  
			  
			  while (left<=right) { //wrong
				  
				  int midPoint = left +  (right -left)/2;
				  
//				  //my try  1.0
//				  if (target>=nums[midPoint]) {
//					  left=midPoint;
//				  }else {
//					  right= midPoint-1;
//				  }
				  
				  // better 2.0
				  if (target==nums[midPoint]) {
					  return midPoint;
				  }else  if (target>nums[midPoint]) {
					  left=midPoint+1;
				  }else {
					  right= midPoint-1;
				  }
				 
				  
				  
			  }
			  
			  
//			  while(nums[left] <= nums[right]) {
//				  
//			  }
//			  
			  return -1;
			  
	    }
}
