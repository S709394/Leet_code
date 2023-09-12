package com.leetcode;


import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Leetcode_1282_try1_hashMap {
	
	 public static void main(String[] args) {
		 int [] gSize = {3,3,3,3,3,1,3};
	}
	public static List<List<Integer>> groupThePeople(int[] gSizes) {
		//https://leetcode.cn/problems/group-the-people-given-the-group-size-they-belong-to/solutions/101355/yong-hu-fen-zu-by-leetcode-solution/?envType=daily-question&envId=2023-09-11
		// fill the pos till it full 
		 Map < Integer , ArrayList <Integer> >    map = new HashMap <> () ;
		 
		 List <List <Integer>>  ans = new ArrayList <> () ;
		 
		 for (int i = 0  ;i < gSizes.length ; i ++) {
			 int cur  =  gSizes[i] ;
			 
			 
			 // the first 1
			 
			 if (!map.containsKey(cur) ) {
				 map.put(cur, new ArrayList <Integer> () );
			 }
		 }
		 
		 
	}
}
