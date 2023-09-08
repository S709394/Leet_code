package com.leetcode;

import java.util.List;
import java.util.ArrayList;

//Runtime
//0 ms
//Beats
//100%
//Memory
//39.9 MB
//Beats
//92.31%
public class Leetcode_118_try2 {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(generate(n));
	}
	public static List<List<Integer>> generate(int n) {
		List<List<Integer>> ll = new ArrayList<>();

//		Total 'n'  row 
		for (int i = 0; i < n; i++) {
			List<Integer> list = new ArrayList<>(); 
			// loop  for     'i' times
			for (int j = 0; j < i + 1; j++) {
				if (j == 0 || j == i) {
					list.add(1);
				} else {
					list.add(ll.get(i - 1).get(j - 1) + ll.get(i - 1).get(j));
				}
			}
			ll.add(list);//
		}
		return ll;
	}
}
