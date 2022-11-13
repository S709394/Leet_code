/// does not works  int the biggggg  number  
// for exampe  [ 9,9,9,9,9,9,9,9,9,9,9,9,9]    and k =1

package com.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Leetcode_989_try2 {
	public static void main(String[] args) {
		int[] num = { 1, 2, 0, 0 };
		int k = 34;
		System.out.println(num);
	}

	public List<Integer> addToArrayForm(int[] num, int k) {
		int numA = 0;
		
		for (int i = 0 ; i < num.length-1; i++) {
			numA+=num[i];
			if(i<num.length-1) {
				numA *=10;
			}
			
		}
		int sum = numA + k ;
		System.out.println("sum" + sum ); //test 
		
		Deque <Integer> de_que = new ArrayDeque <> () ;
		
		while (sum>0) {
			de_que.addFirst(sum%10);
			sum/=10;
		}
		
		return new ArrayList <Integer> (de_que); 
		
	}
}
