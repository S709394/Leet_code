package com.leetcode;

public class Leetcode_2391_try3 {
	public static void main(String[] args) {
		String[] garbage = { "G", "P", "GP", "GGM" };
		int[] travel = { 2, 4, 3 };
		
		System.out.println(garbageCollection  (garbage,travel) );
	}

	public static int garbageCollection(String[] garbage, int[] travel) {
		// try3
		
		// G dwwwP M 's last index
		int gIdx = -1, pIdx = -1, mIdx = -1;

		for (int i = garbage.length-1; i >=0 ; i--) {
			String s = garbage[i];

			for (int j =0; j < s.length(); j++) {
				if (gIdx == -1 && s.charAt(j) == 'G') {
					gIdx = i;
//					System.out.println( "g : " + gIdx );
				}
				if (pIdx == -1 && s.charAt(j) == 'P') {
					pIdx = i;
//					System.out.println( "p : " + pIdx );
				}
				if (mIdx == -1 && s.charAt(j) == 'M') {
					mIdx = i;
//					System.out.println( "m : " + mIdx );
				}
			}

		}

		int sum = 0;

		for (int i = 0; i < gIdx; i++) {
			sum += travel[i];
		}
		for (int i = 0; i < pIdx; i++) {
			sum += travel[i];
		}
		for (int i = 0; i < mIdx; i++) {
			sum += travel[i];
		}
			
		int len = 0;
		for (int i = 0; i < garbage.length; i++) {
			len += garbage[i].length();
		}

		return sum + len;

	}
}
