package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_412_try1 {

	public static void main(String[] args) {
		int n = 4;

		System.out.println(fizzBuzz(n));

	}

	public static List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList<>();

		for (int i = 1; i <= n; i++) {

			String str = Integer.toString(i);
			list.add(str);
		}

		return list;
	}
}
