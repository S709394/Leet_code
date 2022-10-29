package com.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Leetcode_49_try2_hashMap_practise {
	static public List<List<String>> groupAnagrams(String[] strs) {
		Map  <String , List<String>>  map = new HashMap <>();
		
		for (String s : strs) {
			String encodeStr = encode (s);
			
			map.putIfAbsent(encodeStr,new LinkedList<> () );
			
			map.get(encodeStr).add(s);
			
		}
		List<List<String>> res = new LinkedList<> ();
		
		for (List <String>  group: map.values()) {
			res.add( new LinkedList<String> (group));
		}
		return res ;
		
	}
	
	static String  encode(String s ) {
		char [] arr= new char [26];
		
		for (char c  :s .toCharArray()) {
			arr[c-'a']++;
		}
		return new String (arr);
	}
}
