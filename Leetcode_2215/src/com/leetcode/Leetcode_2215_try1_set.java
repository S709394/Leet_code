////Runtime
//14 ms
//Beats
//86.80%
//Memory
//43.3 MB
//Beats
//85%

package com.leetcode;

import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Leetcode_2215_try1_set {
	public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

		Set<Integer> setA = new HashSet<>();

		for (int num : nums1) {
			setA.add(num);
		}
//		return new ArrayList<List<Integer>>();

		Set<Integer> setB = new HashSet<>();
		
		Set<Integer> resB = new HashSet<>();

		for (int num : nums2) {
			setB.add(num);

			if (!setA.contains(num)) {
				resB.add(num);
			}
		}
		Set<Integer> resA = new HashSet<>();
		for (int num : setA) {

			if (!setB.contains(num)) {
				resA.add(num);
			}
		}
//		int sizeA = setA.size(), sizeB = setA.size();
		ArrayList<Integer> listA = new ArrayList<>(resA), listB = new ArrayList<>(resB);
		List<List<Integer>> res = new ArrayList<> () ;
		res.add(listA);
		res.add(listB);
		return res ;
	}
}
