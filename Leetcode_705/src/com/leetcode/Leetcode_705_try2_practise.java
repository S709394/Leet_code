package com.leetcode;

public class Leetcode_705_try2_practise {
	class MyHashSet {
		//try2
//		0 <= key <= 106
//				At most 104 calls will be made to add, remove, and contains.
		int size = 1000001;
		boolean boolArr  [] ;
		public MyHashSet() {
			boolArr  = new boolean [size];
		}

		public void add(int key) {
			boolArr [key] = true;
		}

		public void remove(int key) {
			boolArr [key] = false;
		}

		public boolean contains(int key) {
			return boolArr[key];
		}
	}
}
