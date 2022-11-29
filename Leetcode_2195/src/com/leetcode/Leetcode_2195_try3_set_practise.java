package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_2195_try3_set_practise {
	public static void main(String[] args) {

		
		
		// Steps:
		
		// nums  = { 5, 6 };   k =5
		// 
		// fullArray :   {1,2,3,4,5,6, 7}
		
		//  sum the  from  (1 ~k)    using the fomula
		
		//   using set to minus  the num in nums  one by one 
		//   cnt for  count how many  num has been minus 
		//  Last ,  need to add cnt 
		
		
		int[] nums = { 5, 6 };
		int k = 5;
		
//		int[] nums = { 1, 4, 25, 10, 25 };		
////	[5,6]
//	int k = 2;
		System.out.println(minimalKSum(nums, k));
	}

	public static long minimalKSum(int[] nums, int k) {
		
		//{1,2,3,4,5}
		long res = (1L + k) * k / 2;

		int nextNum = k + 1;

		Set<Integer> set = new HashSet<Integer>();

		int cnt = 0;
		
		
		//{ 5 ,6 }    ,   need to   -=  5 
//							
		//cnt will become 1 
		for (int num : nums) {
			
			//  6  > k   so do not in here , we do not count it 
			if (set.add(num) && num <= k) {
				res -= num;
				cnt++;
			}
		}
		
		
		//after that we need to at 
		while (cnt > 0) {
			while (set.contains(nextNum)) {
				nextNum++;
			}

			res += nextNum;

			nextNum++;

			cnt--;
		}
		return res;
	}

}
