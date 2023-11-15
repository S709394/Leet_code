package com.leetcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Leetcode_2409_try2 {
	public static void main(String[] args) {
		// try1 // not finished
//		String arriveAlice = "08-15", leaveAlice = "08-18", arriveBob = "08-16", leaveBob = "08-19";
		String arriveAlice = "10-01", leaveAlice = "10-31", arriveBob = "11-01", leaveBob = "12-31";

		System.out.println(countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
	}

	public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
		// 1 using compare to to get the start date and the end date

		String start = arriveAlice.compareTo(arriveBob) < 0 ? arriveBob : arriveAlice;
		String end = leaveAlice.compareTo(leaveBob) < 0 ? leaveAlice : leaveBob;

		// 2 using LocalDate in java / start date and end date // toLocalDate()
		LocalDate startDate = toLocalDate(start);
		LocalDate endDate = toLocalDate(end);
		
		// 3 return is the start date if after the endDate ? yes return 0
		// using ChronoUnit.DAYS.between ( startD , endD )
		return startDate.isAfter(endDate) ? 0 : (int) ChronoUnit.DAYS.between(startDate, endDate) + 1;
	}
	/// the method need a String of Date and return a LocalDate and

	public static LocalDate toLocalDate(String date) {
		// return a locateDate of ( year , month(string ) , day (string ) , useing sub
		// string //2022 y is normal ;
		// using Integer.parseInt (
		return LocalDate.of(2022, Integer.parseInt(date.substring(0, 2)), Integer.parseInt(date.substring(3)));
	}

	// 3

//	//public static void main(String[] args) {
//	// try1 // not finished
////	String arriveAlice = "08-15", leaveAlice = "08-18", arriveBob = "08-16", leaveBob = "08-19";
//	String arriveAlice = "10-01", leaveAlice = "10-31", arriveBob = "11-01", leaveBob = "12-31";
//
//	System.out.println(countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
//}
//
//public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
//	// 1 using compare to to get the start date and the end date
//
//	// 2 using LocalDate in java / start date and end date //
//
//	// 3 return is the start date if after the endDate ? yes return 0
//}
//
///// the method need a String of Date and return a LocalDate and
//
//public static LocalDate toLocalDate(String date) {
//	// return a locateDate of ( year , month(string ) , day (string ) , useing sub
//	// string
//}
}
