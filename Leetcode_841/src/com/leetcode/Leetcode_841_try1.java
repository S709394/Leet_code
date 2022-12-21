package com.leetcode;

import java.util.List;
import java.util.HashSet;


//Runtime
//3 ms
//Beats
//56.74%
//Memory
//45.2 MB
//Beats
//17.45%
public class Leetcode_841_try1 {

	public boolean canVisitAllRooms(List<List<Integer>> rooms) {

		

//		 helper(rooms, 0, new HashSet<Integer>());

		return helper(rooms, 0, new HashSet<Integer>()); 
	}

	public static boolean  helper(List<List<Integer>> rooms, int roomKey, HashSet<Integer> seen) {
		seen.add(roomKey);
		
		List<Integer> keysInRoom =  rooms.get(roomKey);
		//should we check if keys exit 
		for ( int key : keysInRoom) {
//			seen.add(key);
			if(!seen .contains(key)) {
				helper (rooms , key,seen);
			}
			
		}
		
		return seen.size()==rooms.size();
	}
}
