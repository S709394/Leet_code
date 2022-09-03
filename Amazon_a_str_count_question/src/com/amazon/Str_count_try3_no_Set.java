package com.amazon;

import java.util.HashMap;
import java.util.Map;

public class Str_count_try3_no_Set {
	public static void main(String[] args) {
		// demo 01
		String strS = "lotlototoloo";
		String strT = "tool";
//		// demo 02
//		 String strS = "3335656565";
//		 String strT = "356";
//		// demo 03
//		 String strS = "abcabc";
//		 String strT = "abc";
		int i = countMaxOperation(strS, strT);
//		System.out.println("ans");
		System.out.println(i);
	}

	static int countMaxOperation(String s, String t) {
		Map<Character, Integer> sHashSet = new HashMap<Character, Integer>();
		Map<Character, Integer> tHashSet = new HashMap<Character, Integer>();
		int max = Integer.MAX_VALUE;

		for (char ch : t.toCharArray()) {
			tHashSet.put(ch, tHashSet.getOrDefault(ch, 0) + 1);
//			System.out.println("tHashSet.get:" + tHashSet.get(ch));
		}
//		System.out.println(tHashSet.size());

		for (char ch : s.toCharArray()) {
			if (tHashSet.containsKey(ch)) {
				sHashSet.put(ch, sHashSet.getOrDefault(ch, 0) + 1);
//				System.out.println("+1s");
//				System.out.println("sHashSet.get:" + sHashSet.get(ch) + "\n ch: "+ ch);
			}
			;
		}

		for (char ch : t.toCharArray()) {
//			System.out.println(ch);
//			System.out.println(hashSet.get(ch));
//			System.out.println("max:" +max);

			max = Math.min(max, sHashSet.get(ch) / tHashSet.get(ch));

		}
		return max;
	}
}
