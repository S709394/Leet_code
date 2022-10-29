//Runtime: 6 ms, faster than 99.59% of Java online submissions for Group Anagrams.
//Memory Usage: 46.1 MB, less than 87.36% of Java online submissions for Group Anagrams.

package com.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Leetcode_49_try3_hashMap_practise {
	static public List<List<String>> groupAnagrams(String[] strs) {
		Map <String , List<String>>  hashMap = new HashMap <> () ;
		
		for (String s : strs) {
			String encodeStr =  encode (s) ;
			
			hashMap.putIfAbsent(encodeStr,new LinkedList<String> ());
			hashMap .get(encodeStr).add(s);
			
		}
		
		List<List<String>> res = new LinkedList <> ();
		for  (List<String>  group : hashMap.values()) {
			res .add(group);
		}
		
		return res ;
		
	}
	static String  encode(String s ) {
		char []   array = new char [26] ; 
		
		for (char c : s.toCharArray()) {
			
			array [c-'a'] ++;
		}
		
		return new String (array);
	}
	
}
