package com.stephen;

public class SomeTryAboutSplitInJava_try1 {
	public static void main(String[] args) {

//		/try1  works well 
		// IPv4 :
//		String IP = "172.16.254.1";

		// IPv6 :
		// 2001:0db8:85a3:0:0:8A2E:0370:7334
//		String IP = "2001:0db8:85a3:0:0:8A2E:0370:7334";
		
		// IPv6 invaild
		String IP = "::2001:0db8:85a3:0:0:8A2E:0370:7334";
//		System.out.println(SplitIPv4(IP));

		System.out.println(SplitIPv6(IP));
	}

	public static boolean SplitIPv4(String IP) {
		String[] arr = IP.split("\\.", -1);

		for (String str : arr) {
			System.out.println(str);
		}
		return true;
	}
	public static boolean SplitIPv6(String IP) {
		String[] arr = IP.split("\\:",-1);

		for (String str : arr) {
			System.out.println(str);
		}
		return true;
	}
}
