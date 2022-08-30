package com.amazon;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*Idea : 
 * Only works when the Str t  ="lot"
 * 
 * But not Use for the "loot" 
 * */
public class Str_count_try1 {

	public static void main(String[] args) {
		// demo 01

		String strS = "lotlotloto";
		String strT = "tol";

//		// demo 02
//		 
//		 String strS = "123123565656";
//		 String strT = "356";
		int i = countMaxOperation(strS, strT);
		System.out.println(i);

	}

	static int countMaxOperation(String s, String t) {
		Set<Character> set = new HashSet<Character>();
		Map<Character, Integer> hashSet = new HashMap<Character, Integer>();

		int max = Integer.MAX_VALUE;
		int sLen = t.length();
		for (int i = 0; i < sLen; i++) {
			set.add(t.charAt(i));

		}

		for (char ch : s.toCharArray()) {
			if (set.contains(ch)) {
				hashSet.put(ch, hashSet.getOrDefault(ch, 0) + 1);
			}
			;
		}

		for (char ch : t.toCharArray()) {
//			System.out.println(ch);
//			System.out.println(hashSet.get(ch));
			max = Math.min(max, hashSet.get(ch));
		}

		return max;
	}

}
