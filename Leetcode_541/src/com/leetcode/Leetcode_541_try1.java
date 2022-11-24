//works well now 

package com.leetcode;

public class Leetcode_541_try1 {
	public static void main(String[] args) {

//		String str = "aabbcccc";
//		String str = "aabbccccaabbc";

		String str = "aab00ccccceeaffggggg1123";
		int k = 5;
		
//		String str = "aa00ccccppffgggg";
//		int k = 4;
//		
//		String str = "aa00aac";
		
//		String str = "abcdefg";
//		
//		String str = "abccabb";
//		int k =2 ; 
		
		
//		String str = "abcdefg";
		
//		String str = "aasccc";
//		int k = 5;

		char[] arr = str.toCharArray();
//		partReverse(0, 2, arr);

//		System.out.println(arr);
		System.out.println(str);
		System.out.println(reverseStr( str,  k));
		
		
	}

	public static String reverseStr(String s, int k) {
		int len = s.length();
		System.out.println("len:" +len);

		int muti = len / (2 * k);
		char[] cArr = s.toCharArray(); 

		for (int i = 0; i < muti * 2 * k-1; i += 2 * k) {

//			partReverse(i, k-1, cArr); //wrong
			partReverse(i, i+k-1, cArr); //wrong
			System.out.println( "k-1:" + (k-1));  //

		}

//		int zeroIdxOfLastPart = (muti-1) * 2 * k ;

		int zeroIdxOfLastPart = muti* 2 * k ;
		System.out.println("muti" + muti);
		
		int lastIdxToReverse;
		if (len - zeroIdxOfLastPart > k) {
			System.out.println(">>>"); //test
			lastIdxToReverse = zeroIdxOfLastPart + k-1;
		}else {
			lastIdxToReverse= len-1;
		}
		partReverse(zeroIdxOfLastPart, lastIdxToReverse, cArr);
//
//		System.out.println("zeroIdxOfLastPart:" +zeroIdxOfLastPart); //test
//		System.out.println("lastIdxToReverse:" +lastIdxToReverse); //test

//		for (int i = zeroIdxOfLastPart ; (i<  zeroIdxOfLastPart + k) && i<len ;  i++) {
//			i++;
//		}
		return new String (cArr);
	}

	public static void partReverse(int i, int j, char[] cArr) {
		System.out.println("i / j :" + "||" + i + "|| "+ j);
//		int len = s.length();
//		char [] cArr = s.toCharArray();
		char temp;

		while (i < j) {
			temp = cArr[i];
//			System.out.println(   "temp:" +temp  );
			cArr[i] = cArr[j];
//			System.out.println(   cArr[i]   );
			cArr[j] = temp;
			System.out.println(    cArr[j] + "/n" );
			i++;
			j--;
		}

	}
}
