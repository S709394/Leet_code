package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode_2215_try2_set_ArrayList {
	public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		Set<Integer> setA = new HashSet<Integer>();
		Set<Integer> setB = new HashSet<Integer>();

		List<Integer> listNotInA = new ArrayList<Integer>();
		List<Integer> listNotInB = new ArrayList<Integer>();

		for (int i : nums1) {
			setA.add(i);
		}

		for (int i : nums2) {
			setB.add(i);

			if (!setA.contains(i)) {
				listNotInA.add(i);
			}
		}

		for (int i : nums1) {
			if (!setB.contains(i)) {
				listNotInB.add(i);
			}
		}

		List<List<Integer>> listOfList = new ArrayList<>();
		listOfList.add(listNotInB);
		listOfList.add(listNotInA);
		
//		Set<Integer> setB = new HashSet<Integer>()

		return listOfList;

	}
}
