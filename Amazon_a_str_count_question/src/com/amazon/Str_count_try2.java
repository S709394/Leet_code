package com.amazon;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


/*Idea :  Works well better then try1
 * 
 * 
 * Able to works for the Str "loot"   (muti-chars are the same
 * 
 * 
 * hashSet.get(ch) / tHashSet.get(ch)   to fix this kind of 
 * 
 * */

public class Str_count_try2 {
	public static void main(String[] args) {
		// demo 01
		String strS = "lotlototolooooo";
		String strT = "tool";
//		// demo 02
//		 String strS = "123123565656";
//		 String strT = "356";
		int i = countMaxOperation(strS, strT);
		System.out.println(i);
	}

	static int countMaxOperation(String s, String t) {
		Set<Character> sSet = new HashSet<Character>();
//		Set<Character> tSet = new HashSet<Character>();
		Map<Character, Integer> hashSet = new HashMap<Character, Integer>();
		Map<Character, Integer> tHashSet = new HashMap<Character, Integer>();

		int max = Integer.MAX_VALUE;
		int sLen = t.length();
		for (int i = 0; i < sLen; i++) {
			sSet.add(t.charAt(i));
		}
// 2 counters
		for (char ch : s.toCharArray()) {
			if (sSet.contains(ch)) {
				hashSet.put(ch, hashSet.getOrDefault(ch, 0) + 1);
			};
		}
		for (char ch : t.toCharArray()) {
			if (sSet.contains(ch)) {
				tHashSet.put(ch, tHashSet.getOrDefault(ch, 0) + 1);
			};
		}
		for (char ch : t.toCharArray()) {
//			System.out.println(ch);
//			System.out.println(hashSet.get(ch));
			max = Math.min(max, hashSet.get(ch) / tHashSet.get(ch));
		}
		return max;
	}

}
