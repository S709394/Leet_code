package com.leetcode;

//import java.math.BigDecimal;
//import java.math.RoundingMode;
import java.util.Arrays;

public class Leetcode_1491_try1 {
	public static void main(String[] args) {
//		double[] salary = { 4000, 3000, 1000, 2000 };
		
		//48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000
		double[] salary = {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000
				 };
		System.out.println(average(salary));
	}

	public static double average(double[] salary) {

		Arrays.sort(salary);
		int len = salary.length;

		double res = 0;

		for (int i = 1; i < len - 1; i++) {
			res += salary[i];
		}

		// edge
		if (len == 2)
			return 0;

		res = res / (len - 2);
		
//		BigDecimal  bd = new BigDecimal (res).setScale(5 ,RoundingMode.HALF_UP);
		
//		res = bd.doubleValue();
		
		return res;

	}

}
