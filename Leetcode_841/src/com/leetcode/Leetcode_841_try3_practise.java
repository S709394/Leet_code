package com.leetcode;

import java.util.HashSet;
import java.util.List;


//Runtime
//3 ms
//Beats
//56.74%
//Memory
//45.2 MB
//Beats
//13.77%
public class Leetcode_841_try3_practise {
	public boolean canVisitAllRooms(List<List<Integer>> rooms) {
		return helper (rooms , 0 , new HashSet <> () );
	}
//	  helper()
	static boolean   helper (List<List<Integer>> rooms , int keyForARoom , HashSet <Integer> seenKeys  ) {
		seenKeys.add(keyForARoom);
		for (int key : rooms.get(keyForARoom)) {
			if (!seenKeys.contains(key)) {
				helper (rooms, key , seenKeys);
				
			}
		}
			return seenKeys.size()==rooms.size();
	}
}
