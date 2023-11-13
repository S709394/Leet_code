package com.leetcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Leetcode_2409_try1 {
	public static void main(String[] args) {
		// try1 // not finished
//		String arriveAlice = "08-15", leaveAlice = "08-18", arriveBob = "08-16", leaveBob = "08-19";
		String arriveAlice = "10-01", leaveAlice = "10-31", arriveBob = "11-01", leaveBob = "12-31";
		
		System.out.println( countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob ));	
	}

	public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

		///// https://leetcode.com/problems/count-days-spent-together/solutions/2698314/java-using-standard-time-libraries/

		// The earlier date in their 2 should be the start date
		// The later date in their 2 should be the end date
		String start = arriveAlice.compareTo(arriveBob) < 0 ? arriveBob : arriveAlice;
		String end = leaveAlice.compareTo(leaveBob) < 0 ? leaveAlice : leaveBob;
		LocalDate startDate = toLocalDate(start), endDate = toLocalDate(end);

		return startDate.isAfter(endDate) ? 0 : (int) ChronoUnit.DAYS.between(startDate, endDate) +1 ;

	}

	private static LocalDate toLocalDate(String date) {
		System.out.println(  LocalDate.of(2000, Integer.parseInt(date.substring(0, 2)), Integer.parseInt(date.substring(3))));
		
		
		return LocalDate.of(2022, Integer.parseInt(date.substring(0, 2)), Integer.parseInt(date.substring(3)));

	}
}
