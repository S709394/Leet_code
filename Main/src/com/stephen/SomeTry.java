package com.stephen;

import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;

import java.util.List;
import java.util.Set;

public class SomeTry {
	public static void main(String[] args) {
//		String[] strs = { "abc", "bce", "cae" };
//
//		int diff = strs[1].charAt(1) - strs[0].charAt(0);
//
////		System.out.println(diff);
//
//		StringBuilder sb = new StringBuilder();
//
////		sb.append('a');
////		sb.append('d');
//
//		String newString = sb.toString();
//		System.out.println(newString);
//
//		String str = "about";
//		
//		char c = str .charAt(1) ;
//		
//		System.out.println( " c is  :" +  c );

		
		//to solve this case   when the  digit at the verylast index 
		String s = "4a123B567a9";
		System.out.println(numDifferentIntegers (s));
	}

	public static int numDifferentIntegers(String word) {

		int wLen = word.length();
		boolean found = false;
		
		int curNum = 0 ;
		for (int i = 0; i < wLen; i++) {
			if (word.charAt(i) - '0' >= 0 && word.charAt(i) - '0' <= 9 ) {

				if (found == false) {
					curNum+= (word.charAt(i) -'0') ;
					found =true;
				}else {
					curNum =curNum*10 ;
					curNum +=  (word.charAt(i) -'0');
				}
				System.out.println(curNum);

			}else {
				int addNum = curNum ;
				System.out.println("add: " + addNum);
				//add
				
				curNum = 0 ;
				found=false ;
				
			}
		}
		return 999;
	}

////		Scanner reader = new Scanner (System.in);
//
////		int [] nums = {1,333,22, 1};
////		Arrays.sort(nums);
////		
//////		System.out.println(Arrays.toString(nums));
////		System.out.println(0b110);	
////		System.out.println(0b110>>3);
//		
////		 
////		
//		int k = 4;
//		int fromIndex = -4;

//		char [] c = {}; 
//		
//		String str = new String (c);
//		
//		System.out.println("str:/" +str+"/");

//		//v1.0
//		for (int i = 0 ; i < 3 ; i ++) {
//			fromIndex++;
//	         if (fromIndex < 0) {
//	            System.out.println( fromIndex);
//	         }
//		}

//		// v2.0 
//		
//		for (int i = 0 ; i < 3 ; i ++) {
//			
//	         if (fromIndex++ < 0) {
//	            System.out.println( fromIndex);
//	         }
//		}

//		// How a set - > ArrayList
//
//		Set<Integer> set = new HashSet<>();
//
//		set.add(1);
//		set.add(3);
//
////		System.out.println(set.size()); 
//
//		int[] arr = new int[set.size()];
//
//		set.toArray();
//
//		int len = 9;
//
//		System.out.println((4 * (3 - 1)) / 2);

	/// 0 , 1 , 3 , 6, 10

	// [ 0,1,2,3,4,5,6,7 ....]

//		 (0+ len )  * (len-1) / 2

	// 2 * 3 /2

	// 3 *(4 )/2
	// 4*5/2
	// 5*6 /2

//		// ( len - 1) *( len /2 + 1 ) ;
//		int l = (((9 * len) + 1) / 2);
////		System.out.println( l ) ;
//
//		System.out.println("------------");
//		int[] nums = { 1, 2, 3, 4 };
//		int sum = 0;
////		for (int i = nums.length - 1; i >= 0; i--) {
//		for (int i = 0; i < nums.length; i++) {
//			sum += nums[i];
//			if (i < nums.length - 1) {
//				sum *= 10;
//			}
//		}
//		System.out.println(sum);
//
//		String str = "123123";
//
//		int sum2 = Integer.parseInt(str);
//		
//		System.out.println(sum2);

//	public  static void myPrint(int[] arr) {
//		
//		for (int i : arr) {
//			System.out.print();
//		}
//	}
}
