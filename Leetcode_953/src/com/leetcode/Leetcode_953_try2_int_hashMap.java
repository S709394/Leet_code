package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_953_try2_int_hashMap {

	// StringBuilder version  
	
	
//	Runtime
//	5 ms
//	Beats
//	5.80%
//	Memory
//	42 MB
//	Beats
//	31.44%

	public boolean isAlienSorted(String[] words, String order) {
		Map<Character, Integer> mapping = new HashMap<>();

		for (int i = 0; i < order.length(); i++) {
			mapping.put(order.charAt(i), i);
		}
		
		String [] decrypt = new String [words.length]; 
		
		for (int i = 0 ; i < words.length ; i ++) {
			StringBuilder  sb = new StringBuilder (); 
			
			for (int j = 0  ; j < words[i] .length();j++) {
				sb.append(  (char  ) ( 'a'  + mapping .get(words[i] .charAt(j) )));
			}
			
			decrypt[i] = sb.toString();
		}
		
		// Compare  the  decrypted Strings  using "String.compareTo  () "  
		for (int i = 0 ; i < decrypt.length-1 ; i ++) {
			
			if (decrypt [i]  .compareTo(decrypt[i+1]) >0) {
				return false ;
			}
		}
		return true ; 
	}
}
