package com.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Leetcode_989_try1 {
	public static void main(String[] args) {
		int[] num = { 1, 2, 0, 0 };
		int k = 34;
		System.out.println(num);
	}

	public List<Integer> addToArrayForm(int[] num, int k) {
		// base case
		if (num == null || num.length == 1 && num[0] == 0) {
			Deque<Integer> de_queA = new ArrayDeque<>();
			// return k;
			int numK = k;
			while (numK != 0) {

				de_queA.addFirst(numK % 10);
				numK = numK / 10;
				// System.out.println("numK" + numK);
			}
			return new ArrayList<Integer>(de_queA);
		}

		Deque<Integer> de_que = new ArrayDeque<>();
//		ArrayList<Integer> list = new ArrayList<>();
		int len = num.length;

		int carry = 0;

//		int num2 = k ;
		
		for (int i = len - 1; i >= 0; i--) {
			int num1 = num[i];
			System.out.println("num[i]" + num[i]);
			int n = k % 10;

			System.out.println("n:" + n);
			k = k / 10;

			System.out.println("k:" + k);

			int sum = carry + n + num1;
			System.out.println("sum:" + sum); // test
			carry = sum / 10;
			System.out.println("carry:" + carry); // test

			System.out.println("***sum%10|||" + (sum % 10));
			de_que.addFirst(sum % 10);

//			de_que.addFirst(null);

		}

		if (carry == 1) {
			de_que.addFirst(carry);
		}

		return new ArrayList<Integer>(de_que);
	}
}
