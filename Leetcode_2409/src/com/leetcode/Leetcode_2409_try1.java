package com.leetcode;

import java.time.LocalDate;

public class Leetcode_2409_try1 {
	public static void main(String[] args) {
		
		//try1 // not finished 

	}

	public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
		/// https://leetcode.com/problems/count-days-spent-together/solutions/2698314/java-using-standard-time-libraries/
		String start = arriveAlice.compareTo(arriveBob) < 0 ? arriveBob : arriveAlice;
		String end = leaveAlice.compareTo(leaveBob) < 0 ? leaveAlice : leaveBob;

		LocalDate startDate = toLocalDate(start), endDate = toLocalDate(end);
		
	}

	private static LocalDate toLocalDate(String date) {
		return LocalDate.of(2022, Integer.parseInt(date.substring(0, 2)), Integer.parseInt(date.substring(3)));
	}
}
