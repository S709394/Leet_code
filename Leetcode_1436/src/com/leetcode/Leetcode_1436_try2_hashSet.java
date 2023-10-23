package com.leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode_1436_try2_hashSet {
	public String destCity(List<List<String>> paths) {
		// try2
		
		int cnt = 0 ; 
		Set<String> strSet = new HashSet<>();
		for (List<String> list : paths) {
			int size = list.size();

			for (int i = 0; i < size - 1; i++) {
//				System.out.println("cnt :" + cnt++);
				strSet.add(list.remove(0));
			}

		}

		System.out.println("strSet size" + strSet.size()); //test 
		for (List<String> list : paths) {
			
			String curStr = list.remove(0);
			System.out.println("curStr:" + curStr); //test
			if (!strSet.contains(curStr)) {
				return   curStr ;
			}
//			String cur = list.remove(0);
//			if (strSet.add(cur)) {
//				return cur;
//			};
		}
		return null;
	}
}
