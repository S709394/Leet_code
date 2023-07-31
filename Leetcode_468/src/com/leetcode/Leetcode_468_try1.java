package com.leetcode;

public class Leetcode_468_try1 {
	public static void main(String[] args) {
		
//		/try1  works well 
		
//		String IP = "172.16.254.1";

		// 2001:0db8:85a3:0:0:8A2E:0370:7334
		String IP = "2001:0db8:85a3:0:0:8A2E:0370:7334";
		System.out.println(validIPAddress(IP));
	}

	public static String validIPAddress(String IP) {
		
		//try1  //works well
		
		if (isIPv4(IP)) {
			return "IPv4";
		} else if (isIPv6(IP)) {
			return "IPv6";

		} else {
			return "Neither";
		}
	}

	public static boolean isIPv4(String IP) {
		String[] arr = IP.split("\\.", -1);
		for (String str : arr) {
//			System.out.println(str); // test
			try {
				if (Integer.parseInt(str) > 255 || (str.length() > 1 && str.charAt(0) == '0')) {
					return false;
				}
			} catch (NumberFormatException e) {
				return false;
			}
		}

		return arr.length == 4;

	}

	public static boolean isIPv6(String IP) {
		String[] arr = IP.split("\\:", -1);
		for (String str : arr) {
//			System.out.println(str); // test
			try {
				if (Integer.parseInt(str, 16) > 65335 || str.length() > 4) {
					return false;
				}
			} catch (NumberFormatException e) {
				return false;
			}
		}
		return arr.length == 8;
	}
}
