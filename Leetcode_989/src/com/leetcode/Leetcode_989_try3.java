//idea : https://leetcode.com/problems/add-to-array-form-of-integer/solutions/1777035/java-solution-optimal-and-simple/

///Runtime
//6 ms
//Beats
//86.23%
//Memory
//63.1 MB
package com.leetcode;

import java.util.LinkedList;
import java.util.List;

//
public class Leetcode_989_try3 {

	public List<Integer> addToArrayForm(int[] num, int k) {

		LinkedList<Integer> ll = new LinkedList<>();
//		for (int i = 0 ; i < num.length ; i++) {
//		int carry = 0;

		int idx = num.length - 1;

//		for (int i = num.length-1;i>=0 ; i --) {

		while (idx >= 0 || k > 0) {
			
			if (idx >= 0) {
				k+= num[idx] ;
				idx--;
			}
			ll.addFirst(k % 10);
//			
			k /= 10;
			
		}

		return ll;
	}

}
