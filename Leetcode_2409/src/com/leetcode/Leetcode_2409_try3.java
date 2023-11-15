package com.leetcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Leetcode_2409_try3 {
	public static void main(String[] args) {
		// try1 // not finished
//		String arriveAlice = "08-15", leaveAlice = "08-18", arriveBob = "08-16", leaveBob = "08-19";
		String arriveAlice = "10-01", leaveAlice = "10-31", arriveBob = "11-01", leaveBob = "12-31";

		System.out.println(countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
	}

	public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
		// 1 using compare to to get the start date and the end date

		// start should be the late one , end should be the early one

		// 2 using LocalDate in java / start date and end date // toLocalDate()

		// 3 return is the start date if after the endDate ? yes return 0
		// using ChronoUnit.DAYS.between ( startD , endD )

	}
	/// the method need a String of Date and return a LocalDate and

	public static LocalDate toLocalDate(String date) {
		// return a locateDate of ( year , month(string ) , day (string ) , useing sub
		// string //2022 y is normal ;
		// using Integer.parseInt (

	}

}
