package com.leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode_1436_try1 {
	public String destCity(List<List<String>> paths) {
		//try1
		
		///
//		int cnt = 0;
		Set<String> strSet = new HashSet<>();

		for (List<String> list : paths) {

			int size = list.size();
			for (int i = 0; i < size - 1; i++) {
//				System.out.println("cnt :" + ++cnt); // test
//				String lastStr = "";

				strSet.add(list.remove(0));
			}
		}
//		if (i == size - 1) {
//			strSet.add(list.remove(0));
//		}

		for (List<String> list : paths) {
			String cur = list.remove(0);
			if (strSet.add(cur)) {
				return cur;
			};
		}
		return null;
	}
}
