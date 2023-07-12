package com.leetcode;

public class Leetcode_2520_try1 {
	
	public static void main(String[] args) {
		
		int num =121 ;
		System.out.println(countDigits (num));
	}
	public static int countDigits(int num) {
       return  cnt (num) ;
    }
    public static int cnt(int num) {
        int cnt = 0 ;
		// int regNum = num;
int regNum = num ;
		while (num >= 1) {

			int div = num % 10;
//			System.out.println("div : "+div);//test
			if (regNum %div == 0)
				cnt++ ;
			// if (regNum % div != 0) {
			// 	return false;
			// }
			num /= 10;
//			System.out.println(num);//test 

		}
		return cnt;

	}
}
