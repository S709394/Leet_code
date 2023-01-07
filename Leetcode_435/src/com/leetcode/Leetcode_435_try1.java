package com.leetcode;

import java.util.Arrays;

public class Leetcode_435_try1 {
	public int eraseOverlapIntervals(int[][] intervals) {

		Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

		int curBig = intervals[0][1];
		int cnt = 0;
		for (int i = 1; i < intervals.length; i++) {
			if (intervals[i][0] < curBig) {

				cnt++;

			}else {
				curBig = intervals[i][1];
			}
			
		}
		return cnt ; 
	}
}
