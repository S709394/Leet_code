package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_412_try1 {

	// looks not good : (
	public static void main(String[] args) {
		int n = 15;

		System.out.println(fizzBuzz(n));

	}

	public static List<String> fizzBuzz(int n) {

		//works 
		        //Runtime
		// 1 ms
		// Beats
		// 99.98%
		// Memory
		// 43.4 MB
		// Beats
		// 69.11%
		        List<String> list = new ArrayList<>();

				for (int i = 1; i <= n; i++) {
					// System.out.println(" i : " + i);
					
		             if (i % 5 != 0&& i % 3 != 0) {
						String str = Integer.toString(i);
						list.add(str);
					}else {
		                if (i % 5 == 0 && i % 3 == 0) {
							list.add("FizzBuzz");

						}else {
						if (i % 5 == 0) {

							list.add("Buzz");
						}
						if (i % 3 == 0) {

							list.add("Fizz");

						}}
					// }
		            }

					// if (i % 5 == 0 || i % 3 == 0) {
						
		           

				}

				return list;
	}
}
