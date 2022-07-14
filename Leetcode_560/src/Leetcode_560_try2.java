import java.util.HashMap;

/*
 * 560. Subarray Sum Equals K
Medium

14015

440

Add to List

Share
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

 

Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2
 

Constraints:

1 <= nums.length <= 2 * 104
-1000 <= nums[i] <= 1000
-107 <= k <= 107
*/
// Idea :   

/*  hashmap use pre-sum to find the sum of the subArray
 * 
 * 
 * https://www.youtube.com/watch?v=AmlVSNBHzJg
 * */
public class Leetcode_560_try2 {
	public static void main(String[] args) {
		int[] nums = { 1, 1, 1 };
//		int [] 	nums = {1,3,7 ,10};

		int k = 2;

		System.out.println(subarraySum(nums, k));
	}

	public static int subarraySum(int[] nums, int k) {
		
		//Are "sumOfSubArray" "counter"
		HashMap<Integer, Integer> arr_sums =new HashMap<Integer, Integer>();
		
		// pretend there is a sum == 0 before our nums , and we saw it onece 
		arr_sums.put(0, 1);
		
		
		int sum = 0 ; 
		int result = 0;
		for (int i =0 ; i < nums.length;i ++) {
			sum+= nums[i];
			
			//  (sum - k) is we are looking for  
			if(arr_sums.containsKey(sum-k)) {
				result += arr_sums.get(sum-k);
			}
			
			/*  the line is kind of like    i ++ here
			 * 
			 * if we have not seen  this "sum" key before , put it a 0
			 * 
			 *else  we get() from using "sum" key and   +1 ;
			*/
			arr_sums.put(
					sum, arr_sums.getOrDefault(sum, 0)+1   );
		}
		return result;
	}

}
