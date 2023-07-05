package com.leetcode;

import java.util.Arrays;

public class Leetcode_859_try1 {
	public static void main(String[] args) {
//		String s = "bac";
		String s = "aaa";

		String goal = "abc";
		System.out.println(buddyStrings(s, goal));
	}

	public static boolean buddyStrings(String s, String goal) {
		
		int sLen = s.length();
		int goalLen = goal.length();
		if (sLen != goalLen)
			return false;
		char[][] diffs = new char[3][2];
		
//		Arrays.fill(diffs[1], 'A');
		
//		System.out.println("aaa: "  + diffs [0] [0]); //test 
		for (int l = 0; l < 3; l++) {
			Arrays.fill(diffs[l], 'A');
//			System.out.println("bbb: "  + diffs [l] [1]); //test 
			
		}
		
//		System.out.println("aaa: "  + diffs [0] [0]); //test 
		for (int i = 0; i < sLen; i++) {

			// all lower case
//			System.out.println( "i:" +i);
			int idx = 0;
			if (s.charAt(i) != goal.charAt(i)) {
				diffs[i][0] = s.charAt(i);

//				System.out.println(s.charAt(i));//test
				diffs[i][1] = goal.charAt(i);
//				System.out.println(goal.charAt(i)); //test 
				idx++;
				
			}
			if (idx > 2) {
				break;
			}
//			System.out.println("diffs :"  +  diffs [2][0]);//test
/// 
//			for (int j = 0; j < 2; j++) {
//				for (int k = 0; k < 3; k++) {
//					System.out.println(diffs[j][k]);
//				}
//			}

		}

		if (diffs[0][0] == 'A'||diffs[2][0] != 'A' || diffs[2][1] != 'A') {
			
			if(diffs[0][0]  == diffs[0][1]  && diffs[1][0]== diffs[1][1]  ) {
				return true ;
			}
			return false;
		}

		if (diffs[0][0] == diffs[1][1] && diffs[0][1] == diffs[1][0]) {
			return true;
		}

		// will reach this or not
		return false;
	}
}
