package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Idea  : 

// Set  &&   List    

// not fast not small but   easy to read 

//Runtime
//46 ms
//Beats
//19.38%
//Memory
//70.3 MB
//Beats
//19.38%

public class Leetcode_448_try1 {
	public static void main(String[] args) {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };

	}

	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<>();
		Set <Integer> set = new HashSet<>();
		
		int n = nums.length;
		for ( int num : nums ) {
			set.add(num);
		}
		for (int i = 1 ; i <= n ; i ++) {
			if (!set.contains(i)) {
				list.add(i);
			}
		}
		
		return list;
	}
}
