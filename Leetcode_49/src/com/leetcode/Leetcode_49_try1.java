/* Idea :   
 * 
 * 
 * Important  :
 * 
 * 
 * Using for hashMap to get all the values() in a List <>  format
 * for (List<String> strGroup : map.values()) {  
 * 
 * }


*/
package com.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Leetcode_49_try1 {

	public static void main(String[] args) {

	}

	static public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();

		for (String str : strs) {

			String encodeStr = encode(str);

			map.putIfAbsent(encodeStr, new LinkedList<String>());
			map.get(encodeStr).add(str);

		}

		List<List<String>> res = new LinkedList<>();
		for (List<String> strGroup : map.values()) {
			res.add(strGroup);
		}

		return res;
	}

	static String encode(String s) {
		char[] arr = new char[26];

		for (char c : s.toCharArray()) {
			arr[c - 'a']++;

		}

		return new String(arr);
	}

}
