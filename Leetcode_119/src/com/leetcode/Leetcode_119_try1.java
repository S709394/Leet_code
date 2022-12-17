package com.leetcode;
import java.util.List;
import java.util.ArrayList;
public class Leetcode_119_try1 {
	public static void main(String[] args) {
		System.out.println(getRow (5));
	}
	public  static List<Integer> getRow(int idx) {
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i <= idx; i++) {
			res.add(1);
			for (int j =i-1; j>0  ; j--) {
				System.out.println("j :" + j);			
				res.set(j,res.get(j-1)+res.get(j));
			}
		}
		return res;
	}
}
